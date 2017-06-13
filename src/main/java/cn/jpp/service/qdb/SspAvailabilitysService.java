package cn.jpp.service.qdb;

import cn.jpp.dao.qdb.mapper.SSP_AvailabilitysMapper;
import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRq;
import cn.jpp.entity.qdb.SSP_AvailabilitysQueryRs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/6/13.
 */
@Component("sspAvailabilitysService")
public class SspAvailabilitysService {
    @Autowired
    SSP_AvailabilitysMapper sspAvailabilitysMapper;

    public SSP_AvailabilitysQueryRq process(SSP_AvailabilitysQueryRq request) {

        SSP_AvailabilitysQueryRs responseB = sspAvailabilitysMapper.getBeforeAvailOfCheck(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), request.getCheck_Avail_DateTime());

        SSP_AvailabilitysQueryRs responseA = sspAvailabilitysMapper.getAfterAvailOfCheck(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), request.getCheck_Avail_DateTime());

        SSP_AvailabilitysQueryRs responseL = sspAvailabilitysMapper.getLastAvailOfCheck(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), request.getCheck_Avail_DateTime());

        if (responseB != null) {
            request.setRoom_Status_B(responseB.getRoom_Status());
            request.setProcessed_DataTime_B(responseB.getProcessed_datetime());
        }
        if (responseA != null) {
            request.setRoom_Status_A(responseA.getRoom_Status());
            request.setProcessed_DataTime_A(responseA.getProcessed_datetime());
        }
        if (responseL != null) {
            request.setRoom_Status_L(responseL.getRoom_Status());
            request.setProcessed_DataTime_L(responseL.getProcessed_datetime());
        }
        return request;
    }

}
