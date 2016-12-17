package com.hsp.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by dormi on 2016/12/16.
 */
public class App1 {

    public static void main(String[] args){

//        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/beanlife/beans.xml");
//        PersonService ps = (PersonService) ac.getBean("personService");

        //通过beanfactory获取bean对象
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/hsp/beanlife/beans.xml"));
        PersonService ps = (PersonService) factory.getBean("personService");
        ps.sayHi();
    }
}
