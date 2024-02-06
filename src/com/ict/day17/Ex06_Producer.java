package com.ict.day17;

public class Ex06_Producer implements Runnable{
	private Ex06_Car car;
	
	public Ex06_Producer(Ex06_Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar(); // getCar 하는순간 차가 생산되고 차이름을 carName 변수에 저장한다.
			car.push(carName); // 전역변수 car 에 생산된 차 추가
			try {
				Thread.sleep((int)(Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
