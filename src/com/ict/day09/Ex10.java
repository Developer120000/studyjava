package com.ict.day09;

public class Ex10 {
	String name = "";
	int sum = 0;
	double avg = 0.0;
	String hak = "";
	
	public void play(String k1, int kor, int eng, int math) {
		name = k1;
		sum = kor + eng + math;
		avg = (int)(sum / 3.0 * 10) / 10.0;
		if (avg >= 90) {
			hak = "A학점";
		}else if(avg >= 80) {
			hak = "B학점";
		}else if(avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		
	}
	
	
	String name2 = "";
	int sum2 = 0;
	double avg2 = 0.0;
	String hak2 = "";
	
	public void play1(String n2, int s1, int s2, int s3) {
		name2 = n2;
		sum2 = s1 + s2 + s3;
		avg2 = (int)(sum2 / 3.0 * 10) / 10.0;
		if (avg2 >= 90) {
			hak2 = "A학점";
		} else if (avg2 >= 80) {
			hak2 = "B학점";
		} else if (avg2 >= 70) {
			hak2 = "C학점";
		} else {
			hak2 = "F학점";
		}
		
		System.out.println("이 름\t총 점\t평 균\t학 점");
		System.out.println(name2+"\t"+sum2+"\t"+avg2+"\t"+hak2);
	}
	
	
	
	
}
