package com.ict.day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복 불가, 특정 기준으로 정렬이 안됨
		// 		(단, TreeSet 은 항상 오름차순을 유지한다.)
		//		주머니 구조라고 생각하자
		// 형식) HashSet <제네릭=객체타입=클래스> 참조변수 = new HashSet <[제네릭]>(생략가능);
		//		HashSet 은 주머니 구조라 정렬이 안되서 나올때 들어간 순서대로 나오지 않는다.
		//      TreeSet <제네릭=객체타입=클래스> 참조변수 = new TreeSet <[제네릭]>(생략가능);
		
		// 1. 컬렉션 생성
		// 기본자료형 안됨, wrapper 클래스로 들어가야됨
//		HashSet<int> h1 = new HashSet<int>();
		
		// int 값을 받는게 아니라 Integer 로 되어있는 객체를 받음
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<Double>();
		TreeSet<String> h3 = new TreeSet<String>();
		TreeSet<Character> h4 = new TreeSet<Character>();
		
		// 2. 컬렉션에 객체 넣기 (add(E e))
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		
		// int 지만 Integer 로 자동으로 바꿔서 들어간다 오토 박싱 이라고 한다 : 기본자료형을 객체로 변경
		h1.add(50); //                 반대 : 오토 언박싱
		// String 으로 바로 못 들어감, 스트링은 래퍼클래스가 없다
//		h1.add("60");
		System.out.println(h1.add(10)); // false 나옴, 기존의 들어가 있는 숫자와 중복되면 못들어감
		
		System.out.println(h1); // 들어간 순서대로 나오지 않고 정렬도 못한다
		System.out.println();
		
		// 출력시 배열로 보이지만 실제 배열은 아니라 일반 for 문으로 출력을 못한다
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(h1.[i]);
//		}
		
		// 개선된 for 문 사용가능 foreach 문
		for (Integer k : h1) { // 콜론: 오른쪽에 있는 값을 처음부터 끝까지 하나씩 왼쪽 변수로 넘겨준다
			System.out.println(k + 1000);
		}
		System.out.println();
		
		// 개선된 for 문 처럼 순서대로 하나씩 접근해서 꺼낸다
		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) { // it 에 있는 값을 hasNext 로 꺼내겠다는 뜻
			int s = it.next();
			System.out.println(s + 5000);
		}
		System.out.println();
		
//		HashSet<Double> h2 = new HashSet<Double>();
		h2.add(10.0);
		h2.add(21.5);
//		h2.add(10); // 실수만 들어감 정수X
		System.out.println(h2);
	}
}
