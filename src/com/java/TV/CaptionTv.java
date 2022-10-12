package com.java.TV;
public class CaptionTv extends TV{
	//TV클래스로부터 변수 7개와 메소드 5개를 상속 받는다.
	//단일상속만 가능 ex)extends TV,TV2 불가능
	
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);	
		}
		
		
	}
	
}
