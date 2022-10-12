package com.java.basic;
import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		//조건문 : 실행문장을 선택적으로 실행
		//if , switch ~ case
		
//		if(조건식(true pr false)) {
//			실행문
//		}

//		
//		int age = 20;
//		if(age >= 20) {
//			System.out.println("성인 입니다.");
//		}else {
//			System.out.println("미성년 입니다.");
//		}
//	
		
//		int num = 10;
//		
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
		
//		System.out.println("점수를 입력하시오: ");

//		int score = sc.nextInt();
//		
//		if( score >= 90 && score <= 100) {
//				System.out.println("A학점");
//			}else if(score >= 80 && score <= 89) {
//				System.out.println("B학점");
//			}else if(score >= 70 && score <= 79) {
//				System.out.println("C학점");
//			}else if(score >= 60 && score <= 69) {
//				System.out.println("D학점");
//			}else if(score >= 0 && score < 60){
//				System.out.println("F학점");
//			}else {
//				System.out.println("조건에 부합하지 않는다.");
//			}
		
		
//		int x =12;
//		
//		if(x % 2 == 0) {
//			if(x % 3 == 0) {
//				System.out.println("x는 2와 3의 공베수");
//			}
//		}
//		if(x % 2 == 0 && x % 3 == 0) {
//			System.out.println("x는 2와 3의 공배수2");
//		}
		
//		switch(비교값) {
//		case 값1: 실행문
//		break;
//		case 값2: 실행문
//		break;
//		case 값3: 실행문
//		break;
//		default: 실행문;
		
//		int sel = 5;
//		
//		switch(sel) {   //switch() 안에는 숫자, 문자, 문자열     * 실수는 사용 불가
//		case 1: System.out.println("1번 선택");
//		break;
//		case 2: System.out.println("2번 선택");
//		break;
//		case 3: System.out.println("3번 선택");
//		break;
//		default: System.out.println("선택 안함");
//		}
		
		System.out.print("첫번째 숫자 입력: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력 하시오(+,-,*,/): ");
		String op = sc.nextLine();
		
		switch(op) {
		case "+": System.out.println(num1 + num2);
		break;
		case "-": System.out.println(num1 - num2);
		break;
		case "*": System.out.println(num1 * num2);
		break;
		case "/": System.out.println(num1 / num2);
		break;
		default: System.out.println("오류");
		}

		
	
		
		
	}
}
	
			