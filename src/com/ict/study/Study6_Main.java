package com.ict.study;

public class Study6_Main {
	public static void main(String[] args) {
		Study6 s = new Study6();
		Thread t = new Thread(s);
		t.start();
		
		study6_1 s1 = new study6_1();
		new Thread(s1).start();
		
		study6_2 s2 = new study6_2();
		s2.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
				System.out.println(i + "해삼" + Thread.currentThread().getName());
				}
			}
		}).start();
		
		study6_3 s3 = new study6_3();
		new Thread(s3).start();
		
	}
}
