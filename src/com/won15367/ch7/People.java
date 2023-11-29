package com.won15367.ch7;

public class People {
	
	String name;
	String ssn; // 주민번호
	
//	public People() {
//
//	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void printName() {
		System.out.println("이름 :" + this.name);
	}
	
}
