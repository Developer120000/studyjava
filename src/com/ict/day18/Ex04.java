package com.ict.day18;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04 {
	public static void main(String[] args) {
		// 정수배열을 스트림으로 활용하기
		int[] arr = {1, 2, 3, 4, 5};
		int sumVal = Arrays.stream(arr).sum();
		int count = (int) Arrays.stream(arr).count(); // count 가 long 형이라 오류, int 로 변환 해야한다.
		
		System.out.println("합계 : " + sumVal);		
		System.out.println("카운트 : " + count);	
		
		IntStream str = Arrays.stream(arr);
		IntStream str1 = IntStream.of(arr);
		str.forEach(i -> System.out.print(i));
		System.out.println();
		str1.forEach(i -> System.out.print(i));
		System.out.println();
		
		
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int count1 = (int) IntStream.of(arr1).count(); // Stream 앞에 Int붙여야함, 저장을 int 로 하니까 (int) 변환
		int count2 = (int) Arrays.stream(arr1).count();
		System.out.println("합 : " + count1);
		System.out.println("합 : " + count2);
	}
}
