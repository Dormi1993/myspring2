package com.hsp.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by dormi on 2016/12/16.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization 函数被调用");

//        return o;//return null??
        return o;//return null??

    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessAfterInitialization 函数被调用");
        System.out.println(o + " 被创建的时候是" + new java.util.Date());
        return o;
    }
}
