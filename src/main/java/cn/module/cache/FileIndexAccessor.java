package cn.module.cache;

import java.util.HashMap;
import java.util.Map;

public interface FileIndexAccessor<R,T,K> {
    public R indexExist(String index);
    public void indexDelete(String index);

    public R index(String index, String documentType, T entity);

    public R update(String index, String documentType, Long version, String key, T entity, HashMap<String, String> searchMap, K compareValue);

    public R delete(String index, String documentType, String key);

    public R get(String index, String documentType, String key);

    public R multiGet(String index, String documentType, String... keys);

    public HashMap<R, R> search(String index, String documentType, Map<String, String> searchMap, int from, int size);
    HashMap<R, R> searchRange(String index, String documentType, Map<String, String> searchMap, int from, int size, String timeField, Long beginDate);
}