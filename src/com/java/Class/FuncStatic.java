package com.java.Class;

public class FuncStatic {
	int iv;
	static int cv;
	
	//����޼ҵ� : - �ν��Ͻ� �޼ҵ�
	//				�ν��Ͻ� ����, Ŭ���� ���� ��� ��밡��
	//				�ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��밡��
	//			- Ŭ����(static) �޼ҵ�
	//				��ü ������ ��밡��
	//				��ü �������� ��밡��
	
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
//		iv=30;	//�ν��Ͻ� ���� ��� �Ұ���
		cv=40;
		
		System.out.println("cv = "+cv);
		
//		instanceMethod();  //��� �Ұ���
	}
}
