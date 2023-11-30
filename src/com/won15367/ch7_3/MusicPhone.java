package com.won15367.ch7_3;

public class MusicPhone extends Phone {
	
	@Override
	public void bell(String bellName) {
		// TODO Auto-generated method stub
		System.out.println("음악" + bellName);
	}

	String music;
	
	public void music() {
		System.out.println("음악재생");
	}
	
	public void turnOff() {
		System.out.println("2초간 꾹 누루면 전원이 꺼짐");
	}

}
