package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BybService;
import com.service.UserService;
import com.util.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//我们先使用传统的方法，来调用UserService的sayHello方法
//		UserService us = new UserService();
//		us.setName("付大侠");
//		us.sayHello();

		//我们现在使用spring来完成上面的任务
		//1.得到spring的applicationContext对象（容器对象）
/*		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");//双引号中的.xml名
		//可以根据最初设定的名字以及如果放在包下面则前面加com/XXX/YYY.xml;

		UserService us= (UserService) ac.getBean("hsp");
		us.sayHello();*/

		//单态
		((UserService) ApplicationContextUtil.getApplicationContext()
				.getBean("hsp")).sayHello();


		//从ac【代表applicationContext容器】中
/*		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");//双引号中的.xml名

		BybService bybService = (BybService) ac.getBean("bybService");
		bybService.sayBye();*/




	}

}
