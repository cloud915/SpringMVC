package cn.jpp.controller;

import cn.jpp.entity.Hotel_Channel_PublishEntity;
import cn.jpp.service.Hotel_Channel_PublishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Map;

/**
 * Created by hygeng on 2017/5/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/spring-context.xml")
public class PuhlishController {

    @Autowired
    @Qualifier("hotel_Channel_PublishService")
    Hotel_Channel_PublishService hotelChannelPublishService;
    private final static String pmsCode = "RuJia";
    private final static String path = "D:\\software\\java dev\\Program Files\\jmeter\\aliyun\\20170601\\";
    private final static String availFN = path + "avail.csv";
    private final static String rateFN = path + "rate.csv";
    private final static String invFN = path + "inv.csv";

    @Test
    public void read() {
        List<Hotel_Channel_PublishEntity> list = hotelChannelPublishService.receive(10000);

        System.out.println("------begin------");
        for (Hotel_Channel_PublishEntity tmp : list) {
            // pmsCode,hotelCode,roomTypeCode,ratePlanCode
            System.out.println(tmp.getHotel_Code() + "," + tmp.getRoom_Type_Code() + "," + tmp.getRate_Plan_Code());
        }
        System.out.println("------end------");
    }

    @Test
    public void init() {
        Map<String, List<Hotel_Channel_PublishEntity>> map = hotelChannelPublishService.receive(pmsCode, 1000);

        if (map.size() == 0) {
            System.out.println("------map is empty------");
            return;
        } else {
            System.out.println("------map size:" + map.size() + "------");
        }
        System.out.println("------avail begin------");
        for (Map.Entry<String, List<Hotel_Channel_PublishEntity>> entry : map.entrySet()) {
            String key = entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            for (Hotel_Channel_PublishEntity tmp : entry.getValue()) {
                sb.append("," + tmp.getChannel_Code() + "," + tmp.getRoom_Type_Code() + "," + tmp.getRate_Plan_Code());
            }
            print(availFN, sb.toString());
            //System.out.println(sb.toString());
        }
        System.out.println("------avail end------");

        System.out.println("=========================================================");

        System.out.println("------rate begin------");
        for (Map.Entry<String, List<Hotel_Channel_PublishEntity>> entry : map.entrySet()) {
            String key = entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            for (Hotel_Channel_PublishEntity tmp : entry.getValue()) {
                sb.append("," + tmp.getRoom_Type_Code() + "," + tmp.getRate_Plan_Code());
            }
            print(rateFN, sb.toString());
            //System.out.println(sb.toString());
        }
        System.out.println("------rate end------");

        System.out.println("=========================================================");

        System.out.println("------inv begin------");
        for (Map.Entry<String, List<Hotel_Channel_PublishEntity>> entry : map.entrySet()) {
            String key = entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(key);
            for (Hotel_Channel_PublishEntity tmp : entry.getValue()) {
                sb.append("," + tmp.getRoom_Type_Code());
            }
            print(invFN, sb.toString());
            //System.out.println(sb.toString());
        }
        System.out.println("------inv end------");
    }


    private void print(String fileName, String content) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileName, true)));
            out.write(content + "\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
