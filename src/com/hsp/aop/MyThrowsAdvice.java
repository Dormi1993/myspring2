package com.hsp.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by dormi.fu on 2016/12/20.
 */
public class MyThrowsAdvice implements ThrowsAdvice {
    //ThrowsAdvice是个标识性的接口（Tag interface )，没有任何方法，但是要有如下形式的方法
    public void afterThrowing(Method m, Object[] os, Object target, Exception e){//注意，这里引入的是反射包里的Method

        System.out.println("出大事了" + e.getMessage());
    }

}
