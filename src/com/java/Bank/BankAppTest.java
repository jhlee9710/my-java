package com.java.Bank;
import java.util.Scanner;

public class BankAppTest {

	
	public static void main(String[] args) {
		
		BankApp ba=new BankApp();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("====================================");
		System.out.println("=         은행 업무 관리 시스템                  =");
		System.out.println("====================================");
		
		while(true) {
			ba.info();
			int choice = sc.nextInt();
			
			if(choice == 1) {
				ba.createAccount();
			}else if(choice == 2) {
				ba.accountList();
			}else if(choice == 3) {
				ba.deposit();
			}else if(choice == 4) {
				ba.withdraw();
			}else if(choice == 5) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("업무가 종료되었습니다.");
		
		
	}

}
