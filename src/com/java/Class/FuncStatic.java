package com.java.Class;

public class FuncStatic {
	int iv;
	static int cv;
	
	//멤버메소드 : - 인스턴스 메소드
	//				인스턴스 변수, 클래스 변수 모두 사용가능
	//				인스턴스 메소드, 클래스 메소드 모두 사용가능
	//			- 클래스(static) 메소드
	//				객체 사용없이 사용가능
	//				객체 생성없이 사용가능
	
	void instanceMethod() {	
		System.out.println("instanceMethod() call");
		iv = 10;
		cv = 20;
		
		System.out.println("iv = "+ iv);
		System.out.println("cv = "+ cv);
		
		staticMethod();
	}
	
	static void staticMethod() {
		System.out.println("staticMethod() call");
//		iv=30;	//인스턴스 변수 사옹 불가능
		cv=40;
		
		System.out.println("cv = "+cv);
		
//		instanceMethod();  //사용 불가능
	}
}
