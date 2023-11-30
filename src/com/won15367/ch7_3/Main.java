package com.won15367.ch7_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CameraPhone cameraPhone = new CameraPhone();
		MusicPhone musicPhone = new MusicPhone();
		
		cameraPhone.modelName = "갤럭시";
		cameraPhone.color = "블랙";
		cameraPhone.photo();
		
		musicPhone.modelName = "아이폰";
		musicPhone.color = "실버";
		musicPhone.music();
		
		// Phone phone = new Phone();
		// 추상 클래스는 직접 객체를 선언 할 수 없다.
		
	}

}
