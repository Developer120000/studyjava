package com.ict.day16;

public class Ex09_Main {
	public static void main(String[] args) {
		Ex09_TestA testA = new Ex09_TestA(); // 객체로 만들고 선언함
		
		// Runnable 은 start() 가 없으므로 사용 못함
		// testA.start();
		
		// Runnable 을 상속받은 클래스를 인자로 넣자
		Thread t1 = new Thread(testA); // Runnable 은 start 가 없어서 객체생성하고 사용한다
		t1.start(); // () 안에 클래스가 가지고 있는 run 으로 간다
		
		// 두번째 방법 - 익명 // 객체로 만들고 선언하지않음
		Ex09_TestB testB = new Ex09_TestB();
		new Thread(testB).start(); // 선언변수가 없어서 다시 사용 못한다.
		
		// 익명 : 안드로이드 식 // 객체도 생성 안하고 선언도 안함
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("111 : " + i + ":" + Thread.currentThread().getName());
				}
			}
		}).start();
		
		
	}
}
