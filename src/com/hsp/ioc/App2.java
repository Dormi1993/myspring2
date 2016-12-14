package com.hsp.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ApplicationContext��ȡbean
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
		//������ȥʵ����bean.xml�����ļ������õ�bean��ʵ��������bean��scope��singleton��
		
		//��ȡ����student
		Student s1=(Student) ac.getBean("student1");
		Student s2=(Student) ac.getBean("student1");
		System.out.println(s2.getName());

		System.out.println(s1+" "+s2);
		
		//��beanfactoryȥʵ����
/*		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/hsp/ioc/beans.xml"));
//		factory.getBean("student1");
		Student s3 = (Student) factory.getBean("student1");
		System.out.println(s3);*/


	}

}
