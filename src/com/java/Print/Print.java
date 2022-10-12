package com.java.Print;

public class Print {
	int x;
	int y;
	
	/*
	print(){ //생략된 기본 생성자
		super();	//Object()생성자 호출
	} //
	*/
	
	
	
	public Print(int x,int y) {	//(1)진행시 생성자를 만들면 기본생성자가 호출되지 않기 때문에 기본생성자를 만들어주지 않으면 오류가뜸
		this.x=x;
		this.y=y;
	}
	
	
//	Print(){}  // 위에 생성자를 호출할 시 기본생성자를 입력해줘야함
	
	
	
	public String getLocation() {
		return "x : " + x + "y : " +y;
	}
}
