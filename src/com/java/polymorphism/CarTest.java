package com.java.polymorphism;

public class CarTest {

	public static void main(String[] args) {
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
		
		//�������� ������ ��ü����(������ �� �ִ� ����� ������ ���Ѵ�.)
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;	// Car = FireEngine(��� ������ ����), �������� ����ȯ
//		car = water();	// error
//		car.stop();
//		fe2 = (FireEngine)car;	// ��������ȯ
//		fe2.water();
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(fe);
		car.doWork(ab);
		
		
		

	
		
		
		
	

	}

}
