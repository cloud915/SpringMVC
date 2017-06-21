package cn.module.controller;

import cn.common.utils.DateTimeUtil;
import cn.contract.factory.JAXBFactory;
import cn.contract.ota.ctrip.ari.OTAHotelAvailNotifRQ;
import cn.contract.ota.ctrip.ari.OTAHotelRateAmountNotifRQ;
import cn.jpp.constants.CsvUtil;
import cn.module.cache.FileIndexAccessor;
import cn.module.elasticsearch.accessor.ClusterEsAccessor;
import cn.module.elasticsearch.accessor.model.QueueRequestEntity;
import cn.module.elasticsearch.accessor.model.RequestMessageEntity;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.util.*;

/**
 * Created by Administrator on 2017/6/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class EsController {
    //String _index_Name = "v2-job-queue-request-2017.06";
    //String _type_Name = "logs";
    String _index_Name = "ssp-v1-queue-request-2017-06-21";
    String _type_Name = "ssp-v1-queue-request-message";


    private static final String filePath = "D:\\QQFile\\queueResultErrors\\";
    private static final String outputName = filePath + DateTimeUtil.format(System.currentTimeMillis(), "yyyyMMdd_HHmm") + "_results.csv";


    @Test
    public void readErrorRS() {
        JAXBFactory.getInstance().init();

        FileIndexAccessor elasticsearchAccessor = ClusterEsAccessor.getInstance("elasticsearch");
        if (elasticsearchAccessor == null) {
            System.out.println("elasticsearchAccessor is null");
            return;
        }

        String rangeField = "body.requestTime";
        Long rangeBeginDate = 1497974400000L;

        List<String> uniqueIDs = readErrorMessageMark(elasticsearchAccessor, rangeField, rangeBeginDate);

        Map<String, List<RequestMessageEntity>> resultMap = readMessage(elasticsearchAccessor, uniqueIDs, rangeField, rangeBeginDate);

        printFile(resultMap);

    }

    public List<String> readErrorMessageMark(FileIndexAccessor elasticsearchAccessor, String rangeField, Long rangeBeginDate) {
        HashMap<String, String> searchMap = new HashMap<String, String>();

        searchMap.put("body.requestLogType", "RS");
        searchMap.put("body.requestMessage", "Errors");

        //searchMap.put("body.requestMessage", "24612629");

        List<String> uniqueIDs = new ArrayList<String>();

        try {
            //HashMap<String, String> hashMap = elasticsearchAccessor.search(_index_Name, _type_Name, searchMap, 0, 10000);
            HashMap<String, String> hashMap = elasticsearchAccessor.searchRange(_index_Name, _type_Name, searchMap, 0, 10000, rangeField, rangeBeginDate);
            Iterator iter = hashMap.keySet().iterator();
            while (iter.hasNext()) {
                String keyVersion = (String) iter.next();
                String obj = hashMap.get(keyVersion);

                QueueRequestEntity entity = JSON.parseObject(hashMap.get(keyVersion), QueueRequestEntity.class);
                if (entity.getBody().getRequestMark() == null || "".equals(entity.getBody().getRequestMark())) {
                    continue;
                }
                uniqueIDs.add(entity.getBody().getRequestMark());
                System.out.println(obj);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return uniqueIDs;
    }

    public Map<String, List<RequestMessageEntity>> readMessage(FileIndexAccessor elasticsearchAccessor, List<String> uniqueIDs, String rangeField, Long rangeBeginDate) {
        Map<String, List<RequestMessageEntity>> resultMap = new HashMap<String, List<RequestMessageEntity>>();
        HashMap<String, String> searchMap = new HashMap<String, String>();

        try {
            //searchMap.put("body.requestLogType", "RQ");

            for (String uniqueID : uniqueIDs) {
                if (resultMap.get(uniqueID) == null) {
                    resultMap.put(uniqueID, new ArrayList<RequestMessageEntity>());
                }

                searchMap.put("body.requestMark", "\"" + uniqueID + "\"");
                HashMap<String, String> hashMap = elasticsearchAccessor.search(_index_Name, _type_Name, searchMap, 0, 10);
                //HashMap<String, String> hashMap = elasticsearchAccessor.searchRange(_index_Name, _type_Name, searchMap, 0, 10, rangeField, rangeBeginDate);

                Iterator iter = hashMap.keySet().iterator();
                while (iter.hasNext()) {
                    String keyVersion = (String) iter.next();
                    String obj = hashMap.get(keyVersion);
                    try {
                        QueueRequestEntity entity = JSON.parseObject(hashMap.get(keyVersion), QueueRequestEntity.class);
                        RequestMessageEntity res = new RequestMessageEntity();
                        res.setMessage(entity.getBody().getRequestMessage());
                        res.setRequestTime(entity.getBody().getRequestTime());

                        if (entity.getBody().getRequestMessage().contains("RQ")) {
                            res.setType("RQ");
                            unSerializer(entity.getBody().getRequestMessage(), res);
                        } else if (entity.getBody().getRequestMessage().contains("RS")) {
                            res.setType("RS");
                        } else if (entity.getBody().getRequestMessage().contains("Request ")) {
                            res.setType("RQ");
                        } else if (entity.getBody().getRequestMessage().contains("RequestResponse ")) {
                            res.setType("RS");
                        }
                        resultMap.get(uniqueID).add(res);
                        System.out.println("process one.");
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return resultMap;
    }

    public void unSerializer(String requestMessage, RequestMessageEntity res) throws JAXBException {

        if (requestMessage.contains("OTA_HotelRateAmountNotifRQ")) {
            res.setAriType("房价");
            OTAHotelRateAmountNotifRQ rq = (OTAHotelRateAmountNotifRQ) JAXBFactory.getInstance().getUnmarshaller().unmarshal(new StringReader(requestMessage));
            res.setHotelCode(rq.getRateAmountMessages().getHotelCode());
            res.setRoomTypeCode(rq.getRateAmountMessages().getRateAmountMessage().get(0).getStatusApplicationControl().getInvTypeCode());
            res.setRatePlanCode(rq.getRateAmountMessages().getRateAmountMessage().get(0).getStatusApplicationControl().getRatePlanCode());
        } else if (requestMessage.contains("OTA_HotelAvailNotifRQ")) {
            res.setAriType("房态");
            OTAHotelAvailNotifRQ rq = (OTAHotelAvailNotifRQ) JAXBFactory.getInstance().getUnmarshaller().unmarshal(new StringReader(requestMessage));
            res.setHotelCode(rq.getAvailStatusMessages().getHotelCode());
            res.setRoomTypeCode(rq.getAvailStatusMessages().getAvailStatusMessage().get(0).getStatusApplicationControl().getInvTypeCode());
            res.setRatePlanCode(rq.getAvailStatusMessages().getAvailStatusMessage().get(0).getStatusApplicationControl().getRatePlanCode());
        }

    }

    public void printFile(Map<String, List<RequestMessageEntity>> resultMap) {
        System.out.println("output file name:" + outputName);
        CsvUtil csvUtil = null;
        try {
            csvUtil = new CsvUtil();
            csvUtil.writeOTAErrors(outputName, resultMap);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
