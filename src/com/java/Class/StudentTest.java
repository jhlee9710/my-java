package com.java.Class;

public class StudentTest {

	public static void main(String[] args) {
	/*
		Student s1=new Student("홍길동",10,3);
		Student s2=new Student("이순신",10,3);
		Student s3=new Student("강감찬",10,3);
	
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
		//국어 : 100
		//영어 : 60
		//숫자 : 76
		
		//실행결과
		//이름: 홍길동
		//총점: 236점
		//평균: 78.7 (소수점 둘째 자리에서 반올림한다.)
		
		Student s1=new Student("홍길동",3,10,100,60,76);
		
		System.out.println("이름 : "+s1.name);
		System.out.println("총점 : "+s1.getTotal());
		System.out.println("평균 : "+s1.getAberage());
		
		

	}

}
