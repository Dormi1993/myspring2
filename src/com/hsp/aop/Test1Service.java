package com.hsp.aop;

/**
 * Created by dormi on 2016/12/18.
 */
public class Test1Service implements TestServiceInter, TestServiceInter2 {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("hi " + name);

    }

    @Override
    public void sayBye() {
        System.out.println("bye " + name);
    }
}
