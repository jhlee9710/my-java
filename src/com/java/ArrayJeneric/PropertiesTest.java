package com.java.ArrayJeneric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		//Properties : k -> String, v -> String
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");
//		
////		String value = prop.getProperty("myid");
////		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();
//			String value = prop.getProperty(element);
//			System.out.println(value);
//		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e) {
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0); 	//프로그램 강제종료
		}
		
		String name = prop.getProperty("name");	//Hong Kil Dong
		String data[] = prop.getProperty("data").split(",");	
		
		int max = 0;
		int min = 0;
		int sum = 0;
		
		System.out.println(name);
		
		//문자열 -> 숫자: Integer.parseInt(문자열)
		//숫자 -> 문자열: String.valueOf(숫자)
		
		for(int i=0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);	//data[i]를 int형으로 바꿔줌
			if(i==0) {
				max = min = value;
			}
			if(max < value) {
				max = value;
			}else if(min > value) {
				min = value;
			}
			sum += value;
		}
		
		
//		min = max;
//		
//		for(int i=0;i<data.length;i++) {
//			int value = Integer.parseInt(data[i]);	//data[i]를 int형으로 바꿔줌
//			if(min > value) {
//			min = value;
//			}
//		}
		
		double avg = (double)sum / data.length;
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
	
		
		
		
		
		
	}

}
