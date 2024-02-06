package com.ict.day17;

public class Ex03 implements Runnable{
	int x = 0;
	// dog, cat, tiger, lion 스레드가 같이 사용하는 영역 (임계영역)
	// 임계영역은 일처리를 제대로 하기 전에 다른 스레드에게 제어권을 빼앗길 수 있는 문제점이 있다.
	// 예로 이벤트에 당첨된사람 정보와 다른사람의 주소가 입력되서 잘못 배송갈 수 있다.
	// 이러한 문제점을 해결하는 것이 동기화 이다.
	// 동기화란 먼저 차지한 스레드가 끝날때 가지 다른 스레드가 제어권을 빼앗을 수 없게 락을 걸어버린다. 대기상태가 된다.
	// 동기화 방법은 해당 메소드 반환형 앞에 synchronized 예약어를 사용하면 된다.

	// 동기화 처리할 때 현재 실행 중인 스레드를 강제로 대기상태로 변경 시키는 메소드가 wait(), 즉 설정한 목표치에서 중단
	// wait() 으로 대기상태가 된 스레드를 깨우지 않으면 그대로 끝난다.
	// wait() 된 스레드를 풀어주는 예약어가 notify(), notifyAll() 이다.
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + ":" + Thread.currentThread().getName());
			if(x == 11){ // x 가 11이면 멈추고 빠져나와라, 강제로 대기상태 변경
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
