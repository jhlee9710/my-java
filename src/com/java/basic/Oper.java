package com.java.basic;
import java.util.Scanner;
public class Oper {

	public static void main(String[] args) {
		
		//���������
		//+,-,*,/(��),%(������)
		
//		int x = 5;
//		int y = 2;
//		
//		System.out.println(x/y);
//		System.out.println(x%y);

		
//		int x = 5;
//		
//		//��� 
//		final double PI = 3.14;  //final ��� ���� ������ �޸� ���� �߿� ���� �ٲ� �� ����.
//		// PI = 2.34;  ������ �Ұ�
//		System.out.println(PI);
		
		//����ȯ (�ڷ��� or ������Ÿ��);
		//int  ->  double 
		//boolean�� ���� 
		//------------------------------------------> �ڵ�����ȯ
		//byte(1)  <  short(2)  <  int(4)  <  long(8)  <  float(4)  <  double(8)
		//     char(2)(����� ǥ������)  
		//         ��������ȯ   (ĳ���� �̶����)          <--------------------------------------------
		
//		byte b = 85;
//		int i = b;  // byte b�� �ڵ����� int������ �ٲ�
		
//		int i = 85;
//		byte b = (byte) i; // ������ ��ȯ���� byte Ÿ������ �ٲ������ (ĳ���� �̶����)
		
//		int i = 300;
//		byte b = (byte)i;   //��������ȯ(���� �ս�)
//		
//		System.out.println(b); //���°��� 44�� 0~256�� byte���� �ʰ��� (300%256=44)�� ���� ��µ�
		
//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); 3(�Ҽ��� ������ �ս�)
//		System.out.println(d); 3.14

		
//		int i = 3;
//		double d = i;
//		System.out.println(d); // 3.0
		
//		byte b = 65;
//		char c = (char)b;  // �����񱳺Ұ��� �ڵ�����ȯ �Ұ� ��������ȯ���� �ٲ������
//		System.out.println(c); // A
		
//		int x = 10;
//		int y = 20;
//		
//		int result = x + y;
		
//		byte b1 = 10;
//		byte b2 = 20;
		
//		byte result = b1 + b2;  // ����������� int������ �ٲ����� ���Ͽ� ���� byte re = int + int 
//		byte result =  (byte) (b1 + b2); // byte re = (byte)(int + int)
		
		
		//������ int���� ���� ����Ÿ���� ��� int������ �ڵ�����ȯ�Ѵ�.
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
//		double result = (double) x / y; // double�� �� ���⶧����  y������ �ڵ����� ��ȯ
//		System.out.println(result);   //  0.6
		
//		String str = "java";
//		double ver = 1.8;
//		
//		String + anyType  ->  String
//		String + double  ->  String + String
//		String result = str + ver;
//		System.out.println(result);
		
		// + => ���, ����, ��ȣ
		
		// ���������� : ���� 1����. ���� 1 ����
		// ++, --
		// �������� ��밡��
		
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
		
		// ���� ������
		// ������ ����ϴ� ����
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
		
//		�񱳿�����
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
		
		// ��������
		// &&, ||, !
		// �� ���� �̻��� ������ Ȯ���Ҷ� ����Ѵ�.
		/*
		int x = 10;
		int y = 20;
		int z = 30;
		
//		System.out.println(x == 10);
//		System.out.println(y == 20);
		
		/* AND ������
		System.out.println(x == 10 && y == 20); //true && true  => true
		System.out.println(x == 10 && y == 30); // true && false => false
		System.out.println(x == 50 && y == 30); // false && false => false
		System.out.println(x == 10 && y == 20 && z == 30); //true && true && true => true
		*/
		
		/* OR ������
		System.out.println(x == 10 || y == 20); //true || true => true
		System.out.println(x == 10 || y == 30); //true || false => true
		*/
		
		/* NOT ������
		System.out.println(!(x == 10)); //!true => false 
		*/
		
		// 3.45 <= 2  doube <= int  -> double <= double -> double
		
		// ���ǿ�����(���׿�����)
		// ���ǽ� ? ���1 : ���2
		// (true or false) ? (true)  (false)
		
		/*
		int result = (x > y) ? x : y; // x �� y���� ��������  false y ����
		System.out.println(result);
		result = (x > y) ? y : x; // x �� y���� ��������  false x ����
		System.out.println(result);
		
		int age = 20;
		String rs = (age >= 20) ? "���� �Դϴ�" : "�̼��� �Դϴ�";
		System.out.println(rs);*/
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("���� �ڸ��� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		System.out.println("�Է¹��� �� : " + num);
		
		// num = num / 10 * 10 + 1 ;
		System.out.println("����� ������� "+ (num / 10 * 10 + 1));
		*/
		
		/*
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		System.out.println("�Է¹��� ��: " + num);
		System.out.println("����� : "+ (num / 10 + 1)* 10);
		*/
		/*
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		
		System.out.println("�Է¹��� ��: " + num);
		int num2 = num;
		num = (num / 10 + 1)*10;
		num2 = num - num2;
		System.out.printf("����� :%d ", num2);
		
	
		/*
		System.out.println(10 - num % 10);
		*/
		
		/*
		System.out.print("��� ����: ");
		int ap = sc.nextInt();
		System.out.println("�� ����� ������ " + ap + "�̸� �ʿ��� �ٱ��� ������ " + (ap + 9) / 10);
		*/
		
		// int buck = ap / 10 + (ap > 0 ? 1 : 0);
		// System.out.println("�� ����� ������ " + ap + "�̸� �ʿ��� �ٱ��� ������ " + buck);
		
		int x = 3;
		System.out.println(x >= 0 && x <= 10);
		System.out.println(x > 0 && x < 10);
		System.out.println(x <= 0 || x >= 10);
		
		
	}
	

}
