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
        try {
            SSP_AvailabilitysQueryRs responseB = sspAvailabilitysMapper.getBeforeAvailOfCheck2(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), (System.currentTimeMillis() - 86400000), request.getCheck_Avail_DateTime());

            SSP_AvailabilitysQueryRs responseA = sspAvailabilitysMapper.getAfterAvailOfCheck2(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), request.getCheck_Avail_DateTime());

            SSP_AvailabilitysQueryRs responseL = sspAvailabilitysMapper.getLastAvailOfCheck2(request.getPms_Code(), request.getHotel_Code(), request.getRoom_Type_Code(), request.getRate_Plan_Code(), request.getActive_DateTime(), request.getCheck_Avail_DateTime());

            System.out.println("query time:" + System.currentTimeMillis());
            if (responseB != null) {
                request.setRoom_Status_B(responseB.getRoom_Status());
                request.setProcessed_DataTime_B(responseB.getProcessed_datetime());
                request.setStatus_B(responseB.getStatus());
            }
            if (responseA != null) {
                request.setRoom_Status_A(responseA.getRoom_Status());
                request.setProcessed_DataTime_A(responseA.getProcessed_datetime());
                request.setStatus_A(responseA.getStatus());
            }
            if (responseL != null) {
                request.setRoom_Status_L(responseL.getRoom_Status());
                request.setProcessed_DataTime_L(responseL.getProcessed_datetime());
                request.setStatus_L(responseL.getStatus());
            }
            return request;
        } catch (Exception ex) {
            return null;
        }
    }

}
