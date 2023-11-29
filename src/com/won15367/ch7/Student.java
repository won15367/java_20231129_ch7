package com.won15367.ch7;

public final class Student extends People {

	public Student(String name, String ssn) {
		super(name, ssn);
		// TODO Auto-generated constructor stub
	}
	
	String grade;
	String studentnum;
	
//	public void printName() {
//		System.out.println("학생이름 :" + this.name);
//	}
//	
	@Override  // annotation
	public final void printName() {
		// TODO Auto-generated method stub
		System.out.println("학생이름 :" + this.name);
		super.printName();
		
	}

}
