package com.ict.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class Ex01_Main {
	public static void main(String[] args) {
		Ex01 p1 = new Ex01("이순신", 40, 100);
		Ex01 p2 = new Ex01("김유신", 20, 100);
		Ex01 p3 = new Ex01("홍길동", 13, 50);
		
		List<Ex01> list = new ArrayList<Ex01>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		// 컬렉션으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ===");
		Iterator<Ex01> t = list.iterator();
		while (t.hasNext()) {
			Ex01 q = t.next();
			System.out.println(q.getName() + " 고객 ");
		}
		System.out.println();
		
		int sum1 = 0;
		for (Ex01 k : list) {
			sum1 += k.getPrice();
		}
		System.out.println("총 비용은 " + sum1 + "입니다.");
		System.out.println();
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		for (Ex01 k : list) {
			if(k.getAge() >= 20)
			System.out.println(k.getName());
		}
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		List<String> list2 = new ArrayList<String>();
		for (Ex01 k : list) {
			if(k.getAge() >= 20) {
				list2.add(k.getName());
			}
		}
		Collections.sort(list2);
		for (String k : list2) {
			System.out.println(k);
		}
		
		System.out.println("====================================");
		
		// 스트림으로 처리하기
		System.out.println("=== 고객명단 순서대로 출력 ==="); // 이름 뽑기
		Stream<Ex01> stream = list.stream(); // 원하는거 제외는 filter, 원하는거 출력은 map 이 효율
		stream.map(i -> i.getName()).forEach(i -> System.out.println(i + " 고객 "));
		
		// 위에서 최종 처리를 했으므로 다시 Stream 을 만들어 사용
//		System.out.println("총 비용은 ~~~ 입니다."); // mapToInt = IntStream 으로 변환해줌
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum(); // sum 자료형이 int 라 앞에 int 에 저장시킴
		System.out.println("총 비용인 " + sum + "입니다.");
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		stream = list.stream();
		stream.filter(i -> i.getAge() >= 20).map(i -> i.getName()).forEach(i -> System.out.println(i + " 고객 "));
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		stream = list.stream();
		stream.filter(i -> i.getAge() >= 20).map(i -> i.getName()).sorted().forEach(i -> System.out.println(i + " 고객 "));
		
		
	}
}
