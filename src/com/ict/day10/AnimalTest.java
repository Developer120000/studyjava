package com.ict.day10;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		if (animal.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		// 이름을 펭귄으로 변경하자.
		animal.setName("펭귄");
			
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		if (animal.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		
		
		Animal animal2 = new Animal();
		// 같은 설계도로 만들었지만 다른 메소드이기 때문에 이름을 다르게 나온다.
		
		System.out.println("이름 : " + animal2.getName());
		System.out.println("나이 : " + animal2.getAge());
		if (animal2.isLive()) {
			System.out.println("살아있음");
		} else {
			System.out.println("죽어있음");
		}
		System.out.println();
		
		animal2.setAge(365);
		System.out.println(animal2.getAge());
		System.out.println(animal2.getName());
		
	}
}
