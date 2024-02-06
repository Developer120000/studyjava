package com.ict.day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성하기
		// 			 IntStream, DoubleStream, LongStream
		// IntStream<T> IntStream.of(Int...values) // 가변인자
		// IntStream<T> IntStream.of(Int[])
		// IntStream<T> Arrays.stream(Int[])
		// IntStream<T> Arrays.stream(Int[], 시작 index, 끝 index (포함X))
		
		// 일반 Stream 방법
		Integer[] integerArr = {1, 2, 3, 4, 5};
		Stream<Integer> integerStream = Arrays.stream(integerArr);
		
		integerStream.forEach(i -> System.out.print(i + "님 "));
		System.out.println();
		// 최종처리 한번만 실행, 다시 호출못함, 다시 사용하고 싶으면 Stream 을 하나 더 만들어야 한다.
		integerStream = Arrays.stream(integerArr);
		System.out.println("총 개수 : " + integerStream.count());
		
		// Stream<T> : count() 는 있는데, sum() 이랑 average() 는 없다, IntStream을 사용하면 활용도가 넓어서 가능하다
//		integerStream = Arrays.stream(integerArr);
//		System.out.println("총 합 : " + integerStream.sum());
//		System.out.println("총 평균 : " + integerStream.average());
		
		// 기본자료형 배열을 스트림으로 만들자
		// IntStream : count(), sum(), average() 모두 사용 가능
		int[] intarr = {10, 20, 30, 40, 50};
		IntStream intStream1 = IntStream.of(10, 20, 30, 40, 50);
		IntStream intStream2 = IntStream.of(intarr);
		IntStream intStream3 = Arrays.stream(intarr);
		IntStream intStream4 = Arrays.stream(intarr, 2, 5);
		
		intStream1.forEach(i -> System.out.print(i + "  "));
		System.out.println();
		
		System.out.println("총 개수 : " + intStream2.count());
		System.out.println("총 합 : " + intStream3.sum());
		System.out.println("총 평균 : " + intStream4.average());
		
	}
}
