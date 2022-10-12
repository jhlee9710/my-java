package com.java.Class;

public class Student {

	String name; //학생 이름
	int ban; //반
	int no;//학생 번호
	int kor;//국어 점수
	int eng;//영어 점수
	int math;//수학 점수
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	int getTotal() {
		return kor + eng + math;
	}
	double getAberage() {
		return (int)(getTotal()/3.0*10+0.5)/10.0;
	
		
	}
	
	
}
