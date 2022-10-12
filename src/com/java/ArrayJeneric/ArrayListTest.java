package com.java.ArrayJeneric;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();	//Object형변환
//		list.add("i");
//		list.add("i");
//		list.add(new Integer(1));
//		list.add(1);
//		list.add("2");
//		list.add(2);
//		
//		System.out.println(list);
//		
//		list.add("1");	//String -> Object 형변환 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
//		
//		list.get(0);
//		
//		String str = (String)list.get(0);	//Object -> String
//		System.out.println(str);
//		
//		int sum = 0;
//		
//		for(Object obj : list) {
//			String str = (String)obj;
//			System.out.println(str);
//			int num = Integer.parseInt(str);
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
//		================================================
		
//		Stack st = new Stack();
//		
//		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		
//		
//		try {
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());
//		System.out.println((String)st.pop());	//peek()
//		}catch(EmptyStackException e) {
//			System.out.println("Stack이 비어있습니다");
//		}
		
//		while(st.empty()) {
//			System.out.println((String)st.pop());
//		}
		
//		================================================
		
//		list.add("1");	//String -> Object 형변환 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
		//interator (반복자 패턴)
		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {	//데이터 존재 유무 확인
//			String str = (String)it.next();	//값을 가지고 오는 역할
//			System.out.println(str);	
//			
//		}
		
//		===============================================
		
		// 제너릭 : 컬렉션 객체의 데이터 타입을 한정한다.
		
//		ArrayList<String> list = new ArrayList<>();	//
//
//		
//		list.add("1");
////		list.add(1);
//		list.add("1");	//String -> Object 형변환 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		list.get(0);
//		
//		Iterator<String> it = list.iterator();
//		
//		while(it.hasNext()) {	//데이터 존재 유무 확인
//			String str = it.next();	//값을 가지고 오는 역할
//			System.out.println(str);	
//		}
		
		// set
		
//		HashSet set = new HashSet();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));
//		
//		System.out.println(set);	//[1, 1, 2, 4]
		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet<String> set = new HashSet<String>();
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int bingo[][] = new int[5][5];
//		
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random() * 50) + 1);
//		}
////		System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);
//		Collections.shuffle(list);
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		============================================
		
		// TreeSet : 반드시 값으로 사용되는 해당 클래스 안에는 정렬 조건이 오버라이딩 되어있어야한다.
		// implements Comparable (Integer, String...)
		
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(new Integer(2));
//		set.add(6);
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//			Integer intg = (Integer)it.next();
//			System.out.println(intg);
//		}
		
		TreeSet<Student> set = new TreeSet<Student>();	// 값이 정렬되어진다.
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("kim",3,1,10,10,10);
		Student s3 = new Student("kim",6,1,10,10,10);
		Student s4 = new Student("kim",9,1,10,10,10);
		Student s5 = new Student("kim",4,1,10,10,10);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator<Student> it = set.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s.toString());
		}
	
		
		
		
	}//main end()
	
	

}
