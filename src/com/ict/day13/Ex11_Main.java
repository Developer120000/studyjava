package com.ict.day13;

public class Ex11_Main {
	public static void main(String[] args) {
		toPlay2("홍길동");
		
		// 인터페이스는 객체로 생성 못함
//		Ex11_IBehavior ibe = new Ex11_IBehavior();
		
		// 일반적인 객체 생성 방법
//		Ex11_Soccer soccer = new Ex11_Soccer();
//		Ex11_BaseGuitar baseGuitar = new Ex11_BaseGuitar();
		// 다른방법 (상황에 따라 쓰면 된다, 아래 방법 참고)
		Ex11_IBehavior soccer = new Ex11_Soccer();
		Ex11_IBehavior baseGuitar = new Ex11_BaseGuitar();
		toPlay(baseGuitar); // 아래 toPlay 인자로 들어가서 베이스기타의 플레이가 호출된다
		System.out.println();
		
		toPlay(new Ex11_Soccer()); // 객체 생성 없이 인자에서 바로 실행하는 방식
		
		// 가지수가 많을 때 효과적인 방법
//		Ex11_IBehavior k = null;
//		int y = 1 ;
//		if(y == 1) {
//			k = new Ex11_Soccer();
//		}else if(y == 2 ) {
//			k = new Ex11_BaseGuitar();
//		}
//		k.play();
		
		// 틀린방법은 아니지만 가지수가 많아지면 효율적이지가 않다
//		int qq = 1 ;
//		if(qq == 1 ) {
//			Ex11_Soccer soccer2  = new Ex11_Soccer();
//			soccer2.play();
//		}else if(qq == 2 ) {
//			Ex11_BaseGuitar baseGuitar2 = new Ex11_BaseGuitar();
//			baseGuitar2.play();
//		}
		
		
		
	}
	public static void toPlay(Ex11_IBehavior ib) {
		ib.play ();
	}
	public static void toPlay2(String str) {
		System.out.println(str + " 님  성공");
	}
}
