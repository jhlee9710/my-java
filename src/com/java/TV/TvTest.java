package com.java.TV;

public class TvTest {

	public static void main(String[] args) {
		
		//int sum = 0; // 지역변수
		
		//sum += 10;
		
		//System.out.println(new TV());
		//new TV(); 생성된 TV 객체의 첫 번째 맴버의 주소값.
		
		//new TV().power = true;
		//new TV().channel = 10;
		
		TV t = new TV();		//참조변수(=주소값)
		//System.out.println(t);
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);
		
		t.channelDown();
		System.out.println(t.channel);
		
		TV t2 = new TV();
		t2.channel = 20;
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t2.channelDown();
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2 = t;		// 두 참조변수의 타입이 동일한 경우만 가능
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t.channelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
	}

}
