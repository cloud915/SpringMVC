package cn.jpp.service;

import cn.jpp.dao.mdb.mapper.Hotel_Channel_PublishMapper;
import cn.jpp.dao.mdb.mapper.Hotel_RatePlanMapper;
import cn.jpp.dao.mdb.mapper.Hotel_Room_TypeMapper;
import cn.jpp.dao.mdb.mapper.SSP_HotelMapper;
import cn.jpp.entity.Hotel_Channel_PublishEntity;
import cn.jpp.entity.Hotel_Rate_PlanEntity;
import cn.jpp.entity.Hotel_Room_TypeEntity;
import cn.jpp.entity.SSP_HotelEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created by hygeng on 2017/5/25.
 */
@Component("hotel_Channel_PublishService")
public class Hotel_Channel_PublishService {
    @Autowired
    Hotel_Channel_PublishMapper hotelChannelPublishMapper;
    @Autowired
    SSP_HotelMapper sspHotelMapper;
    @Autowired
    Hotel_Room_TypeMapper hotelRoomTypeMapper;
    @Autowired
    Hotel_RatePlanMapper hotelRatePlanMapper;

    public List<Hotel_Channel_PublishEntity> receive(Integer pageSize) {
        List<Hotel_Channel_PublishEntity> list = new ArrayList<Hotel_Channel_PublishEntity>();
        try {
            Integer pageCount = hotelChannelPublishMapper.getPublishCount(null);
            if (pageCount > 0) {
                Integer start = 0;
                while (start < pageCount) {
                    list.addAll(hotelChannelPublishMapper.getHotelChannelPublishListByPage(null, start, pageSize));
                    start += pageSize + 1;
                }
            }
        } catch (Exception ex) {
            //logger.error("StaticMsgWrapper.getHotelFromDatabase", ex);
            list = new ArrayList<Hotel_Channel_PublishEntity>();
        }
        return list;
    }

    public Map<String, List<Hotel_Channel_PublishEntity>> receive(Long channelID, String pmsCode, Integer pageSize) {
        Map<String, List<Hotel_Channel_PublishEntity>> map = new HashMap<String, List<Hotel_Channel_PublishEntity>>();
        List<SSP_HotelEntity> hotels = new ArrayList<SSP_HotelEntity>();

        Integer pageCount = sspHotelMapper.getHotelCount(pmsCode, "");
        if (pageCount > 0) {
            Integer start = 0;
            while (start < pageCount) {
                hotels.addAll(sspHotelMapper.getSspHotelListByPage(start, pageSize, "", pmsCode));
                start += pageSize + 1;
            }
        }
        // List<Long> hotelIds=new ArrayList<Long>();
            /*for (SSP_HotelEntity hotel : hotels) {
                hotelChannelPublishMapper.getHotelChannelPublishListByPage(hotel.getID(), 0, 1000);
            }*/

        List<Long> batchList = new ArrayList<Long>();
        Map<String, String> pmsMap = new HashMap<String, String>();
        int index = 1;
        for (Iterator<SSP_HotelEntity> it = hotels.iterator(); it.hasNext(); ) {
            SSP_HotelEntity hotel = it.next();
            batchList.add(hotel.getID());
            pmsMap.put(hotel.getHotel_Code(), hotel.getPms_Code());
            if (batchList.size() >= pageSize || !it.hasNext()) {

                // rt
                List<Hotel_Room_TypeEntity> hotelRoomTypeEntityList = hotelRoomTypeMapper.getHotelRoomTypeListByHotelIdList(batchList);
                Map<String, List<String>> hotelRoomTypeMap = new HashMap<String, List<String>>();
                for (Hotel_Room_TypeEntity tmp : hotelRoomTypeEntityList) {
                    String key = tmp.getHotel_Code();

                    if (hotelRoomTypeMap.containsKey(key)) {
                        hotelRoomTypeMap.get(key).add(tmp.getRoom_Type_Code());
                    } else {
                        List<String> tmpList = new ArrayList<String>();
                        tmpList.add(tmp.getRoom_Type_Code());
                        hotelRoomTypeMap.put(key, tmpList);
                    }
                }
                // rp
                List<Hotel_Rate_PlanEntity> hotelRatePlanEntityList = hotelRatePlanMapper.getHotelRatePlanListByHotelIdList(batchList);
                Map<String, List<String>> hotelRatePlanMap = new HashMap<String, List<String>>();
                for (Hotel_Rate_PlanEntity tmp : hotelRatePlanEntityList) {
                    String key = tmp.getHotel_Code();

                    if (hotelRatePlanMap.containsKey(key)) {
                        hotelRatePlanMap.get(key).add(tmp.getRate_Plan_Code());
                    } else {
                        List<String> tmpList = new ArrayList<String>();
                        tmpList.add(tmp.getRate_Plan_Code());
                        hotelRatePlanMap.put(key, tmpList);
                    }
                }

                // publish
                long a = System.currentTimeMillis();
                List<Hotel_Channel_PublishEntity> publishlist = hotelChannelPublishMapper.getHotelChannelPublishListByHotelIdList(channelID, batchList);

                for (Hotel_Channel_PublishEntity tmp : publishlist) {
                    try {
                        if (hotelRoomTypeMap.get(tmp.getHotel_Code()) == null
                                || !hotelRoomTypeMap.get(tmp.getHotel_Code()).contains(tmp.getRoom_Type_Code())
                                || hotelRatePlanMap.get(tmp.getHotel_Code()) == null
                                || !hotelRatePlanMap.get(tmp.getHotel_Code()).contains(tmp.getRate_Plan_Code())) {
                            continue;
                        }
                        String key = pmsMap.get(tmp.getHotel_Code()) + "," + tmp.getHotel_Code();

                        if (map.containsKey(key)) {
                            map.get(key).add(tmp);
                        } else {
                            List<Hotel_Channel_PublishEntity> tmpList = new ArrayList<Hotel_Channel_PublishEntity>();
                            tmpList.add(tmp);
                            map.put(key, tmpList);
                        }

                    } catch (Exception ex) {
                        //map = new HashMap<String, List<Hotel_Channel_PublishEntity>>();
                    }
                }

                System.out.println("[static " + (index++) + "] read batch publish msg use:" + (System.currentTimeMillis() - a) + " ms");
                batchList.clear();
            }
        }

        return map;
    }

}
