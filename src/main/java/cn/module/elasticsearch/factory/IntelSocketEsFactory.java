package cn.module.elasticsearch.factory;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import static cn.module.elasticsearch.util.EsConstants.ELASTICSEARCH_CONFIG_ADDRESSES;
import static cn.module.elasticsearch.util.EsConstants.ELASTICSEARCH_PROPS_ADDRESS;


public class IntelSocketEsFactory extends BaseEsFactory {


    private Client client;

    public Client getClient() {
        return client;
    }

    private static volatile IntelSocketEsFactory instance;

    public static IntelSocketEsFactory getInstance(String esConfigFile) {
        if (instance == null) {
            synchronized (IntelSocketEsFactory.class) {
                if (instance == null) {
                    instance = new IntelSocketEsFactory(esConfigFile);
                }
            }
        }
        return instance;
    }


    public IntelSocketEsFactory(String esConfigFile) {
        super(esConfigFile);
        init();
    }


    @Override
    protected void init() {
        Settings settings = getSettings();
        List<TransportAddress> transportAddresses = getTransportAddresses();
        try {
            if (settings != null || transportAddresses != null) {

                TransportAddress[] array = null;
                for (TransportAddress transportAddress : transportAddresses) {
                    //transportClient.addTransportAddress(transportAddress);
                    array = transportAddresses.toArray(new TransportAddress[transportAddresses.size()]);
                }
                TransportClient transportClient = TransportClient.builder()
                        .settings(settings)
                        .build()
                        .addTransportAddresses(array);

                client = transportClient;
            } else {
                client = null;
            }
        } catch (Exception ex) {

        }
    }

    @Override
    protected String getConfigFile() {
        return ELASTICSEARCH_PROPS_ADDRESS;
    }

    @Override
    protected List<TransportAddress> getTransportAddresses() {
        String addresses = prop.getString(ELASTICSEARCH_CONFIG_ADDRESSES);

        List<TransportAddress> transportAddressList = new ArrayList<TransportAddress>();

        for (String address : addresses.split("[;,]")) {
            String[] ss = address.split("[:/]");
            if (ss.length >= 2) {
                try {
                    transportAddressList.add(new InetSocketTransportAddress(InetAddress.getByName(ss[0]), Integer.parseInt(ss[1])));
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
            }
        }

        return transportAddressList;

    }


}
