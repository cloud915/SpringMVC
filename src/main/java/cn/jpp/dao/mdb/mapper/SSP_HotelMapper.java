package cn.jpp.dao.mdb.mapper;

import cn.jpp.entity.SSP_HotelEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SSP_HotelMapper {

    /**
     *根据条件获取所有酒店的数量
     */
    public Integer getHotelCount(@Param(value = "pmsCode") String pmsCode,
                                 @Param(value = "hotelCode") String hotelCode);

    /**
     * 根据条件获取所有酒店信息列表(分页)
     * @return
     */
    public List<SSP_HotelEntity> getSspHotelListByPage(@Param(value = "pageStart") Integer pageStart,
                                                       @Param(value = "pageSize") Integer pageSize,
                                                       @Param(value = "hotelCode") String hotelCode,
                                                       @Param(value = "pmsCode") String pmsCode);
}


