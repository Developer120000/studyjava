package com.ict.day13;

enum Type2 {
	WALK("워킹화", 250), RUN("런닝화", 255), TRACK("트래킹화", 265), HIK("하이킹화", 275);

	private final String name;
	private final int size;

	// getter 만 생성, final 이라 값 변경이 안된다
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	// 생성자 역활을 하는 놈
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

}

public class Ex14 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ":" + arr[i].getSize());
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i]+":"+arr[j]);
			}
		}
	}
}
