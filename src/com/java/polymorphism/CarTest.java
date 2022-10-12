package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
		
		//다형성을 적용한 객체생성(참조할 수 있는 멤버의 갯수가 변한다.)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;	// Car = FireEngine(상속 구조에 가능), 참조형의 형변환
//		car = water();	// error
//		car.stop();
//		fe2 = (FireEngine)car;	// 강제형변환
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(fe);
		car.doWork(ab);
		
		
		

	
		
		
		
	

	}

}
