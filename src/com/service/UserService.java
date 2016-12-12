package com.service;

public class UserService {

	private String name;
	
	private BybService byeService;

	public BybService getByeServiceha() {
		return byeService;
	}

	public void setByeServiceha(BybService byeService) {
		this.byeService = byeService;
	}

	public String getNameHa() {
		return name;
	}

	public void setNameHa(String name) {
		this.name = name;
	}

	public void sayHello(){
		System.out.println("Hello "+name);
		byeService.sayBye();
	}

}
