package com.hsp.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/hsp/inter/beans.xml");
		//��ȡ�����ýӿ�获取，不用接口
//		UpperLettter changeLetter=(UpperLettter) ac.getBean("changeLetter");
//		System.out.println(changeLetter.change());
		
		//ʹ�ýӿ�������bean使用接口来访问bean
		ChangeLetter changeLetter2=(ChangeLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter2.change());

	}

}
