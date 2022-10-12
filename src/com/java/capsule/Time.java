package com.java.capsule;

public class Time {
	private int hour;
	private int minute;
	private int second;
	final double PI;
	
	// getter / setter
	
	
	public Time(double pi) {	//��� �����ڸ� �̿��� �ʱ�ȭ���
		super();
		PI = pi;
	}
	

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 60) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 60) {
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.second = second;
	}
	
	
	
	
	
	
	
	
	

}
