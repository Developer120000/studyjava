package com.ict.day12;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07_Cat cat = new Ex07_Cat();
		System.out.println(cat.name);
		System.out.println(cat.age);
		System.out.println(cat.id);
		System.out.println();
		
		Ex07_Cat cat1 = new Ex07_Cat("오공");
		System.out.println(cat1.name);
		System.out.println(cat1.age);
		System.out.println(cat1.id);
		System.out.println();
		
		Ex07_Cat cat2 = new Ex07_Cat(10);
		System.out.println(cat2.name);
		System.out.println(cat2.age);
		System.out.println(cat2.id);
		
		
	}
}
