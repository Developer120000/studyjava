package com.ict.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		// 배열을 컬렉션으로 변경
		String[] str = {"java", "Java", "JAVA", "자바"};
		
		// List 를 안배웠다. 배열을 list 컬렉션으로 간단히 변경하는 방법
		List<String> list = Arrays.asList(str);
		System.out.println(list);
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		// 배열의 요소를 하나씩 꺼내서 컬렉션 set1 에 넣자
		for (int i = 0; i < str.length; i++) {
			set1.add(str[i]);
		}
		System.out.println("set1 : " + set1); // 순서는 정렬이 안됨
		System.out.println();
		
		set2.add("태권브이");
		set2.add("마징가Z");
		System.out.println("set2 : " + set2);
		System.out.println();
		
		// set2 에서 set1 모든 내용 받기 (addAll), 같은 제네릭 타입이여야 들어감
		set2.addAll(set1);
		System.out.println("set2 : " + set2);
		
		// 삭제 : clear(), remove(Object o) 2가지 방법 
		set2.remove("태권브이"); // remove 는 1개씩 삭제
		System.out.println("set2 : " + set2);
		System.out.println();
				
		set2.clear(); // 모두 삭제
		System.out.println("set2 : " + set2);
		System.out.println();
		
		System.out.println(set2.isEmpty()); // set2 가 clear 되서 true 나옴
		
		
		
	}
}
