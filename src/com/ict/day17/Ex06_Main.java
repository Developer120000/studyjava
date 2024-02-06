package com.ict.day17;

public class Ex06_Main {
	public static void main(String[] args) {
		// Ex06_Customer,Ex06_Producer 생성자 인자 넣어주기 위해 생성
		Ex06_Car car = new Ex06_Car();
		
		Ex06_Producer producer = new Ex06_Producer(car);
		Thread tProducer = new Thread(producer);
	
		Ex06_Customer customer = new Ex06_Customer(car);
		Thread tcustomer = new Thread(customer);
		
		tProducer.start();
		tcustomer.start();

		
	}
}
