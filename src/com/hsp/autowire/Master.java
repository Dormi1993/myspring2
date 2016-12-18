package com.hsp.autowire;

/**
 * Created by dormi on 2016/12/17.
 */
public class Master {
    private String name;
    private Dog dog;

//    public Master(Dog dog){
//        System.out.println("Master(Dog dog)");
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog1() {
        return dog;
    }

    public void setDog1(Dog dog) {
        this.dog = dog;
    }
}
