package com.ict.day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07 {
	public static void main(String[] args) {
		// map, peek, flatMap
		
		// map() : Stream 요소들을 변경한 새로운 Stream 을 반환한다.
		//		   단일 스트림의 원소를 매핑 시킨 후 매핑 시킨 값을 다시 스트림으로 변환하는 중간 연산
		//		   객체에서 원하는 원소를 추출하는 역활을 한다고 볼 수 있음
		Stream<String> stream = Stream.of("Java", "jsp", "spring", "jquery");
		stream.map(i -> i.toUpperCase()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		List<Ex08> list = Arrays.asList(
				new Ex08("park", 20), 
				new Ex08("kyung", 35), 
				new Ex08("seok", 67), 
				new Ex08("test man", 10), 
				new Ex08("test woman", 45)
				);
		
		// 이름만 추출
		Stream<Ex08> stream2 = list.stream();
		stream2.map(i -> i.getName()).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 위에 방식에서 중간처리를 따로 빼내서 처리하는 방식
		Stream<Ex08> stream3 = list.stream();
		Stream<String> nameList = stream3.map(i -> i.getName());
		nameList.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// flatMap : 입력한 원소를 가장 작은 단위의 단일 스트림으로 반환 한다.
		List<String> list2 = Arrays.asList("사과3팩", "멜론2팩", "딸기3팩");
		Stream<String> stream4 = list2.stream();
		List<String> list3 = stream4.flatMap(i -> { 
			String s = i.substring(0, 2);
			int n = Integer.parseInt(i.substring(2, 3));
			String[] arr = new String[n];
			Arrays.fill(arr, s); // arr 배열에 앞에 두글자를 채워넣어라
			return Stream.of(arr);
		}).collect(Collectors.toList()); // 새로운 리스트에 저장 (최종연산)
		System.out.println(list3);
		System.out.println();
		
		
		String[][] arr2 = new String[][] {
			{"a", "b"}, {"c", "d"}, {"e", "d"}, {"a", "h"}, {"i", "j"}
		};
		
		Stream<String[]> stream5 = Arrays.stream(arr2);
		// map, flatMap 의 차이
		// map 방법1
//		stream5.map(Arrays::toString).forEach(System.out::print);
//		System.out.println();
		// map 방법2, 이 형식을 사용하자
		stream5.map(i -> Arrays.toString(i)).forEach(i -> System.out.print(i.toString()));
		System.out.println();
		// flatMap, 하나씩 다 쪼개짐
		Stream<String[]> stream6 = Arrays.stream(arr2);
		stream6.flatMap(i -> Arrays.stream(i)).forEach(i -> System.out.print(i + " "));
		System.out.println();
		// flatMap, 하나씩 쪼개고 다시 수집해서 List 컬렉션으로 만듬
		Stream<String[]> stream7 = Arrays.stream(arr2);
		List<String> list4 = stream7.flatMap(i -> Arrays.stream(i)).collect(Collectors.toList());
		System.out.println(list4);
		System.out.println();
		
		// peek : forEach 처럼 loop 인데 peek 는 중간처리이고 forEach 는 최종처리 라는 차이점이 있다.
		//		  중간에 제대로 나오는지 확인할 때 주로 사용
		Stream<String> stream8 = Stream.of("Java", "jsp", "spring", "jquery");
		stream8.map(i -> i.toUpperCase())
		.peek(i -> System.out.println(i + " 배우기"))
				.forEach(i -> System.out.println(i + " ~"));
		
		
		// 연습
		int[][] arr3 = new int[][] {{1,2},{3,4},{5,6}};
		
		Stream<int[]> st = Arrays.stream(arr3);
		st.map(i -> Arrays.toString(i)).forEach(i -> System.out.print(i));
		
		
	}
}
