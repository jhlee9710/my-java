package com.package5;

import com.package4.Time;

public class TimeChild extends Time{	// »ó¼Ó

	void printAll() {
//		System.out.println(hour);	// error : private
		System.out.println(min);	// protected
		System.out.println(sec);	// public
//		System.out.println(nanosec);// error : default
	}

}
