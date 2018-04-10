package com.ydy.test;

import com.google.common.collect.Lists;
import com.ydy.utils.CacheUtils;
import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author ydy
 * Create By ydy on 2018/4/9
 */
public class CacheTest {
    public static void main(String[] args) {
        // 1. 创建缓存管理器
//        CacheTest cacheTest = new CacheTest();
//        File file = null;
//        try {
//            String s = cacheTest.showURL();
//             file = new File(s+"/cache/ehcache-local.xml");
//            if (file.exists()) {
//                System.out.println("true");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        CacheManager cacheManager = CacheManager.create(file.toString());
//
//        // 2. 获取缓存对象
//        Cache cache = cacheManager.getCache("cacheTest");
//
//        // 3. 创建元素
//        Element element = new Element("key1", "value1");
//
//        // 4. 将元素添加到缓存
//        cache.put(element);
//
//        // 5. 获取缓存
//        Element value = cache.get("key1");
//        System.out.println(value);
//        System.out.println(value.getObjectValue());
//
//        // 6. 删除元素
//        cache.remove("key1");
//
//        Dog dog = new Dog("1", "taidi","2");
//        Element element2 = new Element("taidi", dog);
//        cache.put(element2);
//        Element value2 = cache.get("taidi");
//        Dog dog2 = (Dog) value2.getObjectValue();
//        System.out.println(dog2);
//
//        System.out.println(cache.getSize());
//
//        // 7. 刷新缓存
//        cache.flush();
//
//        // 8. 关闭缓存管理器
//        cacheManager.shutdown();

        List<String> list = Lists.newArrayList();
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext1.xml");
        CacheManager cacheManager = (CacheManager) applicationContext.getBean("cacheManager");
        Cache cache = cacheManager.getCache("cacheTest");
        Element element = new Element("KK", list);
        cache.put(element);
        Element element1 = cache.get("KK");
        List<String> stringList = (List<String>)element1.getObjectValue();
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public String showURL() throws IOException {
        File f = new File(this.getClass().getResource("/").getPath());
        System.out.println(f);
        return f.toString();
    }
}
