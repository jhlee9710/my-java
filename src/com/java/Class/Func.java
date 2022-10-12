package com.java.Class;

public class Func {
	
	//메소드(함수) : 객체의 기능을 구현한다.
	
//	리턴타입 메소드명(매개변수1, 매개변수2,...) {
//		실행문장
//		[return 값]=필수는 아님
//	}
	
	// 리턴타입 : void,기본자료형,참조형
	// 메소드명 : 낙타표기법
	// 매개변수 : int x, double d, Tv t
	// return : 리턴타입이 void가 아닌 경우에 사용한다.
	
	void add() {  //메소드의 선언화(시그니처)
		System.out.println(2+3);  //메소드의 구현부
	}
	
	void add2(int x,int y) {

		System.out.println(x+y);
	}
	
	int add3(int x,int y) {
		int sum = x+y;
		return sum;
	}
	//-*/
	int add4(int x,int y) {
		int sub = x-y;
		return sub;
	}
	int add5(int x,int y) {
		int mul = x*y;
		return mul;
	}
	double add6(double x,double y) {
		double div = x/y;
		return div;
	}
	void test(int x,int y) {
		if(x<y) {
			System.out.println("함수의 종료");
			return; //함수의 즉시 종료
		}
		int result=x+y;
		System.out.println(result);
	}
	int test2(int x,int y) {
		
		int result;
		
		if(x>y) {
			result =x;
		}else {
			result =y;
		}
		return result;
	}
	
	void call1() {
		System.out.println("call1");
		call2();
	}
	
	void call2() {
		System.out.println("call2");
		call3();
	}
	
	void call3() {
		System.out.println("call3");
	}
	
	
}
