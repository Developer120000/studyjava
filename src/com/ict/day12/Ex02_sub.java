package com.ict.day12;

import java.util.Random;
// 다중 상속이 안되기 때문에 Random 상속을 일반적으로 사용하지 않는다
public class Ex02_sub extends Random{
	int su = 0;
	
	public void play() {
		su = nextInt(10) + 1;
		System.out.println(su);
	}
	
	
}
