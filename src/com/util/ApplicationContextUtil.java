package com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//目的是单态

final public class ApplicationContextUtil {

	private static ApplicationContext ac=null;

	//构造函数弄成私有的，不让别人去构建
	private ApplicationContextUtil(){

	}

	static{
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");

	}

	public static ApplicationContext getApplicationContext(){
		return ac;
	}


}
