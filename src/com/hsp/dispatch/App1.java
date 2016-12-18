package com.hsp.dispatch;

import com.hsp.constructor.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dormi on 2016/12/17.
 */
public class App1 {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/hsp/dispatch/beans.xml");

        DBUtil dbUtil = (DBUtil) ac.getBean("dbutil2");
        System.out.println(dbUtil.getDrivername() + " " + dbUtil.getName());
    }
}
