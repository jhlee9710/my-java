package com.java.TV;
//import com.java.Print.Print; //������� ��� �޾ƿ���
//import com.java.Print.Print3D;
import com.java.Print.*;
//ctrl + shift + o �ڵ� import

public class I3dTv extends TV{
	//TVŬ�����κ��� ���� 7���� �޼ҵ�6���� ��ӹ޾Ҵ�.
	boolean i3d;
	
	Print print=new Print(10,20);	//�ν��Ͻ� �������,���԰���
	
	void i3dPower() {
		if(i3d) {
			System.out.println("3D���� ������");
		}
	}

}
