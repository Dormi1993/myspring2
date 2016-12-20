package com.hsp.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/17.
 */
public class App1 {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/constructor/beans.xml");

        Employee employee = (Employee) ac.getBean("employee");
        System.out.println(employee.getName() + " " + employee.getAge());
    }
}
