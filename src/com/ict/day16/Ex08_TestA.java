package com.ict.day16;

// 스레드 만들어서 처리 할려면
public class Ex08_TestA extends Thread{
	
	// start 로 오면 싱글스레드로 일처리를 다하고 다시 main 메소드로 간다, 그래서 수고하셨습니다가 마지막에 나온다 
//	@Override
//	public synchronized void start() {
//		for (int i = 0; i < 100; i++) {
//			System.out.println("aaa : " + i + Thread.currentThread().getName());
//		}
//	}
	// start 에서 run 으로 와야 일꾼을 놓고 간다
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("aaa : " + i + Thread.currentThread().getName());
		}
	}
	
	
	
}
