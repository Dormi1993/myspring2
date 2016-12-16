package com.hsp.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;

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

        System.out.println("=====通过list集合取出数据=====");
        //list是有序的，打出来的顺序与property的ref有关
        for (Employee e : department.getEmpList()){
            System.out.println("name = "+e.getName()+e.getId());
        }

        System.out.println("=====通过set集合取出数据=====");
        for (Employee e :department.getEmpSet()){
            System.out.println(e.getName());
        }

        System.out.println("=====通过map集合取出数据  迭代器方法======");
        //1.迭代器
        Map<String, Employee> empmaps = department.getEmpMaps();
        Iterator it = empmaps.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            Employee emp = empmaps.get(key);
            System.out.println("key = " +  key +emp.getName());
        }

        System.out.println("=====通过map集合取出数据  简洁方法======");
        //2.简洁，推荐使用此种方法
        for (Map.Entry<String, Employee> entry1 : department.getEmpMaps().entrySet()){

            System.out.println(entry1.getKey() + " " + entry1.getValue().getName());


        }

    }
}
