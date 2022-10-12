package com.java.Array;
import java.util.Scanner;

public class Bingo {
	public static void main(String[] args) {
		//선생님 풀이
		
		int [][] bingo = new int[5][5];
		
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = (int)(Math.random() * 50)+1;
			}
		}
		
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				System.out.print(bingo[i][j]+" ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		boolean flage = true;
		int sum = 0;
		int num = 0;
		
		while(flage) {
			System.out.print("숫자 입력: ");
			num = sc.nextInt();
			
			sum = 0;
			
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(bingo[i][j] == num) {
						bingo[i][j] = 0;
					}
					//
					sum += bingo[i][j];
					System.out.print(bingo[i][j]+" ");
				}
				System.out.println();
			}
			
			//
			System.out.println("sum= "+sum);
			if(sum == 0) {
				flage = false;
			}
		}
		System.out.println("GAME OVER");
	}
}
