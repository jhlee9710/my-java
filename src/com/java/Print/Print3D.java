package com.java.Print;
//�������̵��� ����
public class Print3D extends Print{
	int z;
	
	//��ӿ����� �������� Ư¡
	//1. �θ�����ڸ� ȣ���ؾ��Ѵ�.
	//2. ȣ��ÿ� super()�޼ҵ带 ����Ѵ�.
	//3. �⺻�������� ��쿡�� �θ�������� �⺻ �����ڸ� ȣ���Ѵ�.
	//4. �����ڴ� ��ӵ��� �ʴ´�.(��� ������ �޼ҵ常 ��ӵǾ�����)
	
//	Print3D(){	//(1)
//		super(10,20);	//Print(int x, int y)
//		this.z=30;
//	}
	
	Print3D(int x,int y,int z){
		super(x,y);	// Print(int x, int y)
		this.z=30;
	}
	
	/*
	print3D(){ //������ �⺻ ������
		super();	//Print()������ ȣ��
	} //
	*/

	// ��ӱ������� ����Ѵ�.
	// �θ� �޼ҵ��� ����ο� �����ؾ��Ѵ�.(����Ÿ�� ����)
	// �Ű������� �����ؾ��Ѵ�.
	// ���๮�� �������Ѵ�.
	// �θ��� �޼ҵ带 ����Ҷ��� super��� Ű���带 ����Ѵ�.
	public String getLocation() {	//�������̵�(������)
		return super.getLocation()+" z: " + z;
	}
}
