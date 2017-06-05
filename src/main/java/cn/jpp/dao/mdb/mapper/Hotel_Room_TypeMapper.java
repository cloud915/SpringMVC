package cn.jpp.dao.mdb.mapper;


import cn.jpp.entity.Hotel_Room_TypeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Hotel_Room_TypeMapper {
  
    public List<Hotel_Room_TypeEntity> getHotelRoomTypeListByHotelIdList(@Param(value = "list") List<Long> list);

}
