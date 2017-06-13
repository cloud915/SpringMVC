package cn.jpp.constants;


import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRq;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
            rq.setRoom_Type_Code(r.get("room_type"));
            rq.setRate_Plan_Code(r.get("rate_plan_code"));
            rq.setActive_DateTime(Long.parseLong(r.get("active")));
            rq.setCheck_Avail_DateTime(Long.parseLong(r.get("received")));


            result.add(rq);
        }
        r.close();

        return result;
    }

    public void write(String fileName, String pms_Code, String[] contents) throws IOException {
        CsvWriter wr = new CsvWriter(fileName, ',', Charset.forName("UTF-8"));
        //String[] contents = {"Lily", "五一", "90", "女"};
        wr.writeRecord(contents);
        wr.close();
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