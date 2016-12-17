package com.hsp.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by dormi on 2016/12/16.
 */
public class PersonService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean{

    private String name;

    public String getName() {
        return name;
    }

    public PersonService(String abc){
        System.out.println("PersonServiceabc 函数");
    }

    public PersonService(){
        System.out.println("PersonService 函数");
    }

    public void setName(String name) {
        System.out.println("setName(String name) 函数");
        this.name = name;
    }

    public void sayHi(){
        System.out.println("hi " + name);
    }

    //该方法可以给arg0表示正在被实例化的bean id
    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName 被调用 值" + s);

    }

    //该方法可以传递beanFactory
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory " + beanFactory);
    }

    //该方法传递ApplicationContext
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext "+applicationContext);
    }

    public void init(){
        System.out.println("我自己的init方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()");
    }


/*    implements DisposableBean
    @Override
    public void destroy() throws Exception {
        //我们可以关闭数据连接，socket，文件流，释放该bean的资源。。。
        //但是我们不建议用这种方法，因为这种方法就和接口绑定在一起了，建议调用定制的销毁方法
    }*/

    //定制我们的销毁方法
    public void mydestroy(){
        System.out.println("释放各种资源");
    }
}
