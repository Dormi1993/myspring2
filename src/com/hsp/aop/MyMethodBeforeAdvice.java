package com.hsp.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by dormi on 2016/12/18.
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    /**
     *
     * @param method:被调用的方法名字
     * @param objects：给method传递的参数
     * @param o：目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("********************************");
        System.out.println("记录日志..." + method.getName());

    }
}
