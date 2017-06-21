package cn.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigUtil {

	private static final Logger log = LoggerFactory.getLogger(ConfigUtil.class);
	private static final String DEFAULT_PROPS = "config";
	private static Map<String, CustomProperties> propMap = new ConcurrentHashMap<String, CustomProperties>();

	/**
	 * it's used to get default props config.properties in classpath
	 * @return
	*/
	public static CustomProperties getDefaultProperties() {
		CustomProperties prop = propMap.get(DEFAULT_PROPS);
		if (prop != null) {
			return prop;
		}
		return load(DEFAULT_PROPS);
	}
	public static CustomProperties getProperties(String name) {
		CustomProperties prop = propMap.get(name);
		if (prop != null) {
			return prop;
		}
		return load(name);
	}

	private static CustomProperties load(String name) {

		if (!propMap.containsKey(name)) {
			synchronized (name) {
				if (!propMap.containsKey(name)){
					CustomProperties props = new CustomProperties();
					InputStream in_ = ConfigUtil.class.getClassLoader().getResourceAsStream(name + ".properties");
					try {
						props.load(in_);
					} catch (IOException e) {
						log.error("error occurred when to load properties:" + name, e);
					}

					propMap.put(name, props);
				}
			}
		}
		return propMap.get(name);
	}

}
