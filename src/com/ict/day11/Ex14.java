package com.ict.day11;

public class Ex14 {
	public static void main(String[] args) {
		// 객체 생성과 상관없이 호출 가능
		System.out.println(Ex13.num);
		System.out.println(Ex13.play2());
		System.out.println();
		
		// static private 은 접근 못함
		// System.out.println(Ex13.age);
		Ex13 t1 = new Ex13();
		System.out.println(t1.su);
		System.out.println(t1.num); // 참조변수로 호출은 되나
		System.out.println(Ex13.num); // 클래스로 부르는걸 권장
		System.out.println();
		
		Ex13 t2 = new Ex13();
		System.out.println(t2.su);
		System.out.println(t2.num);
		System.out.println(Ex13.num);
		System.out.println();
		
		Ex13 t3 = new Ex13();
		System.out.println(t3.su);
		System.out.println(t3.num);
		System.out.println(Ex13.num);
		
		
		// su 는 객체 생성과 같이 만들어져서 그때그때 다시 만들어져서 11이 나온다
		// num 은 static 메모리에 저장되어 만들어져있기 때문에 +1씩 증가하게 된다
		// 
		
		
		
		
		
		
		
	}
}
