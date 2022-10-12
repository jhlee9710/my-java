package com.java.Array;

public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrayMax객체를 생성한다.
		//2.생성된 객체의 배열에 1 ~ 100사이의 값을 랜덤하게 저장한다.
		//3.메소드를 정의한다.(배열의 최대값을 구해서 반환하도록 한다.)
		//4.반환된 최대값을 출력한다.
		
		ArrayMax am=new ArrayMax();
		
		for(int i=0;i<am.arr.length;i++) {
			am.arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i:am.arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int max = arrayMax(am.arr);
		System.out.println("max= "+max);
		
//		===================================== (나)
		
//		int tmp = 0;
//		int arr2[]=ran(am.arr);
//		
//		for(int i:arr2) {
//			System.out.print(i+" ");
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr2[i]<arr2[j]) {
//					tmp=arr2[j];
//					arr2[i]=arr2[j];
//					
//				}
//			}
//		}System.out.println();
//		System.out.println("배열의 제일 큰 수는 "+tmp+"입니다");
	
		
	}

//	=========================================(나2)
	
//	static int[] ran(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			arr [i]=(int)((Math.random()*100)+1);
//			
//		}
//		int arr2[];
//		arr2=arr;
//		return arr2;
//	}
	
	static int arrayMax(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
	}
		return max;
	
}
}