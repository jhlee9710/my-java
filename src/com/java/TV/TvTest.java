package com.java.TV;

public class TvTest {

	public static void main(String[] args) {
		
		//int sum = 0; // ��������
		
		//sum += 10;
		
		//System.out.println(new TV());
		//new TV(); ������ TV ��ü�� ù ��° �ɹ��� �ּҰ�.
		
		//new TV().power = true;
		//new TV().channel = 10;
		
		TV t = new TV();		//��������(=�ּҰ�)
		//System.out.println(t);
		t.power = true;
		t.channel = 10;
		System.out.println(t.channel);
		
		t.channelDown();
		System.out.println(t.channel);
		
		TV t2 = new TV();
		t2.channel = 20;
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t2.channelDown();
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		t2 = t;		// �� ���������� Ÿ���� ������ ��츸 ����
		
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t.channelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
	}

}
