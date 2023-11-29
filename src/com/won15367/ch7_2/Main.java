package com.won15367.ch7_2;

public class Main {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
    	parent = child;  // 부모는 자식객체를 받을 수 있다. upcasting
    	child.printSchoolName();
    	
    	Parent child1 = new Child();
    	
    	child = (Child)parent;

	}

}
