package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModifly {

	public static void main(String[] args) {
		// 접근제어자
		// private < default < protected < public
		// public : 모든 패키지 경로에서 사용가능
		// protected : 같은 패키지 or 상속 받은 관계에 있는 다른 패키지 사용가능
		// default : 같은 패키지에서 사용가능
		// private : 클래스 내에서만 사용가능
		
		// 클래스: public, default
		// 변수: public, protected, default, private 
		// 생성자: public, protected, default, private 
		// 메소드: public, protected, default, private 
		// 단 지역변수는 사용불가
		
		// public한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
		// 단 protected는 상속에 의해 다른 패키지에서 사용이 가능하다.
		
		B b= new B(10);	//public 접근 가능
//		C c= new C(10); //public이 없으니 접근 불가능 (error):생성자가 default 이기 때문에
//		E e= new E(30);	//private 생성자 사용 불가능 (error):생성자가 private 이기 때문에
//		F f= new F(20); //protected 생성자 사용 불가능 (error):생성자가 protected 이기 때문에
		
		
	}

}
