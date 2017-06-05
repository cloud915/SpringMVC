package cn.jpp.dao.mdb.mapper;

import cn.jpp.entity.Hotel_Rate_PlanEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Hotel_RatePlanMapper {

    public List<Hotel_Rate_PlanEntity> getHotelRatePlanListByHotelIdList(@Param(value = "list") List<Long> list);
}
