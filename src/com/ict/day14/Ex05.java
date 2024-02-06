package com.ict.day14;

// 추상클래스
public abstract class Ex05 {
	int data = 1000;
	public abstract void printData();
}

class Ex05_Test extends Ex05{ 	// 상속받고 하는 일반적인 방법, 정통적인 방법, 웹에서 사용
	@Override
	public void printData() {
		System.out.println("data1 : " + (data + 100));
	}
}

class Ex05_Test2{
	Ex05 ex05 = new Ex05() { 	// 상속 받지 않고 바로 객체 생성
		public void printData() {
			System.out.println("data2 : " + (data + 100));
		}
	};
}

class Ex05_Test3{
	// 상속 받지 않고 바로 객체 생성
	public void prn() { // 객체 생성해서 사용하는 방법
		Ex05 ex05 = new Ex05() {
			@Override
			public void printData() {
				System.out.println("data3 : " + (data + 100));
			}
		}; // 클래스 끝
		ex05.printData(); // 아노니머스라 호출을 못해서 여기서 호출?
	} // 메소드 끝
}

class Ex05_Test4{ // 최종방법, 앱에서 많이 사용
	public void prn() { // 객체 생성하지 않고 사용하는 방법
		new Ex05() {
			@Override
			public void printData() {
				System.out.println("data4 : " + (data + 100));
			}
		}.printData(); // 클래스 끝 // 무슨차이??
	} // 메소드 끝
}




