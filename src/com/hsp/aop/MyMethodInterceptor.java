package com.hsp.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by dormi.fu on 2016/12/20.
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("调用方法前...");
        Object obj = methodInvocation.proceed();//如果没有这句话则不会运行sayHi和sayBye方法
        System.out.println("调用方法后...");
        return obj;
//        return null;
    }
}
