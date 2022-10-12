package com.java.Array;
import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 배열 : 동일한 타입의 변수를 여러개 정의 하는 것
		
//		int a, b, c, d, e;
//		a = 10;
//		b = 20;
//		c = 30;
//		d = 40;
//		e = 50;
		
//		int[] arr; 				// 배열의 선언
//		arr = new int[5]; 		// 배열의 생성
		
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
		
		// 배열의 활용
		// 순차처리
		// 반복문
		
//		int[] arr = new int[10];
//		
//		// 쓰기
//		for(int i=0; i< arr.length; i++) {
//			arr[i] = 1;
//		}
//		
//		// 읽기
//		for(int i=0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		int[] arr = new int[10];			// 10개의 정수 공간 배열 생성
//		
//		for(int i=0; i<arr.length; i++) {		// 임의의 정수 i가 생성한 배열의 길이보다 클 경우 false. 그 때 까지 i++을 하며 반복
//			arr[i] = i+1;		// 실행문, 생성한 i번째 배열에 i+1을 저장한다.
//		}
//		
//		for(int i=0; i<arr.length; i++) {		// 위와 동일
//			System.out.println(arr[i]);		// 실행문, 생성한 i번째 배열을 출력한다.
//		}
//		
//		int sum = 0;		// 정수인 변수 sum을 선언하고 초기화.
//		
//		for(int i=0; i<arr.length; i++) {		// 위와 동일
//			sum += arr[i];
//		}
//		
//		System.out.println(sum);
//		
//		int odd = 0;
//		int even = 0;
//		
//		for(int i=0; i<arr.length; i++) {		// 위와 동일
//			if(arr[i]%2 == 1) {		// i번째 배열이 홀수인 경우
//				odd += arr[i];
//			}else {					// 그 외의 경우(i번째 배열이 짝수인 경우)
//				even += arr[i];
//			}
//			
//		}
//		System.out.println("홀수: "+odd);
//		System.out.println("짝수: "+even);
		
		// for(변수 : 배열변수명) {
		//	실행문
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
		
//		String[] str = {"사과", "딸기", "포도"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
//		int[] arr = new int[10];
		
		// 난수 1 ~ 100 사이값 중에 10개를 배열 값으로 초기화한다.
		// 배열의 값을 출력한다.
		
//		for(int i : arr) {
//			arr[i] = (int)((Math.random() * 100)+1);
//			System.out.println(arr[i]);
//		}
		
		// 선생님 풀이
		
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
		
		
		// 난수를 사용하여 0 ~ 9 값으로 초기화 한다.
		
//		int arr[] = new int[10];			// 기본값으로 자동초기화된다.
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
//		int n[] = new int[10];		// 기본값으로 자동초기화된다.
//		
//		for(int i=0; i<arr.length; i++) {
//			n[arr[i]]++;		//nArr[0]
//		}
//		
//		System.out.println();
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(i+ " - "+ n[i] + "개");
//		}

		// 실행결과
//		0 - 2개
//		1 - 0개
//		3 - 1개
//		.
//		.
//		.
//		9 - 3개
		
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
		
		// 실행 결과
		// 60 score is 7th place.
		// 70 score is 6th place.
		// 80 score is 4th place.
		// 90 score is 2nd place.
		// 75 score is 5th place.
		// 85 score is 3rd place.
		// .
		// .
		// 30 score is 10th place.
		
		
		// 정렬 : 오름, 내림차
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
//			tmp = arr[x];		// arr[x] → tmp
//			arr[x] = arr[y];	// arr[y] → arr[x]
//			arr[y] = tmp;		// tmp → arr[y]
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
		
//		tmp = arr[1];		// arr[1] → tmp			tmp = 4
//		arr[1]  = arr[3];	// arr[3] → arr[1]		arr[1] = 5
//		arr[3] = tmp;		// tmp → arr[3]			arr[3] = 4
//		
//		System.out.println(tmp+", "+arr[1]+", "+arr[3]);
		
//		int x = 10;
//		int y = 20;
//		int tmp = 0;
//		
//		tmp = x;		// x → tmp
//		x = y;			// y → x
//		y = tmp;		// tmp → y
		
//		String[] name = {"홍길동", "손흥민", "김연아"};
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
//			System.out.println(name[i]+" 메달 "+medal[i]+"개 "+(i+1)+"등");
//		}
		
		// 실행결과

		// 김연아 메달 10개 1등
		// 홍길동 메달 3개 2등
		// 손흥민 메달 2개 3등
		
//		배열 	- 1차원
//			- 다차원(2차원…)		- 정방형, 비정방형(거의 사용할 일이 없음)
		
//		int score[][] = {
//						{1, 2, 3},
//						{4, 5, 6},
//						{7, 8, 9},
//						{10, 11, 12},
//						{13, 14, 15}
//					};
		
//		score = new int[5][3];			// [행][열] [5][3] = 정수인 15(5*3)개의 배열 생성
		
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
//		arr[0][0]	//[행][열]	
//		arr[0]		//[행]
//		arr[1]		//[행]
//		2차원 배열에서 대괄호를 하나만 쓰는 경우가 있는데, 이는 행을 가리킨다.
		
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
		
		// for-each문
		
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
		
		// 선생님 풀이, 피라미드 생성
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행의 크기를 입력하세요: ");
//		int row = sc.nextInt();			// 핵심
//		int col = row * 2 - 1;			// 핵심
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
//		System.out.println("번호  국어   영어   수학   총점    평균");
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
//		System.out.println(" 합계  "+ korTot+" "+engTot+" "+mathTot+" "+(korTot+engTot+mathTot));
		
		// 실행결과
		
		// 번호	국어	영어	수학	총점	평균
		// 1	10	10	10	30	10.0
		// 2	20	20	20	60	20.0
		// 3	30	30	30	90	30.0
		// 4	40	40	40	40	40.0
		// 5	50	50	50	150	50.0
		// 합계	150	150	150	450
		
//		score.length : 행의 크기
//		score[0].length : 첫번째 행의 열의 크기
		
		// 25개의 값을 구성할 수 있는 2차원 배열 생성
		
//		int[][] bingo = new int[5][5];
//		
//		// 임의의 정수 배열에 1~50 난수를 초기화 한다.
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
//		// 값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		boolean flage = true;
//		int selNum = 0;
//		int bingoCnt = 0;
//		
//		while(flage) {
//			System.out.print("빙고를 위해 1 ~ 50 중 하나의 숫자를 입력해주세요: ");
//			selNum = sc.nextInt();
//			
//			
//			for(int i=0; i<bingo.length; i++) {			// 맞는 값을 0으로 치환하는 반복문
//				for(int j=0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == selNum) {
//						bingo[i][j] = 0;
//					}
//					
//					System.out.print(bingo[i][j]+" ");
//				}
//				System.out.println();
//			}
//			for(int i=0; i<bingo.length; i++) {			// 해당 빙고의 칸이 0일 경우, 빙고 카운트를 올리는 반복문
//				for(int j=0; j<bingo[i].length; j++) {
//					if(bingo[i][j] == 0) {
//						bingoCnt++;
//					}else {								// 빙고 칸이 0이어도 모든 칸이 0이 아니라면 빙고 카운트를 초기화.
//						bingoCnt = 0;					
//					}
//				}
//			}
//			if(bingoCnt == 25) {						// 모든 칸이 0이라면(빙고) 메세지 출력 후 반복문의 논리 트리거 OFF
//				System.out.println("All Bingo!");
//				flage = false;
//			}
//			
//		}
		// 배열의 모든 값이 0으로 반경되면 전체 반복문 종료
		
		
		// 선생님 풀이
		
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
//			System.out.print("숫자 입력: ");
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
