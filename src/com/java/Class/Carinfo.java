package com.java.Class;

public class Carinfo {
	public static void main(String[] args) {
		Car c = new Car();
		
		c.carType = "소나타";
		c.carColor = "은색";
		c.ridingPerson = 4;
		c.wheelCnt = 4;
		c.highSpd = 160;
		c.trunkSize = 5000;
		c.carWeight = 8000;
		c.carHeight = 2000;
		c.fuelEffi = 200;
		c.fuelSize = 3000;
		
		System.out.print(c.carType);
		System.out.println(c.carColor);
		System.out.println(c.ridingPerson);
		System.out.println(c.wheelCnt);
		System.out.println(c.highSpd);
		System.out.println(c.trunkSize);
		System.out.println(c.carWeight);
		System.out.println(c.carHeight);
		System.out.println(c.fuelEffi);
		System.out.println(c.fuelSize);
	}
}
