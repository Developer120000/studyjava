package com.ict.day16;

// 데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드
//			 일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
//			 여러개의 스레드가 있을때 모두 데몬 설정을 안할시 즉, 한개라도 실행될 시 모두 돌아간다.
public class Ex10_Main {
	public static void main(String[] args) {
		Ex10 test = new Ex10();
		Thread thread = new Thread(test);
		thread.setDaemon(true); // 보조 스레드 강제종료
		thread.start();
		
		Ex11 test2 = new Ex11();
		Thread thread2 = new Thread(test2);
//		thread2.setDaemon(true);
		thread2.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000); // Thread.sleep() 입력하면 트라이캐치 문구 나오고 알아서 만들어준다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("수고하셨습니다.");
	}
}
