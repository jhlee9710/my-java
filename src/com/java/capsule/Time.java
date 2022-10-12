package com.java.capsule;

public class Time {
	private int hour;
	private int minute;
	private int second;
	final double PI;
	
	// getter / setter
	
	
	public Time(double pi) {	//상수 생성자를 이용한 초기화방법
		super();
		PI = pi;
	}
	

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 60) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 60) {
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.second = second;
	}
	
	
	
	
	
	
	
	
	

}
