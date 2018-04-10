package com.ydy.utils;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * Ehcache缓存工具类
 *
 * @author ydy
 * Create By ydy on 2018/4/9
 */
public class CacheUtils {

    private static CacheManager cacheManager = ((CacheManager) SpringContextHolder.getBean("cacheManager"));

    private static final String LIST_DATA_CACHE = "listDataCache";

    /**
     * 获取LIST_DATA_CACHE缓存
     * @param key
     * @return
     */
    public static Object get(String key) {
        return get(LIST_DATA_CACHE, key);
    }

    /**
     * 写入LIST_DATA_CACHE缓存
     * @param key
     * @param value
     */
    public static void put(String key, Object value) {
        put(LIST_DATA_CACHE, key, value);
    }

    /**
     * 写入缓存
     * @param cacheName
     * @param key
     * @param value
     */
    public static void put(String cacheName, String key, Object value) {
        Element element = new Element(key, value);
        getCache(cacheName).put(element);
    }

    /**
     * 从缓存中移除
     * @param cacheName
     * @param key
     */
    public static void remove(String cacheName, String key) {
        getCache(cacheName).remove(key);
    }

    /**
     * 获取缓存
     * @param cacheName
     * @param key
     * @return
     */
    public static Object get(String cacheName, String key) {
        Element element = getCache(cacheName).get(key);
        return element == null ? null : element.getObjectValue();
    }


    /**
     * 获得一个Cache,没有则创建一个
     * @param cacheName
     * @return
     */
    public static Cache getCache(String cacheName) {
        Cache cache = cacheManager.getCache(cacheName);
        if (cache == null) {
            cacheManager.addCache(cacheName);
            cache = cacheManager.getCache(cacheName);
            cache.getCacheConfiguration().setEternal(true);
        }
        return cache;
    }

    public static CacheManager getCacheManager() {
        return cacheManager;
    }



}
