package com.ict.day16;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());

		Ex08_TestA testA = new Ex08_TestA();
		testA.start(); // TestA 에서 상속받은 Thread 부모가 가지고 있는 start 메소드 사용 가능
						// start 에서 run 메소드로 가서 일꾼을 떨구고 다시 돌아온다.
						// 일꾼은 일 끝나면 사라진다.
						// 돌아와서 일이 적은 메인스레드가 먼저 일을 마친다 그래서 출력시 수고하셨습니다가 먼저 나옴
						// 메인프로그램이 종료가 되어도 일꾼은 계속 돌아가기때문에 따로 종료하게 해줘야한다.

		Ex08_TestB testB = new Ex08_TestB();
		Ex08_TestC testC = new Ex08_TestC();

		testB.start();
		testC.start();

		System.out.println("수고하셨습니다");

	}
}
