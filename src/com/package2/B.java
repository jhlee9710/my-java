package com.package2;

import com.package3.F;

public class B extends F{	

	public int b;


		public B(int b) {
			super(10);
			this.b = b;
		}

	public void printB() {
		System.out.println(b);
		System.out.println(f);	//protected������ ��ӹ޾ұ� ������ ��밡��
	}
	
	
}