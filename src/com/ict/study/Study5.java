package com.ict.study;

import java.util.Random;

public class Study5 {
	public static void main(String[] args) {
		/*
		 
		 클래스란?
		 클래스는 객체를 만들기 위한 모든 정보를 가지고 있는 파일로
		 필드,메소드,생성자를 가지고있다
		 필드는 데이터(변수,상수), 변수는 상태값 을 가지고 있고 언제나 변할수 있다 상수는 절대 변경할수 없는 데이터
		 메소드는 기능 동작을 가지고 있다.
		 메소드를 호출하면 해당 내용이 실행된다
		 실행이끝나고 난후 호출한곳으로 되돌아간다 메소드가 다른 메소드를 호출할 수 있다
		 생성자는 클래스이름=저장이름=파일이름=생성자이름 모두 같다
		 객체로 생성될때 한번 호출된다.
		 
		 구조:헤더,필드,메소드,생성자
		 [접근제한자][클래스 종류]class 클래스이름{ }
		 접근제한자 : 클래스,필드,메소드,생성자 앞에 모두 사용 가능(생략 가능), 외부에서 접근할수 있는 권한의 단계를 말한다
		 public : 누구나 접근 가능
		 private : 외부 접근 불가, 내부 멤버 끼리만 접근 가능
		 default : 같은 패키지 안에서만 가능
		 protected : 같은 패키지 안에서만 접근 가능, 다른 패키지에서는 상속관계에서만 접근 가능
	 	 클래스 종류 : 일반적인 클래스에서는 생략하고 특정 클래스에게만 예약어 사용(final,abstract 등)
	 	 class : 클래스임을 나타내는 예약어
	 	 클래스이름 : 클래스이름=파일이름=저장이름=생성자 이름 같다
	 	  		  첫글자는 대문자,두번째단어 이상부터 첫글자들은 대문자
	 	  		  숫자는 중간이나 뒤에 사용하고 공백문자 불가
		 메소드 구성 : [접근제한자][메소드 종류]반환형 메소드이름([인자=매개변수]){실행내용}
		 접근 제한자 : 클래스와 내용이 같다
		 메소드 종류 : 일반적인 메소드는 생략한다 특정 메소드일때 static 예약어 사용한다
		 반환형 : 메소드가 실행이 끝나고 호출한곳으로 되돌아가는데 이 때 가지고 가는 정보의 자료형을 말한다
		 		정보를 가지고 가지 않을때는 void 라는 예약어를 사용한다.
		 		main 메소드는 실행한후에 jvm에게 되돌아가지만 이때 아무것도 가져가지 않는다.
		 		메소드는 첫단어는 소문자,두번째 단어 이상부터 첫글자만 대문자 사용
		 		공백문자 불가, 숫자는 중간이나 뒤에 사용([인자=매개변수]) 앞에 붙는다
		 인자 = 매개변수 : 메소드가 실행할때 필요한 정보를 외부에서 가져오는 통로
		 				메소드 이름이 같아도 인자 수나 자료형이 다르면 다른 메소드로 취급한다.
		 				오버로딩 : 클래스 안에 같은 메소드가 여러개로 정의 되어 있는 것
		 
		 
		 
		 
		 생성자란?
		 클래스가 객체로 만들어질때 한번 생성된다.
		 클래스이름 = 저장이름=파일이름=생성자이름이 같다.
		 목적은 필드의 초기값을 지정하는것이다
		 메소드와 다르게 반환형이 없다
		 [접근제한자] 생성자이름([인자]){ 실행내용 }
		 인자가 없는 생성자를 기본생성자라고 한다
		 생성자도 오버로딩이 가능하다
		 생성자 없이 클래스를 객체로 생성하면 기본생성자로 객체를 만든다.
		 모든 클래스는 기본생성자를 가지고 있다.
		 
		 
		 구조:
		 
		 
		 스태틱과 인스턴스란
		 인스턴스 : 객체 생성
		 필드나 메소드에서 스태틱이 안써있으면 모두 인스턴스이다 일반적으로 모두 인스턴스이다
		 인스턴스 필드나 메소드는 객체가 생성될때 만들어진다
		 heap 메모리에 만들어짐
		 참조변수.멤버필드, 참보변수.멤버메소드
		 스태틱 : 객체 생성과 상관없이 미리 만들어져있는 필드와 메소드
		 반드시 스태틱 예약어 사용
		 객체 생성과 상관없이 호출가능
		 클래스이름.멤버필드 클래스이름.멤버메소드
		 
		 
		 
		 
		 
		클래스란?
		클래스는 최소한의 저장단위이며 객체로 만들기 위한 모든 정보를 가지고 있는 파일이다
		클래스는 멤버필드,멤버메소드,생성자 를 가지고 있다
		[접근제한자][클래스 종류]class 클래스이름{}
		
		필드는 변수,상수로 이루어져있다
		변수는 언제든지 변할수 있는 데이터이고
		상수는 절대로 변할수 없는 데이터이다
		
		
		메소드는 호출시 실행내용을 실행하고 끝난 뒤에는 호출한곳으로 되돌아간다
		메소드가 다른 메소드를 호출할 수 있다.
		호출방법은 [접근제한자][메소드 종류]반환형 메소드이름([인자]){실행내용}
		접근제한자 : 클래스와 동일하다
		메소드 종류 : 일반적인 메소드에서는 생략하고 특정 메소드일때만 static 예약어를 사용한다
		반환형 : 실행을하고 호출한곳으로 되돌아갈때 가지고 가는 정보의 자료형 을 말한다
		 	   정보를 가지고 가지 않을때는 void 라는 예약어를 사용한다
		인자 = 매개변수 : 실행할때 필요한 정보를 외부에서 가지고 오는 통로이다
					 메소드의 이름이 같아도 인자의 자료형이나 수가 다르면 다른메소드로 취급한다
					 오버로딩이라고 한다
		
		접근제한자란?
		외부에서 접근할 수 있는 권한의 단계를 말한다
		public 누구나 접근 가능
		private 외부에서는 접근 불가능 내부 멤버끼리만 접근 가능
		default 같은 패키지에서만 접근 가능
		protected 같은 패키지에서만 접근가능하고 외부에서는 상속관계에서만 접근 가능
		
		생성자란?
		클래스가 객체로 호출될때 한번 호출된다
		클래스이름=저장이름=파일이름=생성자이름이 모두 같다
		목적은 필드의 초기값을 지정하는것이다
		오버로딩이 가능하며 생성자 없이 객체를 생성하면 기본생성자로 객체를 생성한다
		모든 클래스는 기본생성자를 가지고 있다.
		
		스태틱과 인스턴스
		필드나 메소드에 static 이 안써있으면 모두 인스턴스이다
		인스턴스 필드나 메소드는 객체가 생성될때 만들어진다
		heap메모리에 만들어진다 호출방법은 참조변수.멤버필드, 참조변수.멤버메소드
		
		스태틱
		객체 생성과 상관없이 미리 만들어져있고 그냥 호출이 가능하다
		반드시 static 예약어를 사용해야하며
		호출방법은 클래스이름.멤버필드, 클래스이름.멤버메소드
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 */
		
		Random ran = new Random();
		System.out.println("Com : " + ran.nextInt(9));
	}
}
