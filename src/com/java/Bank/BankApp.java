package com.java.Bank;
import java.util.Scanner;

public class BankApp {
	
	Account acc[]=new Account[100];		// �������
	Scanner sc=new Scanner(System.in);		// �������
	
	void info() {
		System.out.println("---------------------------------");
		System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
		System.out.println("---------------------------------");
		System.out.print("����: ");
	}
	void createAccount() {	//���»��� ���
		System.out.println("----------");
		System.out.println("���� ���� �޴�");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();
		
		if(findAccount(ano) != null) {
			System.out.println("�̹� ���°� �����մϴ�.");
			return;
		}
		
		System.out.println("�����ָ� : ");
		String owner = sc.next();
		
		System.out.println("�ʱ� �Աݾ� : ");
		int balance = sc.nextInt();
		
		System.out.println("������ �Է� : ");
		double rate=sc.nextDouble();
		
		Account account = new Account(ano, owner, balance, rate);
		
		account.rateCal();
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null) {
				acc[i]=account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}
	void accountList() {	//���¸�� ���� ��� 
		System.out.println("----------");
		System.out.println("���� ��� ���� �޴�");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ      ������     �Աݾ�      ������      ��ݰ��ɾ�");
		
		for(int i=0;i<acc.length;i++) {
			if(acc[i]==null) {
				break;
			}
			System.out.println(acc[i].getAno() + "\t  " + acc[i].getOwner() + "\t" + acc[i].getBalance() + "\t" + acc[i].getRate() + "%\t" + acc[i].getAmount());
		}
		
	}
	void deposit() {	//���� ���
		System.out.println("----------");
		System.out.println("���� ��� �޴�");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("���ݾ� : ");
		int balance = sc.nextInt();
		
		account.setBalance(account.getBalance()+balance);
		account.rateCal();
		System.out.println("���� ó���� ���������� �Ǿ����ϴ�.");
			
	}
	void withdraw() {	//��� ���
		System.out.println("----------");
		System.out.println("��� ��� �޴�");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();
		
	Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("���°� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("��ݾ� : ");
		int balance = sc.nextInt();
		
		if(account.getBalance()>=balance) {
		account.setBalance(account.getBalance()-balance);
		System.out.println("��� ó���� ���������� �Ǿ����ϴ�.");
		}else if(account.getBalance()<balance) {
			System.out.println("�ܾ��� �����մϴ�.");
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
