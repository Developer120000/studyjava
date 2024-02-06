package com.ict.day14;

interface Ex06 {
	int DATA = 1000;
	public void printData();
}

class Ex06_Test implements Ex06{
	@Override
	public void printData() {
		int data1 = DATA + 100;
		System.out.println("data : " + data1);
	}
}

class Ex06_Test2{
	public void prn() {
		new Ex06() {
			int data2 = DATA + 100;
			@Override
			public void printData() {
				System.out.println("data2 : " + data2);
			}
		}.printData();
		
		// 다른방법
//		Ex06 t = new Ex06() {
//			int data3 = DATA + 200;
//			@Override
//			public void printData() {
//				System.out.println("data3 : " + data3);
//			}
//		};
//		t.printData();
	}
}