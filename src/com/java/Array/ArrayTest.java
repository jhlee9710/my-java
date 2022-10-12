package com.java.Array;
import java.util.Random;
import java.util.Scanner;
public class ArrayTest {

	public static void main(String[] args) {
		// 배열: 동일한 타입의 변수를 여러개 정의 하는것
		//int최대값 2147483647
//		int a,b,c,d,e;
//		a=10;
//		b=20;
//		c=30;
//		d=40;
//		e=50;
//		
//		int arr[]={10,20,30,40,50};
//		  //배열의 생성
////		arr[0]=10;
////		arr[1]=20;
////		arr[2]=30;
////		arr[3]=40;
////		arr[4]=50;
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		char ch[]=new char[4];
//		
//		ch[0] = 'G';
//		ch[1] = 'o';		
//		ch[2] = 'o';
//		ch[3] = 'd';
		
//		System.out.println(ch[0]);
//		System.out.println(ch[1]);
//		System.out.println(ch[2]);
//		System.out.println(ch[3]);
		
//		String strArr[]= {"java","jsp","DB"};
//		
//		System.out.println(strArr[1]);
//		strArr[2]="html";
//		System.out.println(strArr[2]);
		
//		int arr1[]= {1,2,3,4,5};
//		int arr2[];
//		int x,y;
//		x=5;
//		y=x;
//		System.out.println(y); //5
//		y=21;
//		System.out.println(y); //21
//		System.out.println(x); //5
//		
//		arr2 = arr1;
//		System.out.println(arr2[2]); //3
//		arr2[2]=50;
//		System.out.println(arr2[2]); //50
//		System.out.println(arr1[2]); //50
		
//		int arr[]=new int[10];
//		//쓰기
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = 1;
//		}
//		//읽기
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
//		==========================================================
		
//		int arr[]=new int[10];
//		int sum=0;
////		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]= i+1;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		System.out.println(sum);
//		
//		int odd=0;
//		int even=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2==1) {
//				odd += arr[i];
//			}else {
//				even+= arr[i];
//			}
//		}
//		System.out.println(odd);
//		System.out.println(even);
		
//		for(변수:배열변수명) {
//			실행문 
//		}
		
//		int arr[]= {1,2,3,4,5};
//		
//		for(int i : arr) {
//			System.out.println(i); //1 2 3 4 5
//		}
//		
//		int sum =0;
//		for(int i:arr) {
//			sum += i;
//		}
//		System.out.println(sum); //15
		
//		==========================================
		
//		String str[] = {"사과","딸기","포도"};
//		
//		for(String s : str) {
//			System.out.println(s);
//		}
		
//		int arr[]= new int[10];
		
		//난수 1 ~ 100 사이값 중에 10개를 배열 값으로 초기화 한다.
		//배열의 값을 출력한다.
		
//		int i=0;
//		int j=0;
//		while(i<10) {
//			j=(int)(Math.random()*99 ) + 1;
//			arr[i]=j;
//			i++;
//			
//			System.out.println(j);
//		}
		
//		===========================================
	

//		for(int i=0;i<arr.length;i++) {
//			int ran=(int)(Math.random()*99  ) + 1;
//			arr[i]=ran;
////			if(arr[i]>max) {
////				max = arr[i];
////			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i=0;i<arr.length;i++) {
//			if(max<arr[i]) {
//				max=arr[i];
//			}
//			if(min>arr[i]) {
//				min=arr[i];
//			}
//		}
//		
//		System.out.println("==============");
//		System.out.println("가장 큰 값은"+max+"이고 가장 작은값은"+min+"입니다");
		
//		=======================================
		
		// 난수를 사용하여 0~9값으로 초기화 한다.
		
//		실행결과
//		0 - ?개
//		1 - ?개
//		2 - ?개
//		. - .
//		. - .
//		9 - ?개
		
//		int arr[]=new int[10];
//		int ran;
//		for(int i=0;i<arr.length;i++) {
//			ran=(int)(Math.random()*10);
//			arr[i]=ran;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+",");
//		}
//		int[] cntArr=new int[10];  // 기본값으로 자동초기화된다
//		
//		for(int i=0;i<arr.length;i++) {
//			cntArr[arr[i]]++;  //cntArr[?]에 ++ (+1)
//		}
////		======================================
//////		for(int i=0;i<arr.length;i++) {
//////			for(int j=0;j<arr.length;j++) {
//////				if(arr[i] == j) { //9,7,0,4,3,7,2,1,7,5
//////					cntArr[j]++; //9-1, 7-3, 0-1
//////				}
//////			}
//////		}
////				
//		System.out.println();
//		for(int i=0;i<cntArr.length;i++) {
//			System.out.println(i+" - " +cntArr[i]);
//		}
//	
//		==========================================================
		
//		int score[]= {60,70,80,90,75,85,95,50,45,30};
//		
//		int rank[]= {1,1,1,1,1,1,1,1,1,1};
//		int i,j;
//		for(i=0;i<score.length;i++) {
//			for(j=0;j<score.length;j++) {
//				if(score[i]<score[j]) {
//					rank[i]++;
//				}
//			}
//			System.out.println(score[i]+"점은 "+rank[i]+"등 입니다.");
//		}
		
	
		
		
//		실행결과
//		60점은 7등 입니다.
//		70점은 6등 입니다.
//		80점은 4등 입니다.
//		90점은 2등 입니다.
//		75점은 5등 입니다.
//		85점은 3등 입니다.
//		95점은 1등 입니다.
//		50점은 8등 입니다...
		
		
	
		
//		===========================================
		
		
		//정렬 : 오름, 내림
//		int[] arr ={2,4,1,5,3};
		
		
//		for(int i=0;i<arr.length*5;i++) {
//			int x= (int)(Math.random()*5);
//			int y= (int)(Math.random()*5);
//			
//			int tmp; 
//			tmp=arr[x]; 
//			arr[x]=arr[y];
//			arr[y]=tmp;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
			
//		======================================
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int tmp;
//					tmp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+", ");
//		}
	
//		======================================
		
//		int arr[]= {2,4,1,5,3};
//		
//		int x=10;
//		int y=20;
//		int temp=0;
//		
//		temp=x;
//		x=y;
//		y=temp;
//		
//		System.out.println(x+" "+y+" "+temp);
		
//		===============================================
		
//		String name[] = {"홍길동","손흥민","김연아"};
//		int medal[] = {3,2,10};
//		
//		for(int i=0;i<medal.length;i++) {
//			for(int j=i+1;j<medal.length;j++) {
//				if(medal[i]<medal[j]) {
//					int tmp;
//					tmp=medal[i];
//					medal[i]=medal[j];
//					medal[j]=tmp;
//					
//					String nTmp;
//					nTmp = name[i];
//					name[i]=name[j];
//					name[j]=nTmp;
//				}
//			}
//		}
//		for(int i=0;i<medal.length;i++) {
//			System.out.println(name[i]+"의 메달 갯수는 "+medal[i]+"개 "+(i+1)+"등");
//		}
//		====================================================
//		
//		String name[] = {"김연아(10개)","손흥민(2개)","홍길동(3개)"};
//		int medal[] = {3,2,10};
//		
//		int tmp;
//		String rtp;
//		for(int i=0;i<medal.length;i++) {
//			for(int j=i;j<medal.length;j++) {
//				if(medal[i]<medal[j]) {
//					tmp=medal[i];
//					medal[i]=medal[j];
//					medal[j]=tmp;
//				}
//				
//					rtp=name[i];
//					name[i]=name[j];
//					name[j]=rtp;
//				}
//			}
//			
//		}
//		for(int i=0;i<medal.length;i++) {
//			System.out.println(name[i]+"의 메달 갯수는 "+medal[i]+"개"+ (i+1) +"등");
//		}
		
//		=====================================================
		
//		배열  - 1차원
//			- 다차원(2차원) - 정방형, 비정방형
			
//		int score[][];
//		score =new int[5][3];
////		
//		score[0][0]=1;
//		score[0][1]=2;
//		score[0][2]=3;
//		score[1][0]=4;
//		score[1][1]=5;
//		score[1][2]=6;
//		score[2][0]=7;
//		score[2][1]=8;
//		score[2][2]=9;
//		score[3][0]=10;
//		score[4][2]=15;
//		

		
		
//		int score[][]=  {
//			{1,2,3},
//			{4,5,6},
//			{7,8,9},
//			{10,11,12},
//			{13,14,15}
//		};
////		
////		
////		System.out.println(score[0][0]);
////		System.out.println(score[0][1]);
////		System.out.println(score[0][2]);
////		System.out.println(score[1][0]);
////		System.out.println(score[1][1]);
////		System.out.println(score[4][2]);
//		
////		================================================
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(score[i][j]+" " );
//			}
//			System.out.println();
//		}
		
//		for(int i=0;i<score.length;i++) {
//		for(int j=0;j<score[i].length;j++) {
//			System.out.print(score[i][j]+" " );
//		}
//		System.out.println();
//		}
		
		
//		
//		for(int[] i:score) {
//			for(int j:i) {
//				System.out.print(j+"  ");
//			}
//			System.out.println();
//		}
		
//		=======================================================
		
//		int arr [][]=new int[2][5];
//		int num=1;        
//
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]= (i*5)+j+1;  //==num++;
//				
//			}
//		}
//		
//		for(int[] i:arr) {
//			for(int j:i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		=====================================================
		
//		int arr[][]=new int[5][3];
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=(i*3)+j+1;
//			}
//		}
//		
//		for(int[]i:arr) {
//			for(int j:i) {	
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
//		====================================================
		
//		char star[][]=new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i>=j) {
//				star[i][j]='*';
//			}
//		}
//		}
//		
//		for(char[] i:star) {
//			for(char j:i) {
//				System.out.print(j);
//			}System.out.println();
//		}
			
//		==========================================
		/*실행결과를 2차원 배열을 사용하여 만들어라 
		  *****
		  ****
		  ***
		  **
		  *
		 */
//		char star[][]=new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j<=4) {
//				star[i][j]='*';
//				}
//		
//		}
//		}
//		
//		for(char[] i:star) {
//			for(char j:i) {
//				System.out.print(j);
//			}System.out.println();
//		}
		
		/*
		  실행결과
		      *
		     **
		    ***
		   ****
		  *****
		 
		 */
		
//		char star[][]=new char[5][5];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j>=4) {
//				star[i][j  ]='*';
//				}
//		
//		}
//		}
//		
//		for(char[] i:star) {
//			for(char j:i) {
//				System.out.print(j);
//			}System.out.println();
//		}
		
//		================================
		//if문 작성법
//		char star[][]=new char[5][9];
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j>=4 && j-i<=4 ) {
//				star[i][j]='*';
//					
//				}
//		
//		}
//		}
//		
//		for(char[] i:star) {
//			for(char j:i) {
//				System.out.print(j);
//			}System.out.println();
//		}
		
		//for문 작성법 (좀 더 유연함)
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("행의 크기를 입력하세요: ");
//		int row=sc.nextInt();
//		int col=row*2-1;
		
//		char star[][]=new char[5][9];
//		
//		for(int i=0;i<star.length;i++) {
//			int starCnt = 2*i+1;   // 1,3,5,7,9
//			int starStart = star.length - (i+1);  // 4,3,2,1,0
//			for(int j=starStart;j<starStart+starCnt;j++) {
//
//				star[i][j] = '*';
//			}
//		}
//		
//		for(char i[]:star) {
//			for(char j:i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
		
//		===================================
		
//		char star[][]= {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'},
//		};
//		
//		   
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				System.out.print(star[i][j]);
//				}
//			System.out.println();
//		}
//		
//		char result[][]=new char[star[0].length][star.length];
//		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				int x=j;
//				int y=3-i;
//				
//				result[x][y] = star[i][j];
//			}
//		}
//		
//		System.out.println();
//		System.out.println();
//		
//		for(char i[]:result) {
//			for(char j:i) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		int score[][]= {
//				{10,10,10},
//				{20,20,20},
//				{30,30,30},
//				{40,40,40},
//				{50,50,50}
//		};
		
//		System.out.println("번호  국어  영어  수학  총점  평균");
//		int sum;
//		float avg=0;
//		int as=0;
//		for(int i=0;i<score.length;i++) {
//			sum=0;
//			System.out.print(" "+(i+1)+" ");
//			for(int j=0;j<score[i].length;j++) {
//				sum+=score[i][j];
//				avg=sum/3;
//			
//				System.out.print(" "+score[i][j]+" ");
//			}avg=sum/3;
//		System.out.print(" "+sum+"  "+avg);
//			
//			System.out.println();
//		}		
//		System.out.println("합계");
		
//		==================================================
		
//		System.out.println("번호  국어  영어  수학  총점  평균");
//		int sum;
//		int korTot=0;
//		int engTot=0;
//		int matTot=0;
//		for(int i=0;i<score.length;i++) {
//			korTot+=score[i][0];
//			engTot+=score[i][1];
//			matTot+=score[i][2];
//			sum=0;
//			System.out.print(" "+(i+1)+" ");
//			for(int j=0;j<score[i].length;j++) {
//				sum += score[i][j];
//				System.out.print(" "+score[i][j]+" ");
//			}
//			System.out.print(" "+sum+"  ");
//			double avg = sum/(double)score[i].length;
//			System.out.print(avg);
//			System.out.println();
//		}		
//		int Tot=korTot+engTot+matTot;
//		System.out.print("합계 "+korTot+" "+engTot+" "+matTot+"  "+Tot);

		// score.length : 행의 크기
		// score[0].lenght : 첫번째 행의 열의 크기
		
		// 25개의 값을 구성할 수 있는 2차원 배열 생성
		Scanner sc= new Scanner(System.in);
		int bingo[][]=new int[5][5];
		boolean flage =true;
		int ans[][]=new int[5][5];
		int num;

		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j]=(int)(Math.random()*50)+1;
				ans[i][j]=bingo[i][j];
			}
		}

		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				System.out.print(bingo[i][j]+" ");

			}System.out.println();
		}
		
		
//		while(flage) {
//			System.out.println("숫자 입력: ");
//			num=sc.nextInt();
//			
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//					if(bingo[i][j]==num) {
//						bingo[i][j]=0;
//					}
//					System.out.print(bingo[i][j] +" ");
//				}
//				System.out.println();
//			}
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0;j<bingo[i].length;j++) {
//			
//				}
//			}
//		}
		
		
		
		int x;
		for(;true;) {
			System.out.println("숫자를 입력 하세요: ");
			x=sc.nextInt();
			int sum=0;
			for(int i=0;i<bingo.length;i++) {
				for(int j=0;j<bingo[i].length;j++) {
					if(bingo[i][j]==x) {
						bingo[i][j]=0;
						
					}
					sum+=bingo[i][j];
					System.out.print(bingo[i][j] +" ");
				}
				if(sum==0) {
					break;
				}
				System.out.println();
			}
			
		}
//				
//			
//		
//		System.out.println();
//		for(int i[]:ans) {
//			for(int j:i) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}
			

		
		
		
		
		
		
		
		
		
		
	}	
}
