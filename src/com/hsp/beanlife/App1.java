package com.hsp.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/16.
 */
public class App1 {

    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/beanlife/beans.xml");
        PersonService ps = (PersonService) ac.getBean("personService");
        ps.sayHi();
    }
}
