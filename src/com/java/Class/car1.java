package com.java.Class;

public class car1 {
	//속성
	String color;
	String gearType;
	int door;
	
	
	//생성자 : 멤버변수(인스턴스)를 초기화 한다.
	//		 클래스의 이름과 동일하게 작성한다.
	//		 객체를 생성하는 시점에 한번만 호출되어진다.
	//		 기본생성자는 생략가능하다.
	//	 	 텍스트가 아무것도 없을시 기본생성자 (정의해도, 하지않아도 상관없음)(기본적으로 깔려있음)\
	//		 생성자 오버로딩
	//		 기본생성자 ex) car1(){}
	//		 모든 클래스는 생성자를 포함한다.
	
	
	car1(String color){
		this(color,"Auto");	//다른 생성자의 호출
		//this.color = color;
		
		
	}
	
	car1(String color,String gearType){
		this(color,gearType,4);
		//this.color = color;
		//this.gearType = gearType;
		
	}
	
	car1(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
	}
	

}
