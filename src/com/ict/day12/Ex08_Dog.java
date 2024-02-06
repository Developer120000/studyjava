package com.ict.day12;

// 추상클래스 상속
// 1. 일반적인 클래스가 추상클래스를 상속하면
// 	  일반적인 클래스는 추상 메소드를 오버라이딩 해서 구체화 한다.
class Ex08_Dog extends Ex08_Animal{

	@Override
	public void sound() {
		System.out.println("멍~멍~");
	}
}

// 2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 하지 않아도 된다.
abstract class Ex08_Cat extends Ex08_Animal{
}

 //2. 추상클래스가 추상클래스를 상속하면 오버라이딩을 하지 않아도 된다.
abstract class Ex08_Cow extends Ex08_Animal{

	@Override
	public void sound() {
		System.out.println("음메~~");
	}
	public abstract void like();  // 결국에 마지막엔 일반에서 구체화 해줘야된다
}

abstract class Ex08_chicken extends Ex08_Animal{
	public abstract void sleep();
}

class Ex08_MY_Animal extends Ex08_chicken{

	@Override
	public void sleep() {
	}
	@Override
	public void sound() {
	}
}

class Ex08_MyAnimal2 extends Ex08_Cow{  
	// 부모 Animal 에 있는 sound 는 Cow 에서 구체화 해줬기 때문에 Cow 에 있는 like 만 구체화 해주면 된다 
	@Override
	public void like() {
		
	}
	
}


