package com.ict.day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex05 {
	public static void main(String[] args) {
		// ArrayList 를 stream 으로
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 중간처리 : 오름차순 정렬 => sorted(), 내림차순 정렬 => sorted(Comparator.reverseOrder()) 
		Stream<String> stream2 = sList.stream();
		stream2.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		Stream<String> stream3 = sList.stream();
		stream3.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 정렬 오름차순 (숫자 => 대문자 => 소문자 => 한글 순서) // 컬렉션 없이 바로 스트림 만들기
		Stream<String> stream4 = Stream.of(new String[] {"bb", "a", "0", "라", "CC", "3", "dd", "BB", "aaa", "가", "마"});
		stream4.sorted().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 정렬 내림차순 (한글 => 소문자 => 대문자 => 숫자 순서) // 컬렉션 없이 바로 스트림 만들기
		Stream<String> stream5 = Stream.of(new String[] {"bb", "a", "0", "라", "CC", "3", "dd", "BB", "aaa", "가", "마"});
		stream5.sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
		System.out.println();

		// 정렬 오름차순 (숫자 => 영어 => 한글), 대소문자 출력 순서는 먼저 생성된게 먼저 출력된다. // 컬렉션 없이 바로 스트림 만들기
		Stream<String> stream6 = Stream.of(new String[] {"BB", "a", "0", "라", "CC", "3", "dd", "bb", "A", "가", "마"});
		stream6.sorted(String.CASE_INSENSITIVE_ORDER).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 정렬 내림차순 (한글 => 영어 => 숫자), 대소문자 출력 순서는 먼저 생성된게 먼저 출력된다. // 컬렉션 없이 바로 스트림 만들기
		Stream<String> stream7 = Stream.of(new String[] {"BB", "a", "0", "라", "CC", "3", "dd", "bb", "A", "가", "마"});
		stream7.sorted(String.CASE_INSENSITIVE_ORDER.reversed()).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
}
