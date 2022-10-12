package com.java.Class;

public class car1Test {
	
	public static void main(String[] args) {
//		car1 c1=new car1();
//		c1.color = "red";
//		c1.gearType = "Auto";
//		c1.door = 4;
//		
//		System.out.println(c1.color);
//		System.out.println(c1.gearType);
//		System.out.println(c1.door);
//		
//		car1 c2=new car1();
//		
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//  	System.out.println(c2.door);
		
		car1 c3=new car1("red");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);
		
		car1 c4=new car1("blue","auto");
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);
		
		car1 c5=new car1("yellow","Auto",3);
		System.out.println(c5.color);
		System.out.println(c5.gearType);
		System.out.println(c5.door);
	}

}
