package com.ict.day09;

public class Ex17 {
	// 클래스 다이어그램 0110
	private String name;
	int age;
	double result;
	int res;
	
	public void plus(int k1, int k2) {
		res = k1 + k2;
	}
	public void sub(int k1, int k2) {
		res = k1 - k2;
	}
	public int mul(int k1, int k2) {
		res = k1 * k2;
		return res;
	}
	public double div(int k1, int k2) {
		result = (int)(k1 / (k2 * 1.0) * 10) / 10.0;
		return result;
	}
	
}
