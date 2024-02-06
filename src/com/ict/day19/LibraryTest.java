package com.ict.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}


public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 스트림 생성하고 출력
		Stream<Book> stream = bookList.stream();
		stream.forEach(i -> System.out.println(i.getName()));
		System.out.println();
		
		// 모든 책의 가격의 합
		int sum = bookList.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println("모든 책 가격 합 : " + sum);
		System.out.println();
		
		// 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		System.out.println("[20000원 이상 책 목록]");
		stream = bookList.stream();
		stream.filter(i -> i.getPrice() >= 20000).map(i -> i.getName()).forEach(i -> System.out.println(i));
		
	}
}