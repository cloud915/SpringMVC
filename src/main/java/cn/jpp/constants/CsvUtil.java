package cn.jpp.constants;


import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRq;
import cn.module.elasticsearch.accessor.model.RequestMessageEntity;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CsvUtil {
    private String fileName = null;
    private BufferedReader br = null;
    private List<String> list = new ArrayList<String>();
    private List<SSP_AvailabilitysQueryRq> result = new ArrayList<SSP_AvailabilitysQueryRq>();

    public CsvUtil() {

    }

    public CsvUtil(String fileName) throws Exception {
        this.fileName = fileName;
        br = new BufferedReader(new FileReader(fileName));
        String stemp;
        while ((stemp = br.readLine()) != null) {
            list.add(stemp);
        }
    }

    public List getList() {
        return list;
    }

    public List<SSP_AvailabilitysQueryRq> getRqList() {

        int rowNum = getRowNum();
        int colNum = getColNum();
        for (int i = 0; i < rowNum; i++) {
            SSP_AvailabilitysQueryRq rq = new SSP_AvailabilitysQueryRq();

            rq.setPms_Code(getString(i, 0));
            rq.setHotel_Code(getString(i, 1));
            rq.setRoom_Type_Code(getString(i, 2));
            rq.setRate_Plan_Code(getString(i, 3));
            rq.setActive_DateTime(Long.parseLong(getString(i, 4)));
            rq.setCheck_Avail_DateTime(Long.parseLong(getString(i, 5)));
            result.add(rq);
        }

        return result;
    }

    public List<SSP_AvailabilitysQueryRq> read(String fileName, String pms_Code) throws IOException {
        //生成CsvReader对象，以，为分隔符，GBK编码方式
        CsvReader r = new CsvReader(fileName, ',', Charset.forName("UTF-8"));
        //读取表头
        r.readHeaders();
        //逐条读取记录，直至读完
        while (r.readRecord()) {
            SSP_AvailabilitysQueryRq rq = new SSP_AvailabilitysQueryRq();
            //读取一条记录
            System.out.println(r.getRawRecord());
            //按列名读取这条记录的值
            rq.setPms_Code(pms_Code);
            rq.setHotel_Code(r.get("hotel_code"));
            rq.setRate_Plan_Code(r.get("rate_plan_code"));
            rq.setRoom_Type_Code(r.get("room_type"));
            rq.setActive_DateTime(Long.parseLong(r.get("SEARCH_START_DATE1")));
            rq.setCheck_Avail_DateTime(Long.parseLong(r.get("in_date1")));

            result.add(rq);
        }
        r.close();

        return result;
    }

    public void write(String fileName, String pms_Code, List<SSP_AvailabilitysQueryRq> list) throws IOException {
        CsvWriter wr = new CsvWriter(fileName, ',', Charset.forName("GBK"));
        //String[] contents = {"Lily", "五一", "90", "女"};
        String[] title = {"PmsCode", "HotelCode", "RatePlanCode", "RoomTypeCode", "入住时间", "可订下发时间",
                "可订前推送房态", "可订前推送房态时间", "可订前房态消息处理状态",
                "可订后推送房态", "可订后推送房态时间", "可订后房态消息处理状态",
                "最后一次推送房态", "最后一次推送房态时间", "最后一次房态消息处理状态"};
        try {
            wr.writeRecord(title);

            for (SSP_AvailabilitysQueryRq tmp : list) {
                String[] contents = new String[title.length];
                contents[0] = tmp.getPms_Code();
                contents[1] = tmp.getHotel_Code();
                contents[2] = tmp.getRate_Plan_Code();
                contents[3] = tmp.getRoom_Type_Code();
                contents[4] = DateTimeUtil.format(tmp.getActive_DateTime(), "yyyy-MM-dd");
                contents[5] = DateTimeUtil.format(tmp.getCheck_Avail_DateTime(), "yyyy-MM-dd HH:mm:ss");
                contents[6] = tmp.getRoom_Status_B() == null ? "" : tmp.getRoom_Status_B();
                contents[7] = DateTimeUtil.format(tmp.getProcessed_DataTime_B(), "yyyy-MM-dd HH:mm:ss");
                contents[8] = tmp.getStatus_B() == null ? "" : tmp.getStatus_B();
                contents[9] = tmp.getRoom_Status_A() == null ? "" : tmp.getRoom_Status_A();
                contents[10] = DateTimeUtil.format(tmp.getProcessed_DataTime_A(), "yyyy-MM-dd HH:mm:ss");
                contents[11] = tmp.getStatus_A() == null ? "" : tmp.getStatus_A();
                contents[12] = tmp.getRoom_Status_L() == null ? "" : tmp.getRoom_Status_L();
                contents[13] = DateTimeUtil.format(tmp.getProcessed_DataTime_L(), "yyyy-MM-dd HH:mm:ss");
                contents[14] = tmp.getStatus_L() == null ? "" : tmp.getStatus_L();

                wr.writeRecord(contents);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            wr.close();
        }

    }

    public void writeOTAErrors(String fileName, Map<String, List<RequestMessageEntity>> resultMap) throws IOException {
        CsvWriter wr = new CsvWriter(fileName, ',', Charset.forName("GBK"));
        String[] title = {"推送时间", "消息类型", "HotelCode", "RoomTyepCode", "RatePlanCode", "Type", "Message", "UniqueID"};
        try {
            wr.writeRecord(title);
            Iterator iter = resultMap.keySet().iterator();
            while (iter.hasNext()) {
                String uniqueID = (String) iter.next();
                List<RequestMessageEntity> obj = resultMap.get(uniqueID);
                for (RequestMessageEntity tmp : obj) {
                    String[] contents = new String[title.length];
                    contents[0] = DateTimeUtil.format(tmp.getRequestTime(), "yyyy-MM-dd HH:mm:ss");
                    contents[1] = tmp.getAriType();
                    contents[2] = tmp.getHotelCode();
                    contents[3] = tmp.getRoomTypeCode();
                    contents[4] = tmp.getRatePlanCode();
                    contents[5] = tmp.getType();
                    contents[6] = tmp.getMessage();
                    contents[7] = uniqueID;
                    wr.writeRecord(contents);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            wr.close();
        }

    }

    /**
     * 获取行数
     *
     * @return
     */
    public int getRowNum() {
        return list.size();
    }

    /**
     * 获取列数
     *
     * @return
     */
    public int getColNum() {
        if (!list.toString().equals("[]")) {
            if (list.get(0).toString().contains(",")) {// csv为逗号分隔文件
                return list.get(0).toString().split(",").length;
            } else if (list.get(0).toString().trim().length() != 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    /**
     * 获取制定行
     *
     * @param index
     * @return
     */
    public String getRow(int index) {
        if (this.list.size() != 0) {
            return (String) list.get(index);
        } else {
            return null;
        }
    }

    /**
     * 获取指定列
     *
     * @param index
     * @return
     */
    public String getCol(int index) {
        if (this.getColNum() == 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        String tmp = null;
        int colnum = this.getColNum();
        if (colnum > 1) {
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                tmp = it.next().toString();
                sb = sb.append(tmp.split(",")[index] + ",");
            }
        } else {
            for (Iterator it = list.iterator(); it.hasNext(); ) {
                tmp = it.next().toString();
                sb = sb.append(tmp + ",");
            }
        }
        String str = new String(sb.toString());
        str = str.substring(0, str.length() - 1);
        return str;
    }

    /**
     * 获取某个单元格
     *
     * @param row
     * @param col
     * @return
     */
    public String getString(int row, int col) {
        String temp = null;
        int colnum = this.getColNum();
        if (colnum > 1) {
            temp = list.get(row).toString().split(",")[col];
        } else if (colnum == 1) {
            temp = list.get(row).toString();
        } else {
            temp = null;
        }
        return temp;
    }

    public void CsvClose() throws Exception {
        this.br.close();
    }

    public static void main(String[] args) throws Exception {
        CsvUtil util = new CsvUtil("D:\\demo.csv");
        int rowNum = util.getRowNum();
        int colNum = util.getColNum();
        String x = util.getRow(2);
        String y = util.getCol(2);
        System.out.println("rowNum:" + rowNum);
        System.out.println("colNum:" + colNum);
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        for (int i = 1; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.println("result[" + i + "|" + j + "]:" + util.getString(i, j));
            }
        }

    }
}