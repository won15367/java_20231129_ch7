package com.won15367.ch7_3;

public abstract class Phone {  // 추상 클래스
	
	String modelName;
	String color;
	
	public void turnOn( ) {
		System.out.println("전원 켜기");
	}
	
	public void turnOff() {  
		System.out.println("전원 끄기");
	}
	
	public abstract void bell(String bellName);
	// 추상 매소드는 내용이 있으면 안된다. 이름이랑 매계변수 만 선언
	// 상속받은 클래스에서 반드시 구현하여야 한다.
	
	
}
