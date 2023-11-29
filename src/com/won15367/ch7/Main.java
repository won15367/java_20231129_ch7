package com.won15367.ch7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.receiveVoice("메세지가 왔습니다.");
		dmbCellPhone.sendVoice("메세지를 받았습니다.");
		
		dmbCellPhone.model = "갤럭시";
		dmbCellPhone.color = "검정";
		
		People people1 = new People("홍길동", "1234567");
		System.out.println(people1.name);
		
//		People people2 = new People();
//		System.out.println(people2.name);
		
		Student student = new Student("길동", "1234567");
		System.out.println(student.name);
		
		// 다른 패키지의 클래스를 상속받을때 접근제한자가 생략되어 있으면 사용할 수 없다.
		
		student.printName();
		
	}

}
