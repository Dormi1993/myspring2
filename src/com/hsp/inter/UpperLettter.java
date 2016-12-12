package com.hsp.inter;

public class UpperLettter implements ChangeLetter {
	
	private String str;

	//��Сд��ĸ��ɴ�д把小写字母变成大写
	public String change() {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	
}
