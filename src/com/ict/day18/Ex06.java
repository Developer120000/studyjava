package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex06 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3};
		
		IntStream intStream1 = IntStream.of(arr);
		intStream1.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// distinct() => 중복 제거
		IntStream intStream2 = IntStream.of(arr);
		intStream2.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// filter(조건), 짝수만 출력하자
		IntStream intStream3 = IntStream.range(0, 10); // 마지막 포함 안함
		intStream3.filter(i -> i%2==0).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		IntStream intStream4 = IntStream.rangeClosed(0, 10); // Closed 는 마지막 포함 
		intStream4.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// limit(수) : 수만큼 앞에서부터 출력, 수만큼 자르기
		IntStream intStream5 = IntStream.rangeClosed(0, 10); // Closed 는 마지막 포함 
		intStream5.limit(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// skip(수) : 수만큼 앞에서부터 제외
		IntStream intStream6 = IntStream.rangeClosed(0, 10); // Closed 는 마지막 포함 
		intStream6.skip(3).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// 연습
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		
		IntStream is1 = list.stream().mapToInt(Integer::intValue);
		is1.forEach(i -> System.out.print(i));
	}
}



