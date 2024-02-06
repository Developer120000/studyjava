package com.ict.day10;

public class Ex09 {
	private String name = "";
	private int price = 0;
	
	// getter/setter 겟터,셋터 으로 불린다
	// getter = 얻어오는 데이터, setter = 내가 데이터를 넣어줌, 
	// 변수의 접근제한자 private 이므로 외부에서는 접근 불가 하다.
	// 내부에서는 접근이 가능하다는 부분을 이용해서
	// 메소드를 만들어서 접근해서 데이터를 삽입하거나 가져올 수 있다.
	
	public void sName(String k) { // 세터
		name = k;
	}
	public void sPrice(int k) { // 세터
		price = k;
	}
	
	public String gName() { // 게터
		return name;
	}
	
	public int gPrice() { // 게터
		return price;
	}

	public void play1(String k) {
		name = k;
		System.out.println(name);
	}
	
	
}
