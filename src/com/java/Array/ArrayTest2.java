package com.java.Array;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// �迭 : ������ Ÿ���� ������ ������ ���� �ϴ� ��
		
//		int a, b, c, d, e;
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
		
//		int[] arr; 				// �迭�� ����
//		arr = new int[5]; 		// �迭�� ����
		
//		int[] arr = new int[5];
		
//		int[] arr = {10, 20, 30, 40, 50};
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		char[] cArr = new char[4];
//		cArr[0] = 'G';
//		cArr[1] = 'o';
//		cArr[2] = 'o';
//		cArr[3] = 'd';
		
//		char[] cArr = {'G', 'o', 'o', 'd'};
//		
//		System.out.println(cArr[0]);
		
//		String[] strArr = {"java", "jsp", "DB"};
//		
//		System.out.println(strArr[1]);
//		strArr[2] = "html";
//		System.out.println(strArr[2]);
		
		// int x = 10;
		// int y;
		
		// y = x;
		
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2;
//		
//		arr2 = arr1;
//		
//		System.out.println(arr1[0]);
//		System.out.println(arr2[0]);
//		
//		arr2[3] = 10;
//		
//		System.out.println(arr1[3]);
//		System.out.println(arr2[3]);
		
		// �迭�� Ȱ��
		// ����ó��
		// �ݺ���
		
//		int[] arr = new int[10];
//		
//		// ����
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = 1;
//		}
//		
//		// �б�
//		for(int i=0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];			// 10���� ���� ���� �迭 ����
//		
//		for(int i=0; i<arr.length; i++) {		// ������ ���� i�� ������ �迭�� ���̺��� Ŭ ��� false. �� �� ���� i++�� �ϸ� �ݺ�
//			arr[i] = i+1;		// ���๮, ������ i��° �迭�� i+1�� �����Ѵ�.
//		}
//		
//		for(int i=0; i<arr.length; i++) {		// ���� ����
//			System.out.println(arr[i]);		// ���๮, ������ i��° �迭�� ����Ѵ�.
//		}
//		
//		int sum = 0;		// ������ ���� sum�� �����ϰ� �ʱ�ȭ.
//		
//		for(int i=0; i<arr.length; i++) {		// ���� ����
//			sum += arr[i];
//		}
//		
//		System.out.println(sum);
//		
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=0; i<arr.length; i++) {		// ���� ����
//			if(arr[i]%2 == 1) {		// i��° �迭�� Ȧ���� ���
//				odd += arr[i];
//			}else {					// �� ���� ���(i��° �迭�� ¦���� ���)
//				even += arr[i];
//			}
//			
//		}
//		System.out.println("Ȧ��: "+odd);
//		System.out.println("¦��: "+even);
		
		// for(���� : �迭������) {
		//	���๮
		// {
		
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		for(int i : arr){
//			System.out.println(i);
//		}
//		
//		
//		int sum = 0;
//		for(int i : arr) {
//			sum += i;
//		}
		
//		String[] str = {"���", "����", "����"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
//		int[] arr = new int[10];
		
		// ���� 1 ~ 100 ���̰� �߿� 10���� �迭 ������ �ʱ�ȭ�Ѵ�.
		// �迭�� ���� ����Ѵ�.
		
//		for(int i : arr) {
//			arr[i] = (int)((Math.random() * 100)+1);
//			System.out.println(arr[i]);
//		}
		
		// ������ Ǯ��
		
//		int[] arr = new int[10];
//		
//		for(int i=0; i<arr.length; i++) {
//			int ran = (int)(Math.random() * 100)+1;
//			arr[i] = ran;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("==========");
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i=0; i<arr.length;i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			} else if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("max= "+max+", "+"min= "+min);
		
		
		// ������ ����Ͽ� 0 ~ 9 ������ �ʱ�ȭ �Ѵ�.
		
//		int arr[] = new int[10];			// �⺻������ �ڵ��ʱ�ȭ�ȴ�.
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random() * 9);
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			if(i == 9) {
//				System.out.print(arr[i]);
//			}else {
//				System.out.print(arr[i] + ", ");
//			}
//		}
//		
//		int n[] = new int[10];		// �⺻������ �ڵ��ʱ�ȭ�ȴ�.
//		
//		for(int i=0; i<arr.length; i++) {
//			n[arr[i]]++;		//nArr[0]
//		}
//		
//		System.out.println();
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+ " - "+ n[i] + "��");
//		}

		// ������
//		0 - 2��
//		1 - 0��
//		3 - 1��
//		.
//		.
//		.
//		9 - 3��
		
//		int[] score = {60, 70, 80, 90, 75, 85, 95, 50, 45, 30};
//		int[] rank = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
//		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score.length; j++) {
//				if(score[i] < score[j]) {
//					rank[i]++;
//				}
//			}
//		}
//		
//		for(int i=0; i<score.length; i++) {
//			if(rank[i] == 1) {
//				System.out.println(+score[i]+"score is "+rank[i]+"st place.");
//			}else if(rank[i] == 2) {
//				System.out.println(+score[i]+"score is "+rank[i]+"nd place.");
//			}else if(rank[i] == 3) {
//				System.out.println(+score[i]+"score is "+rank[i]+"rd place.");
//			}else {
//				System.out.println(+score[i]+"score is "+rank[i]+"th place.");
//			}
//		}
		
		// ���� ���
		// 60 score is 7th place.
		// 70 score is 6th place.
		// 80 score is 4th place.
		// 90 score is 2nd place.
		// 75 score is 5th place.
		// 85 score is 3rd place.
		// .
		// .
		// 30 score is 10th place.
		
		
		// ���� : ����, ������
//		int[] arr = {2, 4, 1, 5, 3};
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i +1; j<arr.length; j++) {
//				if(arr[i] < arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			if(i == 4) {
//				System.out.print(arr[i]);
//			}else {
//				System.out.print(arr[i] + ", ");	
//			}
//		}
		
//		
//		for(int i=0; i<arr.length * 5; i++) {
//			int x = (int)(Math.random() * 5);
//			int y = (int)(Math.random() * 5);
//			
//			int tmp;
//			tmp = arr[x];		// arr[x] �� tmp
//			arr[x] = arr[y];	// arr[y] �� arr[x]
//			arr[y] = tmp;		// tmp �� arr[y]
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			if(i == 4) {
//				System.out.print(arr[i]);
//			}else {
//				System.out.print(arr[i]+", ");
//			}
//		}
		
		
//		int tmp;
		
//		tmp = arr[1];		// arr[1] �� tmp			tmp = 4
//		arr[1]  = arr[3];	// arr[3] �� arr[1]		arr[1] = 5
//		arr[3] = tmp;		// tmp �� arr[3]			arr[3] = 4
//		
//		System.out.println(tmp+", "+arr[1]+", "+arr[3]);
		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
//		
//		tmp = x;		// x �� tmp
//		x = y;			// y �� x
//		y = tmp;		// tmp �� y
		
//		String[] name = {"ȫ�浿", "�����", "�迬��"};
//		int[] medal = {3, 2, 10};
//		
//		
//		for(int i=0; i<medal.length; i++) {
//			for(int j=0; j<medal.length; j++) {
//				if(medal[i] > medal[j]) {
//					int tmp;
//					tmp = medal[i];
//					medal[i] = medal[j];
//					medal[j] = tmp;
//					
//					String nTmp;
//					nTmp = name[i];
//					name[i] = name[j];
//					name[j] = nTmp;
//				}
//			}
//		}
//		
//		for(int i=0; i<medal.length; i++) {
//			System.out.println(name[i]+" �޴� "+medal[i]+"�� "+(i+1)+"��");
//		}
		
		// ������

		// �迬�� �޴� 10�� 1��
		// ȫ�浿 �޴� 3�� 2��
		// ����� �޴� 2�� 3��
		
//		�迭 	- 1����
//			- ������(2������)		- ������, ��������(���� ����� ���� ����)
		
//		int score[][] = {
//						{1, 2, 3},
//						{4, 5, 6},
//						{7, 8, 9},
//						{10, 11, 12},
//						{13, 14, 15}
//					};
		
//		score = new int[5][3];			// [��][��] [5][3] = ������ 15(5*3)���� �迭 ����
		
//		score[0][0] = 1;
//		score[0][1] = 2;
//		score[0][2] = 3;
//		
//		score[1][0] = 4;
//		score[1][1] = 5;
//		score[1][2] = 6;
//		
//		score[2][0] = 7;
//		score[2][1] = 8;
//		score[2][2] = 9;
//		
//		score[3][0] = 10;
//		score[3][1] = 11;
//		score[3][2] = 12;
//		
//		score[4][0] = 13;
//		score[4][1] = 14;
//		score[4][2] = 15;
		
//		System.out.println(score[0][0]);
//		System.out.println(score[0][1]);
//		System.out.println(score[0][2]);
//		
//		System.out.println(score[4][2]);
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr;
//		
//		arr[0][0]	//[��][��]	
//		arr[0]		//[��]
//		arr[1]		//[��]
//		2���� �迭���� ���ȣ�� �ϳ��� ���� ��찡 �ִµ�, �̴� ���� ����Ų��.
		
//		for(int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.print(score[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		for(int[] i : score) {
//			for(int j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//int num = 0;
//		int[][] arr = new int[2][5];
//		
//		for(int i=0; i<arr.length; i++) {		//0, 1
//			for(int j=0; j<arr[i].length; j++) {		//0, 1, 2, 3, 4
//				arr[i][j] = (i*5) + j + 1;			//1, 2, 3, 4, 5
//													//6, 7, 8, 9, 10
//				System.out.println(arr[i][j]);
//			}
//		}
		
		// for-each��
		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr = new int[5][3];
//		int num = 0;
//		
//		for(int i=0; i<arr.length; i++) {			// 0, 1, 2, 3, 4
//			for(int j =0; j<arr[i].length; j++) {	// 0, 1, 2
//				arr[i][j] = (i*3)+j+1;
//			}
//		}
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/*
		 *
		 **
		 ***
		 ****
		 *****
		 */
		
//		char [][] star = new char[5][5];
//		
//		for(int i=0; i<star.length; i++) {
//			for(int j=0; j<star[i].length; j++) {
//				if(i >= j) {
//					star[i][j] = '*';
//				}
//			}
//		}
		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		char [][] star = new char[5][5];
//		
//		for(int i=0; i<star.length; i++) {
//			for(int j=0; j<star[i].length; j++) {
//				if(i + j <= 4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		char [][] star = new char[5][5];
//		
//		for(int i=0; i<star.length; i++) {
//			for(int j=0; j<star[i].length; j++) {
//				if(i + j >= 4) {
//					star[i][j] = '*';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		/*
		 *
		***
	   *****
	  *******
	 *********
		 */
		
//		char [][] star = new char[5][9];
		
//		for(int i=0; i<star.length; i++) {			// 0, 1, 2, 3, 4
//			for(int j=0; j<star[i].length; j++) {
//				if(i+j >= 4) {
//					star[i][j] = '*';
//				}
//				if(i<j-4) {
//					star[i][j] = ' ';
//				}
//			}
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		// ������ Ǯ��, �Ƕ�̵� ����
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� ũ�⸦ �Է��ϼ���: ");
//		int row = sc.nextInt();			// �ٽ�
//		int col = row * 2 - 1;			// �ٽ�
//		
//		char [][] star = new char[row][col];
//		
//		for(int i=0; i<star.length; i++) {
//			int starCnt = 2*i+1;		//1, 3, 5, 7, 9
//			int starStart = star.length - (i+1);	 // 4, 3, 2, 1, 0
//			
//			for(int j=starStart; j<starStart+ starCnt; j++) {
//				star[i][j] = '*';
//			}
//			
//			
//		}
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		char[][] star = {
//				{'*', '*', ' ', ' ', ' '},			// {'*', '*', '*', '*'},
//				{'*', '*', ' ', ' ', ' '},			// {'*', '*', '*', '*'},
//				{'*', '*', '*', '*', '*'},			// {'*', '*', ' ', ' '},
//				{'*', '*', '*', '*', '*'}			// {'*', '*', ' ', ' '},
//													// {'*', '*', ' ', ' '}
//		};
		
//		for(int i=0; i<star.length; i++) {
//			for(int j=0; j<star[i].length; j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		
//		char [][] result = new char[star[0].length][star.length];		// 5, 4
		
		// x = j
		// y = 3 - i
		
//		for(int i=0; i<star.length; i++) {
//			for(int j=0; j<star[i].length; j++) {
//				int x = j;
//				int y = 3 - i;
//				
//				result[x][y] = star[i][j];
//			}
//		}
//		
//		for(char[] i : result) {
//			for(char j : i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		int[][] score = {
//				{10, 10, 10},
//				{20, 20, 20},
//				{30, 30, 30},
//				{40, 40, 40},
//				{50, 50, 50}
//		};
//		
//		int[] sum = new int[5];
//		double[] avg = new double[5];
//		int korTot = 0;
//		int engTot = 0;
//		int mathTot = 0;
//		
//		System.out.println("��ȣ  ����   ����   ����   ����    ���");
//		
//		for(int i=0; i<score.length; i++) {
//			korTot += score[i][0];
//			engTot += score[i][1];
//			mathTot += score[i][2];
//			System.out.print(" "+(i + 1)+ "  ");
//			for(int j=0; j<score[i].length; j++) {
//				sum[i] += score[i][j];
//				avg[i] = sum[i] / 3;
//				System.out.print(score[i][j]+"  ");
//			}
//			System.out.print(sum[i]);
//			System.out.print("  "+avg[i]);
//			System.out.println();
//		}
//		
//		System.out.println(" �հ�  "+ korTot+" "+engTot+" "+mathTot+" "+(korTot+engTot+mathTot));
		
		// ������
		
		// ��ȣ	����	����	����	����	���
		// 1	10	10	10	30	10.0
		// 2	20	20	20	60	20.0
		// 3	30	30	30	90	30.0
		// 4	40	40	40	40	40.0
		// 5	50	50	50	150	50.0
		// �հ�	150	150	150	450
		
//		score.length : ���� ũ��
//		score[0].length : ù��° ���� ���� ũ��
		
		// 25���� ���� ������ �� �ִ� 2���� �迭 ����
		
//		int[][] bingo = new int[5][5];
//		
//		// ������ ���� �迭�� 1~50 ������ �ʱ�ȭ �Ѵ�.
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				bingo[i][j] = (int)(Math.random() * 50)+1;
//			}
//		}
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				System.out.print(bingo[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		// ���� �Է��ϰ� �迭�� ���� ���� ������ 0���� �����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int selNum = 0;
//		int bingoCnt = 0;
//		
//		while(flage) {
//			System.out.print("���� ���� 1 ~ 50 �� �ϳ��� ���ڸ� �Է����ּ���: ");
//			selNum = sc.nextInt();
//			
//			
//			for(int i=0; i<bingo.length; i++) {			// �´� ���� 0���� ġȯ�ϴ� �ݺ���
//				for(int j=0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == selNum) {
//						bingo[i][j] = 0;
//					}
//					
//					System.out.print(bingo[i][j]+" ");
//				}
//				System.out.println();
//			}
//			for(int i=0; i<bingo.length; i++) {			// �ش� ������ ĭ�� 0�� ���, ���� ī��Ʈ�� �ø��� �ݺ���
//				for(int j=0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == 0) {
//						bingoCnt++;
//					}else {								// ���� ĭ�� 0�̾ ��� ĭ�� 0�� �ƴ϶�� ���� ī��Ʈ�� �ʱ�ȭ.
//						bingoCnt = 0;					
//					}
//				}
//			}
//			if(bingoCnt == 25) {						// ��� ĭ�� 0�̶��(����) �޼��� ��� �� �ݺ����� �� Ʈ���� OFF
//				System.out.println("All Bingo!");
//				flage = false;
//			}
//			
//		}
		// �迭�� ��� ���� 0���� �ݰ�Ǹ� ��ü �ݺ��� ����
		
		
		// ������ Ǯ��
		
//		int [][] bingo = new int[5][5];
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				bingo[i][j] = (int)(Math.random() * 50)+1;
//			}
//		}
//		
//		for(int i=0; i<bingo.length; i++) {
//			for(int j=0; j<bingo[i].length; j++) {
//				System.out.print(bingo[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int sum = 0;
//		int num = 0;
//		
//		while(flage) {
//			System.out.print("���� �Է�: ");
//			num = sc.nextInt();
//			
//			sum = 0;
//			
//			for(int i=0; i<bingo.length; i++) {
//				for(int j=0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == num) {
//						bingo[i][j] = 0;
//					}
//					//
//					sum += bingo[i][j];
//					System.out.print(bingo[i][j]+" ");
//				}
//				System.out.println();
//			}
//			
//			//
//			System.out.println("sum= "+sum);
//			if(sum == 0) {
//				flage = false;
//			}
//		}
//		System.out.println("GAME OVER");
	}
}
