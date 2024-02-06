package com.ict.day03;

public class Ex04 {
	public static void main(String[] args) {
		// || (OR, 논리합, 합집합)
		// 주어진 조건들 중에서 하나라도 참(true)이면 결과는 참(true)이다.
		// 참(true)을 마난면 이후 연산을 하지 않는다.
		int su1 = 10 ;
		int su2 = 7 ;
		boolean res ;
		
		// true = true || true
		res = (su1 >= 7) || (su2 >= 5) ; //연산하고 boolean 형에 저장한다.
		System.out.println(res);
		
		// true = true || false
		res = (su1 >= 7) || (su2 <= 5) ; //연산하고 boolean 형에 저장한다.
		System.out.println(res);
		
		// true = false || true
		res = (su1 <= 7) || (su2 >= 5) ; //연산하고 boolean 형에 저장한다.
		System.out.println(res);
		
		// false = false || false
		res = (su1 <= 7) || (su2 <= 5) ; //연산하고 boolean 형에 저장한다.
		System.out.println(res);
		System.out.println();
		
		su1 = 10 ;
		su2 = 7 ;
		res = ((su1=su1+2)>su2) || (su2 == su2 + 5);
		System.out.println("결과 : " + res);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2); //앞에서 true 가 나왔기 때문에 뒤에는 계산안해서 그대로 7로 출력된다.
		
		// NOT (!, 논리부정)
		// 주어진 논리값을 반대로 출력, 예)리모콘 전원버튼
		// true => false, false => true
		res = true;
		System.out.println(res);
		System.out.println(!res);
		System.out.println(!!res);
		System.out.println(!!!res);
	}
}
