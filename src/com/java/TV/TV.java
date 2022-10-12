package com.java.TV;

public class TV {
	//속성
	//크기, 전원버튼, 채널, 볼륨, 색상, 인터넷, ..., 모델, 제조년도, 제조사
	//기능(행위)
	//전원 ON/OFF, 채널 UP/DOWN, 볼륨 UP/DOWN, ...
	
	boolean power; //전원버튼
	int channel; //채널
	int volumn;	//볼륨
	String color;	//색상
	String model;	//모델
	int yearOfmanufacture;	// 제조년도
	String company;		// 제조사
	
	void power() {		// 전원 ON/OFF
		power = !power;
	}
	
	void channelUp() {		// 채널 UP
		channel++;
	}
	
	void channelDown() {	// 채널 DOWN
		channel--;
	}
	
	void volumnUp() {		// 채널 UP
		volumn++;
	}
	
	void volumnlDown() {	// 채널 DOWN
		volumn--;
		
	}
	void showInfo() {
		System.out.println(model);
		System.out.println(yearOfmanufacture);
		System.out.println(company);
		
	}
}
