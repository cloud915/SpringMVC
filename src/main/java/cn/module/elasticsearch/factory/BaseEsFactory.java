package cn.module.elasticsearch.factory;


import cn.common.utils.ConfigUtil;
import cn.common.utils.CustomProperties;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;

import java.util.List;
import static cn.module.elasticsearch.util.EsConstants.ELASTICSEARCH_CONFIG_CLUSTER;

public abstract class BaseEsFactory {

    protected CustomProperties prop;

    protected abstract String getConfigFile();

    protected abstract void init();

    protected abstract List<TransportAddress> getTransportAddresses();

    public BaseEsFactory(String esConfigFile) {
        prop = ConfigUtil.getProperties(esConfigFile);
    }

    protected Settings getSettings() {
        Settings settings = Settings.settingsBuilder()
                .put("cluster.name", prop.getString(ELASTICSEARCH_CONFIG_CLUSTER))
                .put("client.transport.ping_timeout", "30s")
                .build();

        return settings;
    }


}
