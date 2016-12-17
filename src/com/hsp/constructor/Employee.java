package com.hsp.constructor;

/**
 * Created by dormi on 2016/12/17.
 */
public class Employee {
    private String name;
    private int age;

    //还需要有一个默认的（无参的）构造函数
    public Employee(){

    }

    //这个是显示的构造函数
    public Employee(String name, int age) {
        System.out.println("Employee(String name, int age) 函数被调用。。");
        this.name = name;
        this.age = age;
    }

    public Employee(String name) {
        System.out.println("Employee(String name)...");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
