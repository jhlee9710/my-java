package com.java.Array;

public class ArraySolo {

	public static void main(String[] args) {
		//1.ArrayMax객체를 생성한다.
		//2.생성된 객체의 배열에 1 ~ 100사이의 값을 랜덤하게 저장한다.
		//3.메소드를 정의한다.(배열의 최대값을 구해서 반환하도록 한다.)
		//4.반환된 최대값을 출력한다.
		
		ArrayMax am = new ArrayMax();
		
		for(int i=0;i<am.arr.length;i++) {
			am.arr[i]=(int)(Math.random()*100)+1;
		}
		for(int i:am.arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int max=max(am.arr);

	}
	
	static int max(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("max="+max);
		
		
		return max;
	}
	
}
