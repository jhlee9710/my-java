package com.java.TV;
public class InternetTv extends TV {
	
	boolean net;
	
	void InterTv() {
		if(net) {
			System.out.println("인터넷이 정상 작동중입니다.");
		}
	}

}
