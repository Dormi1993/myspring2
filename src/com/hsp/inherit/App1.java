package com.hsp.inherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/17.
 */
public class App1 {
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/inherit/beans.xml");
        Graduate graduate = (Graduate) ac.getBean("graduate");
        System.out.println(graduate.getName() + " " + graduate.getAge() + " " + graduate.getDegree());

    }
}
