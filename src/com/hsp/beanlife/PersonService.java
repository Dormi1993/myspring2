package com.hsp.beanlife;

/**
 * Created by dormi on 2016/12/16.
 */
public class PersonService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi(){
        System.out.println("hi " + name);
    }
}
