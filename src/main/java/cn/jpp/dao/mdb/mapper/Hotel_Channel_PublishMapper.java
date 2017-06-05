package cn.jpp.dao.mdb.mapper;

import cn.jpp.entity.Hotel_Channel_PublishEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Hotel_Channel_PublishMapper {

    public Integer getPublishCount(@Param("pmsCode") String pmsCode);


    public List<Hotel_Channel_PublishEntity> getHotelChannelPublishListByPage(@Param(value = "hotelId") Long hotelId,
                                                                              @Param(value = "pageStart") Integer pageStart,
                                                                              @Param(value = "pageSize") Integer pageSize);

    public List<Hotel_Channel_PublishEntity> getHotelChannelPublishListByHotelIdList(@Param(value = "list")List<Long> list);
}
