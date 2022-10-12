package com.java.inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable aa = f;
		
//		if(f instanceof 클래스명 or 인터페이스명)
		if(f instanceof Unit) {
			System.out.println("Unit은 조상 클래스이다.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("Fightable은 조상 클래스이다.");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable은 조상 클래스이다.");
		}
		

	}

}
