package com.ict.day09;

public class Ex08 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	// 외부에서 이름 받아서 이름 넣기
	// 외부 데이터는 메소드에 인자를 통해서 받는다.
	// 메소드이름([인자]) {실행할 내용}
	// 인자 => 자료형 변수
	public void play01(String k1) {  // 지역변수는 메소드 안에서만 사용 가능
		name = k1;
	}
	
	// 총점 = kor + eng + math;
	public void play02(int k1, int k2, int k3) {
		sum = k1 + k2 + k3;
	}
	// 평균
	public void play03() {
		avg = (int)(sum / 3.0 * 10) / 10.0; 
	}
	// 학점
	public void play04() {
		if (avg >= 90) {
			hak = "A학점";
		} else if (avg >= 80) {
			hak = "B학점";
		} else if (avg >= 70) {
			hak = "C학점";
		} else {
			hak = "F학점";
		}
	}
	// 출력하기
	public void play05() {
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
	}
		
	
		
	String name2 = "";
	int sum2 = 0;
	double avg2 = 0.0;
	String hak2 = "";

		
	// 외부에서 이름 받아서 이름 넣기	
	public void play1(String n2) {
		name2 = n2;
	}
	// 총점 = kor + eng + math;
	public void play2(int k, int e, int m) {
		sum2 = k + e + m;
		play3();
		play4();
		play5();
	}
	// 평균
	public void play3() {
		avg2 = (int)(sum2 / 3.0 * 10) / 10.0; 
	}
	// 학점
	public void play4() {
		if(avg2 >= 90) {
			hak2 = "A학점";
		} else if(avg2 >= 80) {
			hak2 = "B학점";
		} else if(avg2 >= 70) {
			hak2 = "C학점";
		} else {
			hak2 = "F학점";
		}
	}
	// 출력하기
	public void play5() {
		System.out.println("이 름\t총 점\t평 균\t학 점");
		System.out.print(name2+"\t"+sum2+"\t"+avg2+"\t"+hak2);	
	}

		
		
		
	
}
