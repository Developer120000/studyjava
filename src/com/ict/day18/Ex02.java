package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02 {
	public static void main(String[] args) {
		// 스트림 생성 : 컬렉션이나 배열을 Stream 으로 반환
		// 객체, 배열 로부터 스트림 생성
		// Stream<T> Stream.of(T...values) // 가변인자
		// Stream<T> Stream.of(T[])
		// Stream<T> Arrays.Stream(T[])
		// Stream<T> Arrays.Stream(T[], 시작 index, 끝 index (포함X))
		
		// 배열을 스트림으로 변환
		String[] arr = {"홍길동", "고길동", "이길동", "박길동", "나길동"};
		
		Stream<String> stream01 = Stream.of("홍자바", "고자바", "이자바", "박자바", "나자바");
		Stream<String> stream02 = Stream.of(arr);
		Stream<String> stream03 = Arrays.stream(arr);
		Stream<String> stream04 = Arrays.stream(arr, 1, 4);
		
		// 하나씩 꺼내서 전체 반복, 인자 i 가 들어오면 i 출력
		stream01.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream02.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream03.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		stream04.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		
		// 컬렉션을 스트림으로 변환
		List<String> list = Arrays.asList("둘리", "도우너", "고길동", "마이콜", "희동이");
		// 컬렉션에는 stream()를 이용
		Stream<String> stream05 = list.stream();
		
		// 하나씩 꺼내서 전체 반복, 인자 i 가 들어오면 i 출력
		stream05.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		
		// 연습
		Integer[] arr1 = {1,5,3,7,14};
		Stream<Integer> stream1 = Stream.of(40,50,45,90,65);
		Stream<Integer> stream2 = Stream.of(arr1);
		Stream<Integer> stream3 = Arrays.stream(arr1);
		Stream<Integer> stream4 = Arrays.stream(arr1, 1, 5);
		
		stream1.forEach(i -> System.out.print(i));
		System.out.println();
		stream2.forEach(i -> System.out.print(i));
		System.out.println();
		stream3.forEach(i -> System.out.print(i));
		System.out.println();
		stream4.forEach(i -> System.out.print(i));
		System.out.println();
		
		List<Integer> list1 = Arrays.asList(7,84,54,66,75);
		Stream<Integer> stream5 = list1.stream();
		stream5.forEach(i -> System.out.print(i));
				
	}
}
