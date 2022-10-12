package com.java.TV;

public class TVCRtest {
	
	public static void main(String args[]) {
		
		I3dTv test = new I3dTv();
		String print = test.print.getLocation();
		System.out.println(print);
		
		
		String print3d = test.print.getLocation();
		System.out.println(print3d);
	}

}
