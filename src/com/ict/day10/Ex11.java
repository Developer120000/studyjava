package com.ict.day10;

public class Ex11 {
	// 변수의 접근제한자가 private 이므로 외부에서 접근 할 수 없다.
	// 메서드를 이용해서 데이터를 변경하거나 보낼 수 없다.
	// getter() : 호출하는 입장에서 데이터를 가져올 수 있다.
	// setter() : 호출하는 입장에서 데이터를 변경시키겠다.
	private String name = "홍길동";  // 이름
	private int age = 24;		  // 나이
	private double weight = 72.6; // 몸무게
	private boolean gender = true ;	  // 성별
	
	
	// 메뉴의 source = get/set (generate getters and setters...)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
}
