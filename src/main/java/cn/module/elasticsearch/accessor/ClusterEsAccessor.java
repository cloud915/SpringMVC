package cn.module.elasticsearch.accessor;


import cn.common.utils.ConfigUtil;
import cn.module.elasticsearch.accessor.base.BaseEsAccessor;
import cn.module.elasticsearch.factory.IntelSocketEsFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterEsAccessor extends BaseEsAccessor {

	private static final Logger logger = LoggerFactory.getLogger(ClusterEsAccessor.class);
    //private static Logger logger = LoggerFactory.getLogger(ConfigConstants.pipelineLoggerName);
    private static volatile ClusterEsAccessor instance;

    public static ClusterEsAccessor getInstance(String esConfigFile) {
        if (instance == null) {
            synchronized (IntelSocketEsFactory.class) {
                if (instance == null) {
                	try{
                		instance = new ClusterEsAccessor(esConfigFile);
                        //prop = ConfigUtil.getProperties(esConfigFile);
                	}catch(Exception e){
                        logger.error("failed to init ES Accessor", e);
                	}
                }
            }
        }
        return instance;
    }

    public ClusterEsAccessor(String esConfigFile) {
        super(IntelSocketEsFactory.getInstance(esConfigFile).getClient(),esConfigFile);
    }
}
