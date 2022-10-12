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
		
		//keySet() : Ű�� ��ü�� ��ȯ�Ѵ�.
		
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
		
		//values() : value��ü�� �����Ѵ�.
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
			System.out.println("���̵� �Է�: ");
			String id = sc.next();
			
			System.out.println("��й�ȣ �Է�: ");
			String password = sc.next();
			
			// get(key) �� value �� ��ȯ
			// get("myid") �� "1234"
			// containsKey(key) ��  �������� Ȯ��(true, false)
			
			if(!map.containsKey(id)) {
				System.out.println("���̵� �������� �ʽ��ϴ�. �ٽ� �Է����ֽʽÿ�.");
				continue;
			}else {
				if(!map.get(id).equals(password)) {
					System.out.println("��й�ȣ�� Ʋ���ϴ�. �ٽ� �Է����ֽʽÿ�.");
					continue;
				}else {
					System.out.println("�α��� ����");
					break;
				}
			}
		}
		
		map.remove("myid");
		System.out.println(map);
		
	}	// main() endline
}	// class endline
