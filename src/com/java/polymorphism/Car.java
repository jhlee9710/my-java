package com.java.polymorphism;

public class Car {
	String color;
	int door;
	
	void driver() {
		System.out.println("drive gogo");
		
	}
	void stop() {
		System.out.println("stop");
	}
	
	// 매게변수 Car타입
	// Car -> Car, FireEngine, Ambulance
	
	void doWork(Car c) {	// 매개변수를 활용한 객체의 다형성
		// instanceof
		// 객체의 타입을 확인한다.
		// c.water(); error
		
		if(c instanceof FireEngine) {	// if(참조변수 instanceof 클래스이름)
			FireEngine fe = (FireEngine)c;
			fe.water();
		}else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
		
	}

}
