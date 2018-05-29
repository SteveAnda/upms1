package com.anda.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;
import java.util.Map;

/**
 * 资源文件读取工具
 */

public class SpringContextUtil implements ApplicationContextAware {

    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 根据名称获取bean
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }

    /**
     * 根据bean名称获取指定类型bean
     * @param beanName bean名称
     * @param tClass 返回的bean类型,若类型不匹配,将抛出异常
     */
    //todo:为什么ApplicationContext接口中没有getBean方法却能够调用？？（我已经发现了，继承了其他的接口）
    public static <T> T getBean(String beanName, Class<T> tClass){
        return context.getBean(beanName, tClass);
    }

    /**
     * 根据类型获取bean
     * @param tClass
     * @return
     */
    public static <T> T getBean(Class<T> tClass){
        T t = null;
        Map<String, T> map = context.getBeansOfType(tClass);
        for (Map.Entry<String, T> entry : map.entrySet()){
            t = entry.getValue();
        }
        return t;
    }

    /**
     * 是否包含bean
     * @param beanName
     * @return
     */
    public static boolean containsBean(String beanName){
        return context.containsBean(beanName);
    }

    /**
     * 是否是单例
     * @param beanName
     * @return
     */
    public static boolean isSingleton(String beanName){
        return context.isSingleton(beanName);
    }

    /**
     * bean的类型
     * @param beanName
     * @return
     */
    public static Class getType(String beanName){
        return context.getType(beanName);
    }
}
