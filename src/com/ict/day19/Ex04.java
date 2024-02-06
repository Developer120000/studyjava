package com.ict.day19;

import java.util.stream.IntStream;

public class Ex04 {
	public static void main(String[] args) {
		// 병렬처리는 스레드랑 비슷하다 생각하면 된다. 여러개의 스레드가 처리, 출력시 중구난방으로 나옴
		System.out.println("병렬처리");
		IntStream.range(0, 10).parallel().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("직접처리");
		IntStream.range(0, 10).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		System.out.println("직접처리");
		System.out.println(IntStream.rangeClosed(0, 10).sum());

		System.out.println("병렬처리");
		System.out.println(IntStream.rangeClosed(0, 10).parallel().sum());
	}
}
