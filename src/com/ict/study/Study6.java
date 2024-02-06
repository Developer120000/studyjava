package com.ict.study;

public class Study6 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "바보"+Thread.currentThread().getName());
		}
	}
}

class study6_1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + "멍청이" + Thread.currentThread().getName());
		}
	}
}

class study6_2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
		System.out.println(i + "똥개" + Thread.currentThread().getName());
		}
	}
}

class study6_3 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
		System.out.println(i + "말미잘" + Thread.currentThread().getName());
		}
	}
}

