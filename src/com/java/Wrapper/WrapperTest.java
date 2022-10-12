package com.java.Wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		//wrapper Class : 기본형과 참조형간 형변환(박싱, 언박싱) 오토박싱
		//박싱 : 기본형 -> 참조형
		//언박싱 : 참조형 -> 기본형
		
		int i = 10;
		Integer intg = i;	//박싱 (Integer)i;  //new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2;		//언박싱
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i;	//박싱
//		int i3 = obj;	//언박싱은 불가
		
		String str = "20";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
		
		
	}

}
