package com.java.Array;

public class ArrayMaxTest {

	public static void main(String[] args) {
		//1.ArrayMax��ü�� �����Ѵ�.
		//2.������ ��ü�� �迭�� 1 ~ 100������ ���� �����ϰ� �����Ѵ�.
		//3.�޼ҵ带 �����Ѵ�.(�迭�� �ִ밪�� ���ؼ� ��ȯ�ϵ��� �Ѵ�.)
		//4.��ȯ�� �ִ밪�� ����Ѵ�.
		
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
		
//		===================================== (��)
		
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
//		System.out.println("�迭�� ���� ū ���� "+tmp+"�Դϴ�");
	
		
	}

//	=========================================(��2)
	
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