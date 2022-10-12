package com.java.Class;

public class CardTest {
	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.number = 1;
		c1.kind = "Heart";
		
		Card c2 = new Card();
		c2.number = 3;
		c2.kind = "Spade";
		
		System.out.println(c1.number);
		System.out.println(c1.kind);
		
		System.out.println(c2.number);
		System.out.println(c2.kind);
		
		System.out.println(Card.height);
		System.out.println(Card.width);
		
//		System.out.println(Card.cv);
//		
//		Card c1 = new Card();
//		c1.iv = 10;
//		
//		Card c2 = new Card();
//		c2.iv = 20;
//		
//		System.out.println("c1.iv = "+c1.iv);
//		System.out.println("c2.iv = "+c2.iv);
//		
//		System.out.println("c1.cv = "+c1.cv);
//		System.out.println("c2.cv = "+c2.cv);
//		
//		c1.cv = 80;
//		
//		System.out.println("c1.cv = "+c1.cv);
//		System.out.println("c2.cv = "+c2.cv);
//		
//		Card.cv = 200;
//		
//		System.out.println("c1.cv = "+c1.cv);
//		System.out.println("c2.cv = "+c2.cv);
	}
}
