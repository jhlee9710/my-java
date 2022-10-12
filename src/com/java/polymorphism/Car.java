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
	
	// �ŰԺ��� CarŸ��
	// Car -> Car, FireEngine, Ambulance
	
	void doWork(Car c) {	// �Ű������� Ȱ���� ��ü�� ������
		// instanceof
		// ��ü�� Ÿ���� Ȯ���Ѵ�.
		// c.water(); error
		
		if(c instanceof FireEngine) {	// if(�������� instanceof Ŭ�����̸�)
			FireEngine fe = (FireEngine)c;
			fe.water();
		}else if(c instanceof Ambulance) {
			Ambulance ab = (Ambulance)c;
			ab.siren();
		}
		
	}

}
