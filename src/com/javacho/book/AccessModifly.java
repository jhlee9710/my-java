package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModifly {

	public static void main(String[] args) {
		// ����������
		// private < default < protected < public
		// public : ��� ��Ű�� ��ο��� ��밡��
		// protected : ���� ��Ű�� or ��� ���� ���迡 �ִ� �ٸ� ��Ű�� ��밡��
		// default : ���� ��Ű������ ��밡��
		// private : Ŭ���� �������� ��밡��
		
		// Ŭ����: public, default
		// ����: public, protected, default, private 
		// ������: public, protected, default, private 
		// �޼ҵ�: public, protected, default, private 
		// �� ���������� ���Ұ�
		
		// public�� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
		// �� protected�� ��ӿ� ���� �ٸ� ��Ű������ ����� �����ϴ�.
		
		B b= new B(10);	//public ���� ����
//		C c= new C(10); //public�� ������ ���� �Ұ��� (error):�����ڰ� default �̱� ������
//		E e= new E(30);	//private ������ ��� �Ұ��� (error):�����ڰ� private �̱� ������
//		F f= new F(20); //protected ������ ��� �Ұ��� (error):�����ڰ� protected �̱� ������
		
		
	}

}
