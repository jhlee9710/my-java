package com.java.inter;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Moveable ma = new Fighter();
		Attackable aa = f;
		
//		if(f instanceof Ŭ������ or �������̽���)
		if(f instanceof Unit) {
			System.out.println("Unit�� ���� Ŭ�����̴�.");
		}
		
		if(f instanceof Fightable) {
			System.out.println("Fightable�� ���� Ŭ�����̴�.");
		}
		
		if(f instanceof Moveable) {
			System.out.println("Moveable�� ���� Ŭ�����̴�.");
		}
		

	}

}
