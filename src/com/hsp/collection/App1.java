package com.hsp.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi.fu on 2016/12/13.
 */
public class App1 {
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/collection/beans.xml");
        Department department = (Department) ac.getBean("department");
        System.out.println(department.getName());

        for (String emName : department.getEmpName()){
            System.out.println(emName);
        }
    }
}
