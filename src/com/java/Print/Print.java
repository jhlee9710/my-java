package com.java.Print;

public class Print {
	int x;
	int y;
	
	/*
	print(){ //������ �⺻ ������
		super();	//Object()������ ȣ��
	} //
	*/
	
	
	
	public Print(int x,int y) {	//(1)����� �����ڸ� ����� �⺻�����ڰ� ȣ����� �ʱ� ������ �⺻�����ڸ� ��������� ������ ��������
		this.x=x;
		this.y=y;
	}
	
	
//	Print(){}  // ���� �����ڸ� ȣ���� �� �⺻�����ڸ� �Է��������
	
	
	
	public String getLocation() {
		return "x : " + x + "y : " +y;
	}
}
