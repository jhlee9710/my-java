package com.java.Class;

public class Func {
	
	//�޼ҵ�(�Լ�) : ��ü�� ����� �����Ѵ�.
	
//	����Ÿ�� �޼ҵ��(�Ű�����1, �Ű�����2,...) {
//		���๮��
//		[return ��]=�ʼ��� �ƴ�
//	}
	
	// ����Ÿ�� : void,�⺻�ڷ���,������
	// �޼ҵ�� : ��Ÿǥ���
	// �Ű����� : int x, double d, Tv t
	// return : ����Ÿ���� void�� �ƴ� ��쿡 ����Ѵ�.
	
	void add() {  //�޼ҵ��� ����ȭ(�ñ״�ó)
		System.out.println(2+3);  //�޼ҵ��� ������
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
			System.out.println("�Լ��� ����");
			return; //�Լ��� ��� ����
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
