package com.java.Print;
//오버라이딩의 예시
public class Print3D extends Print{
	int z;
	
	//상속에서의 생성자의 특징
	//1. 부모생성자를 호출해야한다.
	//2. 호출시에 super()메소드를 사용한다.
	//3. 기본생성자인 경우에는 부모생성자의 기본 생성자를 호출한다.
	//4. 생성자는 상속되지 않는다.(멤버 변수와 메소드만 상속되어진다)
	
//	Print3D(){	//(1)
//		super(10,20);	//Print(int x, int y)
//		this.z=30;
//	}
	
	Print3D(int x,int y,int z){
		super(x,y);	// Print(int x, int y)
		this.z=30;
	}
	
	/*
	print3D(){ //생략된 기본 생성자
		super();	//Print()생성자 호출
	} //
	*/

	// 상속구조에서 사용한다.
	// 부모 메소드의 선언부와 동일해야한다.(리턴타입 포함)
	// 매개변수도 동일해야한다.
	// 실행문은 재정의한다.
	// 부모의 메소드를 사용할때는 super라는 키워드를 사용한다.
	public String getLocation() {	//오버라이딩(재정의)
		return super.getLocation()+" z: " + z;
	}
}
