package com.ydy.config;

import com.google.common.collect.Maps;
import com.ydy.utils.StringUtils;

import java.util.Map;

/**
 * 全局配置类
 * @author ydy
 * Create By ydy on 2018/4/23
 */
public class Global {
    /**
     * 当前对象实例
     */
    private static Global global = new Global();

    /**
     * 保存全局属性值
     */
    private static Map<String, String> map = Maps.newHashMap();

    private static PropertiesLoader loader = new PropertiesLoader("ydy.properties");

     /**
      * 获取当前对象实例
	  */
    public static Global getInstance() {
        return global;
    }

    /**
     * 获取配置
     * @param key
     * @return
     */
    public static String getConfig(String key) {
        String value = map.get(key);
        if (value == null) {
            value = loader.getProperty(key);
            map.put(key, value != null ? value : StringUtils.EMPTY);
        }
        return value;
    }
}
