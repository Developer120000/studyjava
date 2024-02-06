package com.ict.day11;

public class Ex15 {
	// static 초기화
	/*
	 	static {
	 	초기화 내용;
	 	}
	 	static 중괄호 위에꺼까지만 초기화시킨다
	 	중괄호 아래부터는 선언만 한 변수에는 값을 넣어준다 예) m2
	 */
	
	int s1 = 100;
	private int p1 = 300;
	static int s2;
	static int s3;
	
	public static int k2 = 300;
	static int k3 = 300;
	private static int k4 = 5000;

	static {
		k2 = 20000;
		s2 = 50000;
		j2 = 40000;
		m2 = 60000;
	}
	
	static int m2;
	static int j2 = 400;
	
	
}
