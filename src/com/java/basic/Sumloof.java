package com.java.basic;

public class Sumloof {
	
	public static void main(String[] args) {
//	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
	/*
	i값은 계속 +1 (1,2,3,4,5)
	1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
	*/
	
		int i;
		int j;
		int sum=0;
		for(i=1;i<=10;i++) {
			for(j=i-1;j<=10;j++) {
				System.out.println(i+ "+" + j + "=" + (i+j));
			}
				
			System.out.println(i+ "+" + j + "=" + (i+j));
	
		}
	
	
	}
}
