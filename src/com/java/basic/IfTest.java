package com.java.basic;
import java.util.Scanner;
public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		//���ǹ� : ���๮���� ���������� ����
		//if , switch ~ case
		
//		if(���ǽ�(true pr false)) {
//			���๮
//		}

//		
//		int age = 20;
//		if(age >= 20) {
//			System.out.println("���� �Դϴ�.");
//		}else {
//			System.out.println("�̼��� �Դϴ�.");
//		}
//	
		
//		int num = 10;
//		
//		if(num % 2 == 1) {
//			System.out.println("Ȧ��");
//		}else {
//			System.out.println("¦��");
		
//		System.out.println("������ �Է��Ͻÿ�: ");

//		int score = sc.nextInt();
//		
//		if( score >= 90 && score <= 100) {
//				System.out.println("A����");
//			}else if(score >= 80 && score <= 89) {
//				System.out.println("B����");
//			}else if(score >= 70 && score <= 79) {
//				System.out.println("C����");
//			}else if(score >= 60 && score <= 69) {
//				System.out.println("D����");
//			}else if(score >= 0 && score < 60){
//				System.out.println("F����");
//			}else {
//				System.out.println("���ǿ� �������� �ʴ´�.");
//			}
		
		
//		int x =12;
//		
//		if(x % 2 == 0) {
//			if(x % 3 == 0) {
//				System.out.println("x�� 2�� 3�� ������");
//			}
//		}
//		if(x % 2 == 0 && x % 3 == 0) {
//			System.out.println("x�� 2�� 3�� �����2");
//		}
		
//		switch(�񱳰�) {
//		case ��1: ���๮
//		break;
//		case ��2: ���๮
//		break;
//		case ��3: ���๮
//		break;
//		default: ���๮;
		
//		int sel = 5;
//		
//		switch(sel) {   //switch() �ȿ��� ����, ����, ���ڿ�     * �Ǽ��� ��� �Ұ�
//		case 1: System.out.println("1�� ����");
//		break;
//		case 2: System.out.println("2�� ����");
//		break;
//		case 3: System.out.println("3�� ����");
//		break;
//		default: System.out.println("���� ����");
//		}
		
		System.out.print("ù��° ���� �Է�: ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է� �Ͻÿ�(+,-,*,/): ");
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
		default: System.out.println("����");
		}

		
	
		
		
	}
}
	
			