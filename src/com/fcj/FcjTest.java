package com.fcj;

/**
 * Created by dormi.fu on 2016/12/12.
 */
public class FcjTest {

    public static void main(String[] args){

        Test test = new Test();
        test.display();
        test.display();

        Test.display2();
        Test.display2();

//        try {
//            Class.forName("Test");
//            Class.forName("Test");
//        } catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
    }
}

class Test{

    public static int X = 2;
    public final static int Y = 3;

    public Test(){
        System.out.println("Test构造函数执行");
    }

    static {
        System.out.println("static块执行");
    }

    public void display(){
        System.out.println("实例方法执行");
    }

    public static void display2(){
        System.out.println("静态方法执行");
    }
}
