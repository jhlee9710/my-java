package com.java.Class;

public class Student {

	String name; //�л� �̸�
	int ban; //��
	int no;//�л� ��ȣ
	int kor;//���� ����
	int eng;//���� ����
	int math;//���� ����
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	int getTotal() {
		return kor + eng + math;
	}
	double getAberage() {
		return (int)(getTotal()/3.0*10+0.5)/10.0;
	
		
	}
	
	
}
