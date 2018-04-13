package com.ydy.utils;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * 以静态变量保存Spring ApplicationContext, 可在任何代码任何地方任何时候取出ApplicaitonContext.
 * @author ydy
 * Create By ydy on 2018/4/9
 * @Lazy 用于指定该Bean是否取消预初始化。
 * 主要用于修饰Spring Bean类，用于指定该Bean的预初始化行为，
 * 使用该Annotation时可以指定一个boolean型的value属性，
 * 该属性决定是否要预初始化该Bean。
 *
 * Spring容器会检测容器中的所有Bean，
 * 如果发现某个Bean实现了ApplicationContextAware接口，
 * Spring容器会在创建该Bean之后，自动调用该Bean的setApplicationContextAware()方法，
 * 调用该方法时，会将容器本身作为参数传给该方法——该方法中的实现部分将Spring传入的参数（容器本身）
 * 赋给该类对象的applicationContext实例变量，因此接下来可以通过该applicationContext实例变量来访问容器本身。


 */
@Service
@Lazy(false)
public class SpringContextHolder implements ApplicationContextAware, DisposableBean{

    private static ApplicationContext applicationContext = null;

    private static Logger logger = LoggerFactory.getLogger(SpringContextHolder.class);

    /**
     * 取得存储在静态变量中的ApplicationContext.
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        assertContextInjected();
        return applicationContext;
    }

    /**
     * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
     * @SuppressWarnings 用于抑制编译器产生警告信息。
     * @param name
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) {
        assertContextInjected();
        return (T) applicationContext.getBean(name);
    }

    /**
     * 从静态变量applicationContext中取得Bean, 自动转型为所赋值对象的类型.
     * @SuppressWarnings 用于抑制编译器产生警告信息。
     * @param requiredType
     * @param <T>
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> requiredType) {
        assertContextInjected();
        return (T) applicationContext.getBean(requiredType);
    }

    /**
     * 清除SpringContextHolder中的ApplicationContext为Null.
     */
    public static void clearHolder() {
        if (logger.isDebugEnabled()){
            logger.debug("清除SpringContextHolder中的ApplicationContext:" + applicationContext);
        }
        applicationContext = null;
    }

    /**
     * 实现ApplicationContextAware接口, 注入Context到静态变量中
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    /**
     * 实现DisposableBean接口, 在Context关闭时清理静态变量.
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception{
        SpringContextHolder.clearHolder();
    }

    /**
     * 检查ApplicationContext不为空
     */
    private static void assertContextInjected() {
        //验证类 验证有状态条件true; 否则抛出异常
        Validate.validState(applicationContext != null,"applicaitonContext属性未注入, 请在applicationContext.xml中定义SpringContextHolder.");
    }

}
