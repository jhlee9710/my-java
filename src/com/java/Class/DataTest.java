package com.java.Class;


public class DataTest {

	public static void main(String[] args) {
		Data d=new Data();
	
//		==================================== �⺻��-������ (1)
		
//		d.x = 10;
//		System.out.println(d.x);
//		
//		change(d.x);
//		System.out.println(d.x);
//		
		
//		==================================== ������-�ּҰ��� ��⶧���� ���ε� �ٲ� (1)
		
//		d.x =10;
//		System.out.println(d.x);  	//10
//		
//		change(d);	//�ּҰ��� �ѱ�
//		
//		System.out.println(d.x);	//1000
//		d.x=5000;
//		System.out.println(d.x);	//5000
//		change(d);					
//		System.out.println(d.x);
		
		
//		=================================
		d.x=10;
		Data d2=copy(d);
		System.out.println(d.x);  //100
		System.out.println(d2.x);  //200
		d2.x=50;
		System.out.println(d.x);  //100
		System.out.println(d2.x);  //50
		
	}

//		==================================== �⺻��-������ (2)
	
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : "+x);
//		}
	
//		===================================== ������ (2)
	
//	static void change(Data d) {    // Data d�� �ּҰ��� �޴´�.
//		System.out.println("change()  :"+d.x);		//10  -> 5000
//		d.x=1000;	
//		System.out.println("change()  :"+d.x);		//1000  -> 1000
//		
//	}
	
	
//	===========================================
	
	static Data copy(Data d) {
		
		Data tmp = new Data();
		tmp.x= d.x;
		System.out.println(d.x);  //10 
		System.out.println(tmp.x);  //10
		d.x=100;
		System.out.println(d.x);	//100
//		tmp.x= d.x;
		System.out.println(tmp.x);	//10     if(tmp.x=d.x) -> 100
		tmp.x=200;
		System.out.println(tmp.x);  //200
		return tmp;

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
