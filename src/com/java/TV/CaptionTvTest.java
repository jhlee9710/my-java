package com.java.TV;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		System.out.println(ctv.channel);
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		
		ctv.caption = true;
		ctv.displayCaption("������ ������ �˷��帳�ϴ�.");
		
		
		I3dTv idd = new I3dTv();
		idd.i3d = true;
		idd.i3dPower(); 
		
		InternetTv Itv=new InternetTv();
		Itv.net = true;
		Itv.InterTv();
		
		
	}

}
