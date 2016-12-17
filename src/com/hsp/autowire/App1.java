package com.hsp.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/17.
 */
public class App1 {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/autowire/beans.xml");
        Master master = (Master) ac.getBean("master");
        System.out.println(master.getName() + "养了" + master.getDog1().getName());

    }
}
