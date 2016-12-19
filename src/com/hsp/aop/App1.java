package com.hsp.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/19.
 */
public class App1 {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/aop/beans.xml");

//        Test1Service ts = (Test1Service) ac.getBean("Test1Service");//这种的话和之前的方法一样了，没有aop编程
//        ts.sayHello();

        TestServiceInter ts = (TestServiceInter) ac.getBean("proxyFactoryBean");
        ts.sayHello();
        ((TestServiceInter2) ts).sayBye();
    }
}
