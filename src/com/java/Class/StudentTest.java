package com.java.Class;

public class StudentTest {

	public static void main(String[] args) {
	/*
		Student s1=new Student("ȫ�浿",10,3);
		Student s2=new Student("�̼���",10,3);
		Student s3=new Student("������",10,3);
	
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.grade);
		
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.grade);
		
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.grade);
	*/
		//���� : 100
		//���� : 60
		//���� : 76
		
		//������
		//�̸�: ȫ�浿
		//����: 236��
		//���: 78.7 (�Ҽ��� ��° �ڸ����� �ݿø��Ѵ�.)
		
		Student s1=new Student("ȫ�浿",3,10,100,60,76);
		
		System.out.println("�̸� : "+s1.name);
		System.out.println("���� : "+s1.getTotal());
		System.out.println("��� : "+s1.getAberage());
		
		

	}

}
