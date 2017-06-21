package cn.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class CustomProperties extends Properties {
	private static final long serialVersionUID = 1L;
	
	public Boolean getBoolean(String key){
		String value = getProperty(key);
		if (value == null || "".equals(value)) {
			return null;
		} else {
			return Boolean.parseBoolean(getProperty(key));
		}
	}
	public Boolean getBoolean(String key, Boolean defaultValue){
		Boolean value = getBoolean(key) ;
		return value == null ? defaultValue : value;
	}
	public String getString(String key){
		return getProperty(key);
	}
	public String getString(String key, String defaultValue){
		return getProperty(key, defaultValue);
	}
	public Integer getInt(String key){
		String value = getProperty(key);
		if (value == null || "".equals(value)) {
			return null;
		} else {
			return Integer.valueOf(getProperty(key));
		}
	}
	public Integer getInt(String key, Integer defaultValue){
		Integer value = getInt(key) ;
		return value == null ? defaultValue : value;
	}
	public Long getLong(String key){
		String value = getProperty(key);
		if (value == null || "".equals(value)) {
			return null;
		} else {
			return Long.parseLong(getProperty(key));
		}
	}
	public Long getLong(String key, Long defaultValue){
		Long value = getLong(key) ;
		return value == null ? defaultValue : value;
	}
	public Float getFloat(String key){
		String value = getProperty(key);
		if (value == null || "".equals(value)) {
			return null;
		} else {
			return Float.parseFloat(getProperty(key));
		}
	}
	public Float getFloat(String key, Float defaultValue){
		Float value = getFloat(key) ;
		return value == null ? defaultValue : value;
	}
	public List<String> getPmsCode(String pmsKey){
		if(pmsKey ==null || "".equals(pmsKey)){
			return null;
		}
		List<String> pmsList = new ArrayList<String>();
		String pmsCode = getProperty(pmsKey);
		String[] pmsArray = pmsCode.split(",");
		for(String pms:pmsArray){
			pmsList.add(pms);
		}
		return pmsList;
	}

}
