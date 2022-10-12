package com.java.basic;
import java.util.Scanner;
public class Oper {

	public static void main(String[] args) {
		
		//산술연산자
		//+,-,*,/(몫),%(나머지)
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x/y);
//		System.out.println(x%y);

		
//		int x = 5;
//		
//		//상수 
//		final double PI = 3.14;  //final 상수 선언 변수와 달리 실행 중에 값을 바꿀 수 없다.
//		// PI = 2.34;  변경이 불가
//		System.out.println(PI);
		
		//형변환 (자료형 or 데이터타입);
		//int  ->  double 
		//boolean은 제외 
		//------------------------------------------> 자동형변환
		//byte(1)  <  short(2)  <  int(4)  <  long(8)  <  float(4)  <  double(8)
		//     char(2)(양수만 표현가능)  
		//         강제형변환   (캐스팅 이라고도함)          <--------------------------------------------
		
//		byte b = 85;
//		int i = b;  // byte b는 자동으로 int형으로 바뀜
		
//		int i = 85;
//		byte b = (byte) i; // 강제형 변환으로 byte 타입으로 바꿔줘야함 (캐스팅 이라고도함)
		
//		int i = 300;
//		byte b = (byte)i;   //강제형변환(값의 손실)
//		
//		System.out.println(b); //나온값은 44로 0~256의 byte값을 초과해 (300%256=44)의 값이 출력됨
		
//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); 3(소수값 데이터 손실)
//		System.out.println(d); 3.14

		
//		int i = 3;
//		double d = i;
//		System.out.println(d); // 3.0
		
//		byte b = 65;
//		char c = (char)b;  // 직접비교불가로 자동형변환 불가 강제형변환으로 바꿔줘야함
//		System.out.println(c); // A
		
//		int x = 10;
//		int y = 20;
//		
//		int result = x + y;
		
//		byte b1 = 10;
//		byte b2 = 20;
		
//		byte result = b1 + b2;  // 연산과정에서 int형으로 바뀜으로 인하여 오류 byte re = int + int 
//		byte result =  (byte) (b1 + b2); // byte re = (byte)(int + int)
		
		
		//연산자 int보다 작은 정수타입은 모두 int형으로 자동형변환한다.
		//byte + byte -> int + int
		//byte + short -> int + int
		//char + byte -> int + int
		
		
//		int + long -> long + long 
//		int + float -> float + float 
//		float + double -> double + double 
		
//		int x = 5;
//		int y = 2;
//		double result = x / y;  2.0
//		double result = x % y;  1.0 
//		System.out.println(result);
		
//		int x = 3;
//		int y = 5;
//		double result = (double) x / y; // double이 더 높기때문에  y연산은 자동으로 변환
//		System.out.println(result);   //  0.6
		
//		String str = "java";
//		double ver = 1.8;
//		
//		String + anyType  ->  String
//		String + double  ->  String + String
//		String result = str + ver;
//		System.out.println(result);
		
		// + => 산술, 연결, 부호
		
		// 증강연산자 : 값을 1증가. 값을 1 감소
		// ++, --
		// 변수에만 사용가능
		
//		int x = 10;
//		++x;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		x--;
//		System.out.println(x);
		
//		int x = 10;
//		int y = 0;
		
//		y = x++ + 10; //x = 11 y = 20
//		y = ++x + 10; //x = 11 y = 21
		
//		System.out.println(x);
//		System.out.println(y);
		
		// 대입 연산자
		// 변수에 사용하는 연산
		// =, +=, -=, *=, /=, <<=, |= .....
		
//		int a = 10;
//		int x = 10;
//		x += 10; //x = x + 10
//		System.out.println(x); // 20
//		
//		x -= 10;
//		System.out.println(x); // 10
//		
//		x *= 2;
//		System.out.println(x); // 20
		
//		비교연산자
//		5 > 3
//		<, > , <=, >=, ==, !=
//		ture, false
		/*	
		int x = 10;
		int y = 20;
	
		
		System.out.println(x < y);  
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		System.out.println(x == y);
		System.out.println(x != y);
		 */
		
		// 논리연산자
		// &&, ||, !
		// 두 가지 이상의 조건을 확인할때 사용한다.
		/*
		int x = 10;
		int y = 20;
		int z = 30;
		
//		System.out.println(x == 10);
//		System.out.println(y == 20);
		
		/* AND 연산자
		System.out.println(x == 10 && y == 20); //true && true  => true
		System.out.println(x == 10 && y == 30); // true && false => false
		System.out.println(x == 50 && y == 30); // false && false => false
		System.out.println(x == 10 && y == 20 && z == 30); //true && true && true => true
		*/
		
		/* OR 연산자
		System.out.println(x == 10 || y == 20); //true || true => true
		System.out.println(x == 10 || y == 30); //true || false => true
		*/
		
		/* NOT 연산자
		System.out.println(!(x == 10)); //!true => false 
		*/
		
		// 3.45 <= 2  doube <= int  -> double <= double -> double
		
		// 조건연산자(삼항연산자)
		// 조건식 ? 결과1 : 결과2
		// (true or false) ? (true)  (false)
		
		/*
		int result = (x > y) ? x : y; // x 가 y보다 작음으로  false y 대입
		System.out.println(result);
		result = (x > y) ? y : x; // x 가 y보다 작음으로  false x 대입
		System.out.println(result);
		
		int age = 20;
		String rs = (age >= 20) ? "성인 입니다" : "미성년 입니다";
		System.out.println(rs);*/
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("백의 자리를 입력하세요: ");
		int num = sc.nextInt();
		
		System.out.println("입력받은 값 : " + num);
		
		// num = num / 10 * 10 + 1 ;
		System.out.println("연산된 결과값은 "+ (num / 10 * 10 + 1));
		*/
		
		/*
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		System.out.println("입력받은 값: " + num);
		System.out.println("결과값 : "+ (num / 10 + 1)* 10);
		*/
		/*
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		
		System.out.println("입력받은 값: " + num);
		int num2 = num;
		num = (num / 10 + 1)*10;
		num2 = num - num2;
		System.out.printf("결과값 :%d ", num2);
		
	
		/*
		System.out.println(10 - num % 10);
		*/
		
		/*
		System.out.print("사과 갯수: ");
		int ap = sc.nextInt();
		System.out.println("총 사과의 갯수는 " + ap + "이며 필요한 바구니 갯수는 " + (ap + 9) / 10);
		*/
		
		// int buck = ap / 10 + (ap > 0 ? 1 : 0);
		// System.out.println("총 사과의 갯수는 " + ap + "이며 필요한 바구니 갯수는 " + buck);
		
		int x = 3;
		System.out.println(x >= 0 && x <= 10);
		System.out.println(x > 0 && x < 10);
		System.out.println(x <= 0 || x >= 10);
		
		
	}
	

}
