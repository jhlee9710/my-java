package com.java.Class;

public class car1 {
	//�Ӽ�
	String color;
	String gearType;
	int door;
	
	
	//������ : �������(�ν��Ͻ�)�� �ʱ�ȭ �Ѵ�.
	//		 Ŭ������ �̸��� �����ϰ� �ۼ��Ѵ�.
	//		 ��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ�����.
	//		 �⺻�����ڴ� ���������ϴ�.
	//	 	 �ؽ�Ʈ�� �ƹ��͵� ������ �⺻������ (�����ص�, �����ʾƵ� �������)(�⺻������ �������)\
	//		 ������ �����ε�
	//		 �⺻������ ex) car1(){}
	//		 ��� Ŭ������ �����ڸ� �����Ѵ�.
	
	
	car1(String color){
		this(color,"Auto");	//�ٸ� �������� ȣ��
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
