package cn.jpp.controller;

import cn.jpp.constants.CsvUtil;
import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRq;
import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRs;
import cn.jpp.service.qdb.SspAvailabilitysService;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class AvailController {
    @Autowired
    @Qualifier("sspAvailabilitysService")
    SspAvailabilitysService hotelChannelPublishService;

    @Test
    public void checkBefore() {
        CsvUtil csvUtil = null;
        String fileName = "D:\\QQFile\\3.csv";
        String pmsCode = "BT";
        try {
            csvUtil = new CsvUtil("D:\\QQFile\\3.csv");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            List<SSP_AvailabilitysQueryRq> list = csvUtil.read(fileName, pmsCode);
            List<SSP_AvailabilitysQueryRq> results=new ArrayList<SSP_AvailabilitysQueryRq>();
            int a = 0;
            for (SSP_AvailabilitysQueryRq tmp : list) {
                try {
                    SSP_AvailabilitysQueryRq response=  hotelChannelPublishService.process(tmp);
                    results.add(response);
                    a++;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            String ss = JSON.toJSONString(results);

            int b = 0;
            //csvUtil.write(fileName,"BT",);

        } catch (IOException e) {
            e.printStackTrace();
        }


//        String pms_Code = "BT";
//        String hotel_Code = "BoTao_1855";
//        String room_Type_Code = "220";
//        String rate_Plan_Code = "ACT00389";
//        Long active_DateTime = 1497542400000L;
//        Long check_Avail_DateTime = 1497337200000L;
//
//
//
//        SSP_AvailabilitysQueryRq request = new SSP_AvailabilitysQueryRq(pms_Code, hotel_Code, room_Type_Code,
//                rate_Plan_Code, active_DateTime, check_Avail_DateTime);
//        try {
//            hotelChannelPublishService.process(request);
//            int a = 0;
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }

    }

    public void checkAfter() {

    }
}
