package com.ict.day02;

public class Test {
	public static void main(String[] args) {
		
		float f1 = (float)(263.53); //숫자가 여러개 있으면 헷갈릴수 있어서 숫자에도 괄호해줘야됨
		System.out.println(f1);
		long s1 = 2636L; //L써야됨
		System.out.println(s1);
		
		int su1 = 9;
		int su2 = 8;
		double result3 = su1 / (su2 * 1.0); //
		System.out.println("결과 : " +su1+" / "+su2+" = "+result3);
		
		short s2 = (short)su1;
		byte s3 = (byte)su2;
		
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
