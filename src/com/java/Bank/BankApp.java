package com.java.Bank;
import java.util.Scanner;

public class BankApp {
	
	Account acc[]=new Account[100];		// 멤버변수
	Scanner sc=new Scanner(System.in);		// 멤버변수
	
	void info() {
		System.out.println("---------------------------------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("---------------------------------");
		System.out.print("선택: ");
	}
	void createAccount() {	//계좌생성 기능
		System.out.println("----------");
		System.out.println("계좌 생성 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
			System.out.println("이미 계좌가 존재합니다.");
			return;
		}
		
		System.out.println("계좌주명 : ");
		String owner = sc.next();
		
		System.out.println("초기 입금액 : ");
		int balance = sc.nextInt();
		
		System.out.println("이자율 입력 : ");
		double rate=sc.nextDouble();
		
		Account account = new Account(ano, owner, balance, rate);
		
		account.rateCal();
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null) {
				acc[i]=account;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}
	void accountList() {	//계좌목록 보기 기능 
		System.out.println("----------");
		System.out.println("계좌 목록 보기 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호      계좌주     입금액      이자율      출금가능액");
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null) {
				break;
			}
			System.out.println(acc[i].getAno() + "\t  " + acc[i].getOwner() + "\t" + acc[i].getBalance() + "\t" + acc[i].getRate() + "%\t" + acc[i].getAmount());
		}
		
	}
	void deposit() {	//예금 기능
		System.out.println("----------");
		System.out.println("예금 기능 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("예금액 : ");
		int balance = sc.nextInt();
		
		account.setBalance(account.getBalance()+balance);
		account.rateCal();
		System.out.println("예금 처리가 정상적으로 되었습니다.");
			
	}
	void withdraw() {	//출금 기능
		System.out.println("----------");
		System.out.println("출금 기능 메뉴");
		System.out.println("----------");
		
		System.out.println("계좌번호 : ");
		String ano = sc.next();
		
	Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("출금액 : ");
		int balance = sc.nextInt();
		
		if(account.getBalance()>=balance) {
		account.setBalance(account.getBalance()-balance);
		System.out.println("출금 처리가 정상적으로 되었습니다.");
		}else if(account.getBalance()<balance) {
			System.out.println("잔액이 부족합니다.");
		}
	}
	Account findAccount(String ano) {
		
		Account account=null;
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i] != null) {
				if(acc[i].ano.equals(ano)) {
					account = acc[i];
					break;
				}
			}
		}
		return account;
	}
	
	
	
	
	
}
