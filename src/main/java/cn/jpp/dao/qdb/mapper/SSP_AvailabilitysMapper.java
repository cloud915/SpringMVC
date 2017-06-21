package cn.jpp.dao.qdb.mapper;

import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRq;
import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRs;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2017/6/13.
 */
public interface SSP_AvailabilitysMapper {

    //public SSP_AvailabilitysQueryRs getHotelCount(@Param(value = "SSP_AvailabilitysQueryRq") SSP_AvailabilitysQueryRq entity);

    public SSP_AvailabilitysQueryRs getBeforeAvailOfCheck(@Param(value = "pms_Code")String pms_Code,
                                                          @Param(value = "hotel_Code")String hotel_Code,
                                                          @Param(value = "room_Type_Code")String room_Type_Code,
                                                          @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                          @Param(value = "active_DateTime")Long active_DateTime,
                                                          @Param(value = "limit_DateTime")Long limit_DateTime,
                                                          @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);

    public SSP_AvailabilitysQueryRs getAfterAvailOfCheck(@Param(value = "pms_Code")String pms_Code,
                                                         @Param(value = "hotel_Code")String hotel_Code,
                                                         @Param(value = "room_Type_Code")String room_Type_Code,
                                                         @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                         @Param(value = "active_DateTime")Long active_DateTime,
                                                         @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);

    public SSP_AvailabilitysQueryRs getLastAvailOfCheck(@Param(value = "pms_Code")String pms_Code,
                                                        @Param(value = "hotel_Code")String hotel_Code,
                                                        @Param(value = "room_Type_Code")String room_Type_Code,
                                                        @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                        @Param(value = "active_DateTime")Long active_DateTime,
                                                        @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);

    public SSP_AvailabilitysQueryRs getBeforeAvailOfCheck2(@Param(value = "pms_Code")String pms_Code,
                                                          @Param(value = "hotel_Code")String hotel_Code,
                                                          @Param(value = "room_Type_Code")String room_Type_Code,
                                                          @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                          @Param(value = "active_DateTime")Long active_DateTime,
                                                          @Param(value = "limit_DateTime")Long limit_DateTime,
                                                          @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);

    public SSP_AvailabilitysQueryRs getAfterAvailOfCheck2(@Param(value = "pms_Code")String pms_Code,
                                                         @Param(value = "hotel_Code")String hotel_Code,
                                                         @Param(value = "room_Type_Code")String room_Type_Code,
                                                         @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                         @Param(value = "active_DateTime")Long active_DateTime,
                                                         @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);

    public SSP_AvailabilitysQueryRs getLastAvailOfCheck2(@Param(value = "pms_Code")String pms_Code,
                                                        @Param(value = "hotel_Code")String hotel_Code,
                                                        @Param(value = "room_Type_Code")String room_Type_Code,
                                                        @Param(value = "rate_Plan_Code")String rate_Plan_Code,
                                                        @Param(value = "active_DateTime")Long active_DateTime,
                                                        @Param(value = "check_Avail_DateTime")Long check_Avail_DateTime);
}
