package com.java.TV;
public class CaptionTv extends TV{
	//TVŬ�����κ��� ���� 7���� �޼ҵ� 5���� ��� �޴´�.
	//���ϻ�Ӹ� ���� ex)extends TV,TV2 �Ұ���
	
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);	
		}
		
		
	}
	
}
