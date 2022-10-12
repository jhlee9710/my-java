package com.java.ArrayJeneric;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myid", "1234");
		map.put("asdf", "1111");
		map.put("wasd", "1234");
		
		//keySet() : 키값 전체를 반환한다.
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
		
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("====================");
		
		//values() : value전체를 반한한다.
		Collection<String> values = map.values();
		Iterator<String> itv = values.iterator();
		
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value);
		}
		
		Set<Map.Entry<String, String>> entry = map.entrySet();
		Iterator<Map.Entry<String, String>> itE = entry.iterator();
		
		while(itE.hasNext()) {
			Map.Entry<String, String> ent = itE.next();
			String key = ent.getKey();
			String value = ent.getValue();
			
			System.out.println("[Key]: " + key + ", [value]: " + value);
		}
		
		System.out.println("===========================");
		
		for(Map.Entry<String, String> ent : map.entrySet() ) {
			String key = ent.getKey();
			String value = ent.getValue();
			System.out.println("[Key]: " + key + ", [value]: " + value);	
		}
		
		//System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 입력: ");
			String id = sc.next();
			
			System.out.println("비밀번호 입력: ");
			String password = sc.next();
			
			// get(key) → value 값 반환
			// get("myid") → "1234"
			// containsKey(key) →  존재유무 확인(true, false)
			
			if(!map.containsKey(id)) {
				System.out.println("아이디가 존재하지 않습니다. 다시 입력해주십시오.");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 틀립니다. 다시 입력해주십시오.");
					continue;
				}else {
					System.out.println("로그인 성공");
					break;
				}
			}
		}
		
		map.remove("myid");
		System.out.println(map);
		
	}	// main() endline
}	// class endline
