package com.java.ArrayJeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Lotto {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;set.size()<7;i++) {
			set.add((int)(Math.random() * 45) + 1);
		}
		
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list);
		
		Iterator<Integer> it = list.iterator();
		
		
		System.out.println(set);


	}

}
