package com.java.basic;

public class Overloding {
	//�����ε� : �޼ҵ�� ���ǽ� ����ϴ� ���
	//1.�޼ҵ��� �̸��� �����ϰ� �����Ѵ�.
	//2.�� �ŰԺ����� Ÿ�� �Ǵ� ������ �޶���Ѵ�.
	//3.����Ÿ�԰��� �����ϴ�.
	//4.��ü�� ������ ������ ����
	
	void add() {}
	
	void add(int x) {}
	
	void add(long x) {}
	
	void add(int x,int y) {System.out.println(x+y);}
	
	void add(int x,long y) {}
	
	void add(long x,int y) {}
	
	void add(char x) {}
	
	
}
