package com.java.Wrapper;

public class WrapperTest {

	public static void main(String[] args) {
		
		//wrapper Class : �⺻���� �������� ����ȯ(�ڽ�, ��ڽ�) ����ڽ�
		//�ڽ� : �⺻�� -> ������
		//��ڽ� : ������ -> �⺻��
		
		int i = 10;
		Integer intg = i;	//�ڽ� (Integer)i;  //new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2;		//��ڽ�
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i;	//�ڽ�
//		int i3 = obj;	//��ڽ��� �Ұ�
		
		String str = "20";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);
		
		
	}

}
