package com.java.TV;

public class TV {
	//�Ӽ�
	//ũ��, ������ư, ä��, ����, ����, ���ͳ�, ..., ��, �����⵵, ������
	//���(����)
	//���� ON/OFF, ä�� UP/DOWN, ���� UP/DOWN, ...
	
	boolean power; //������ư
	int channel; //ä��
	int volumn;	//����
	String color;	//����
	String model;	//��
	int yearOfmanufacture;	// �����⵵
	String company;		// ������
	
	void power() {		// ���� ON/OFF
		power = !power;
	}
	
	void channelUp() {		// ä�� UP
		channel++;
	}
	
	void channelDown() {	// ä�� DOWN
		channel--;
	}
	
	void volumnUp() {		// ä�� UP
		volumn++;
	}
	
	void volumnlDown() {	// ä�� DOWN
		volumn--;
		
	}
	void showInfo() {
		System.out.println(model);
		System.out.println(yearOfmanufacture);
		System.out.println(company);
		
	}
}
