package com.java.basic;
import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {


		// 반복문 : 실행문을 여러번 동작하게 한다.
		// for, while, do-while
		
		// for(초기값; 조건식; 증감식) {
		// 실행문
		// }

		
//		for(;true;) {  //무한 반복문
//			System.out.println(i+"Hello");
//		}

//		for(int i=1;i<=5;i++) {
//			System.out.println(i*2);
//		}
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
		
//		int sum = 0;
//		for(int i=1;i<=1000;i++)
//		{
//			sum= sum+i;
//		}
//		System.out.println(sum);
		  
//		=======================================================
		
//		int suma=0;
//		int sumb=0;
//		
//		for(int i=1;i<=10;i++) {
//			if(i % 2 == 0)
//				suma= suma+i;
//			else
//				sumb= sumb+i;
//			
//		}
//		System.out.println("짝수의 합: "+ suma);
//		System.out.println("홀수의 합: "+ sumb);
		
//		=======================================================
		
		// 초기값
		// wihle(조건식) { 
		// 실행문
		// }
		
		
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		 
//		===================================================
		
//		int sum=0;
//		int i=0;
//		while(i<=10) {
//			sum+=i;
//			i++;
//	
//	}
//		System.out.println(sum); // 55
		
//	    =================================================
				
//		while(true) {
//			System.out.println("Hello");  //무한반복문
//		}
		
//		boolean flag = true;
//		int cnt = 0;
//		while(flag) {
//
//			cnt++;
//			System.out.println(cnt);
//			if(cnt == 127564) {
//				flag = false;
//			}
//	=======================================================
//		for() {   //n=5
//			for() {   //m=5
//				실행문
//				
//			}
//		}
//	========================================================	
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.println(i); 
//				System.out.println(j);
//			}
		
	
//			for(int i=2;i<10;i++) {
//				for(int j=1;j<10;j++) {
//					System.out.print(i + "x" + j + "= " + i*j + "   "); 
//
//		
//				}
//				System.out.println();
//			}
		
		
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.print(j + "x" + i + "=" + i*j + "  ");
//				
//			}
//			System.out.println();
//		}
		
//		=======================================================	
//		초기값1
//		while(조건식) {
//			초기값2
//			while(조건식) {
//				실행문
//				증감식2
//			}
//			증감식1
//		}
//		======================================================
//		int k=1;
//		int i=0;
//		while(i<5) {
//			int j=0;
//			while(j<5) {
//				System.out.println(k++);
//				j++;
//			}
//			i++;
//		}
		
//		======================================================
		
//		int i=2;
//		while(i<10 ) {
//			int j=1;
//			while(j<10) {
//				System.out.print(i + "x" + j + "=" + i*j + "  ");
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
		
		
		
//		int i=1;
//		while(i<10 ) {
//			int j=2;
//			while(j<10) {
//				System.out.print(j + "x" + i + "=" + i*j + "  ");
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
//		============================================================
		
//		for(int i=0, j=10; i<10; i++, j--) {
//			System.out.println("i : " + i + "," + "j : " + j);
//			
//		}
		
//		===========================================================
		
		
//		int s =0;
//		int i;
//		for(i=0;i<10;i++,s++) {
//			System.out.println("i : " + i + ", s : " + s);
//					
//		}
//		
//		System.out.println(i);
//		
//		
//		=========================================================
		
//		초기값
//		do {
//			실행문
//			증감식
//		}while(조건식)
		
//		=========================================================
//		
//		int i=1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);
//			
//		=========================================================

//		1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
		/*
		i값은 계속 +1 (1,2,3,4,5)
		1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
		i    i       i         i           i
		
		*/
		
//		========================================================
		
		
		
//		int sum=0;
//		int tot=0;
//		for(int i=1;i<=10;i++) {
//			sum += i; //  (0+1) (0+1+2) (0+1+2+3)
//			tot += sum;
//		}
//			System.out.println(sum);
//			System.out.println(tot);
		
		
//		=======================================================
		
//		int i,j,sum;
//		j=0;
//		sum=0;
//		for(i=1;i<=10;i++) {
//			j = j+i;       //0+1 1+2 3+3  6+4  10+5  15+6  21+7  28+8  36+9   45+10
//			sum= sum+j;    //0+1 1+3 4+6 10+10 20+15 35+21 56+28 84+36 120+45 165+55
//						   // 1   4   10   20   35     56    84   120    165    220
//		}
//		System.out.println(j);
//		System.out.println(sum);
		
//		=========================================================
		
//		int i=1;
//		int j=0;
//		int sum=0;
//		while(i<=10) {
//			j=j+i;
//			sum=sum+j;
//			i++;
//		}
//		System.out.println(j);
//		System.out.println(sum);
		
		
//		=========================================================
		
		// 반복문의 제어
		// break, continue
		// 조건문안에서 사용한다
		
//		for(int i=1;i<=10;i++) {
//			if(i>5) {
//				break;  // 반복문의 종료
//			}
//			System.out.println(i);
//		}
//		
//		=========================================================
		
		
//		int i=0;
//		int sum=0;
//		while(i<=10) {
//			sum=sum+i;
//			i++;
//			if(i<10) {
//				System.out.print(i+"+");
//			}else if(i==10) {
//				System.out.print(i+"=");	
//			}		
//		}
//		System.out.print(sum);
//		
//		
//		====================================================
		
		
//		====================================================
//				
//		int j,to;
//		j=to=0;
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//		int i= sc.nextInt();
//		while(i!=-1) {
//			j=j+i;
//			to++;
//			i= sc.nextInt();
//		}
//		if(to==0) {
//			System.out.println("입력한 값이 없습니다");
//		}else
//		System.out.println("정수의 갯수는 " + to + "개이며");
//		System.out.println("평균값은" + (double)j/to +"입니다");
//
//		=====================================================
		
		
//		int i,j,to;
//		j=to=0;
//		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
//		i=sc.nextInt();
//		for(;true;) {
//			if(i==-1) {
//				break;
//			}
//			j=j+i;
//			to++;
//			i= sc.nextInt();
//		}			
//		if(to==0) {
//			System.out.println("입력한 값이 없습니다");
//		}else
//		System.out.println("정수의 갯수는 " + to + "개이며");
//		System.out.println("평균값은" + (double)j/to +"입니다");
		
//		==================================================== 
		
//		int k=1;
//		for(int i=0;i<5;i++) {
//			System.out.println("i=  " + i);
//			for(int j=0;j<5;j++) {
//				System.out.println("k=  " + k++);
//				if(k%3==0) {               //k가 +됐을때 3의 배수면 break   
//					break;
//				}
//			}	
//		}
		
//		======================================================
		
//		for (int i=1;i<=10;i++) {
//			if(i%2==1) {
//				continue;   //if조건값이 성립되면 for문의 증감식으로 이동
//							//if조건값이 성립되지 않으면 그대로 진행
//			}
//			System.out.println(i);
//		}
//		
//		=====================================================
		
//		int num = sc.nextInt();  //ex)12345
//		int sum = 0;
//
//		while(num > 0) {
//			sum = sum + num % 10; //(1)sum=0+12345%10=5 (2)sum=5+1234%10=9...
//			num = num / 10; //(1)num=12345/10=1234 (2)num=1234/10=123...
//		}
//		
//		System.out.println(sum);
//		
//		=====================================================
//		tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
//		ex)방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x, y<=10이다.
		
//		int a,b;
//		a=b=0;
//		while((2*a)+(4*b)==10) {
//	
//		a++;
//		}
//		System.out.println(a);

		
//		==================================================
//		int c=sc.nextInt();
//		for(int x = 0;x <=c;x++) {
//			for(int y = 0;y<=c;y++) {
//				if(2*x+4*y ==c) {
//					System.out.println(x +", "+y);
//				}
//			}
//		}
		
//		====================================================
		
		//1+(-2)+3(-4)+5...와 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 출력
////		ttttttttttttttttttttttttttttttttttttttttttttttttttttttt
//		int a,b,sum;
//		a=1;
//		b=(-2);
//		sum=0;
//		while(sum<100) {
//			sum=a+b;
//			a+=2; //1,3,5,7,9,11
//			b-=2; //-2,-4,-6,-8
//			if(sum>=100)
////			if(sum<100) {
////				a=a+2;
////				b=b-2;
////			}
////				else if(sum>=100) {
//				System.out.println(a+", "+sum);
//				break;
////			}
//		}
	
	
//		===================================================
		
//		int a,sum;
//		sum=0;
//		for(a=1;true;a++) {
//			sum+=a;
//			if(sum<100) {
//				a++;
//				sum-=a;
//			}
//			else if(sum>=100) {
//				break;
//			}
//		}System.out.println(sum +", " + a);
		
//		====================================================
		
//		int sum=0;
//		int s=1;
//		int num=0;
//		int i;
//		for(i=1;true;i++,s=-s) {
//			num=s*i;
//			sum+=num;
//			System.out.println(s); //1,-1,1,-1,1,-1...
//			if(sum>=100) {
//				break;
//			}
//		}
//		System.out.println(sum+", "+i);
		
//		=================================================
		
//		int sel;
//		String er;
//		while(true) {
//			System.out.println("번호를 선택하세요");
//			System.out.println("1.빨간색 2.녹색 3.파란색 4.종료");
//			sel = sc.nextInt();
//			if(sel==1) {
//				System.out.println("빨간색 선택");
//			}else if(sel==2) {
//				System.out.println("녹색 선택");
//			}else if(sel==3) {
//				System.out.println("파란색 선택");
//			}else if(sel==4) {
//				System.out.println("종료");{
//					break;
//				}
//			}else
//				System.out.println("보기안에 있는 번호를 선택하세요");
//			
//		}
		
		//난수(랜덤)
		//Math.random() //0.0 <= r < 1.0
		
		//Math.random() *10 // 0.0~9.99...
		//(int)(Math.random()*10 )  // 0~9
		//(int)(Math.random()*10 ) + 1  //1~10
		//System.out.println((int)(Math.random()*10)+1);
		
		//(int)(Math.random() * 난수의 개수(난수의 최대값 - 난수의 최소값 + 1)) + 난수의 최소값
		// System.out.println((int)(Math.random()*3)+1);
		
//		===================================================
//		Scanner sc= new Scanner(System.in);
//		int com;
//		int me;
////		int corr=0; //이긴횟수
////		int l=0;  //전체 도전횟수
////		int ch=3;  //남은횟수
//		while(true) {
//			com=(int)(Math.random()*3)+1;
//			System.out.print("1.가위 2.바위 3.보 :");
//			me=sc.nextInt();
//			System.out.println("me ="+me+", com ="+com);
//////		==============================================
////			int result = com - me;
////			if(result == -1 || result == 2) {
////				System.out.println("you win");
//////				corr++;
//////				System.out.println("이긴횟수:" + corr + "회");
//////				if(corr==3) {
//////					break;
//////				}
//////				break;
////			}else if(result == 0) {
////				System.out.println("tie break");
////				l++;
////				ch-=1;
////			}else {
////				System.out.println("you lose");
////				l++;
////				ch-=1;
////			}if(ch>0) {
////				System.out.println("기회가 "+ch+"번 남았습니다." );
////			}if(l==3) {
////				System.out.println("세번안에 못맞췄습니다.");
////				break;
////			}
////			
////		}
////		===========================================  1.가위 2.묵 3.보   1>2>3    1 3  1>3  win 1<2 2<3 1<ㅌ
//			if((me!=3 && com!=1) || (me!=1 && com!=3)) {
//				if(me>com) {
//					System.out.println("당신이 이겼습니다1.");
////					break;
//				}if(com>me) { 
//					System.out.println("당신이 졌습니다2.");
//				}
//			}
//			if(me==1 && com==3) {
//				System.out.println("당신이 이겼습니다3.");
////				break;
//			}else if(me==3 && com==1) {
//				System.out.println("당신이 졌습니다4.");
//			}
//			if(me==com) {
//				System.out.println("비겼습니다.");
//			}
//		}
		
		
		//com 3보 me 2바위  
		//com 2바위 me 1가위
		
//				2
//				com =3, me =2
//				1.가위 2.바위 3.보 :
//				1
//				com =2, me =1
//				당신이 졌습니다.
//				1.가위 2.바위 3.보 :
				//3>2(X) 2>1(O)
		}
	}


