package com.java.TV;
//import com.java.Print.Print; //멤버변수 허락 받아오기
//import com.java.Print.Print3D;
import com.java.Print.*;
//ctrl + shift + o 자동 import

public class I3dTv extends TV{
	//TV클래스로부터 변수 7개와 메소드6개를 상속받았다.
	boolean i3d;
	
	Print print=new Print(10,20);	//인스턴스 멤버변수,포함관계
	
	void i3dPower() {
		if(i3d) {
			System.out.println("3D가능 동작중");
		}
	}

}
