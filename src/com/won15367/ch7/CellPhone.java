package com.won15367.ch7;

public class CellPhone {
	
	// 부모 클래스
	
	// 필드
	String model;
	String color;
	
	// 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void hanhUp() {
		System.out.println("전화를 끊습니다.");
	}

}
