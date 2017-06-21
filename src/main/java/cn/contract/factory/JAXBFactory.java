package cn.contract.factory;

import cn.contract.ota.ctrip.ari.OTAHotelAvailNotifRQ;
import cn.contract.ota.ctrip.ari.OTAHotelRateAmountNotifRQ;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBFactory {
    //private static final Logger log = LoggerFactory.getLogger(JAXBFactory.class);
    //private static final NormalLog log = NormalLog.getInstance();

    private JAXBContext jc;

    private JAXBFactory() {
    }

    public static JAXBFactory getInstance() {
        return SingletonHolder.instance;
    }

    public void init() {
        Class<?>[] clazz = {
                OTAHotelRateAmountNotifRQ.class, OTAHotelAvailNotifRQ.class,
        };
        try {
            jc = JAXBContext.newInstance(clazz);

        } catch (JAXBException e) {
            //log.error("JAXBFactory.init error", e);
        }
    }

    public Unmarshaller getUnmarshaller() throws JAXBException {
        return jc.createUnmarshaller();
    }

    public Marshaller getMarshaller() throws JAXBException {
        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        return marshaller;
    }

    private static class SingletonHolder {
        private static final JAXBFactory instance = new JAXBFactory();
    }
}
