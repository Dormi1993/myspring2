package com.hsp.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//从ApplicationContext中取bean
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
		//当我们去实例化bean.xml，该文件中配置的bean被实例化（该bean的scope是singleton）
		
		//获取两个student
		Student s1=(Student) ac.getBean("student1");
		Student s2=(Student) ac.getBean("student1");

		System.out.println(s1+" "+s2);
		
		//从beanfactory去实例化
//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/hsp/ioc/beans.xml"));
//		factory.getBean("student1");


	}

}
