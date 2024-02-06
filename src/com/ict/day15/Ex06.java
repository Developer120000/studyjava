package com.ict.day15;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		// 6 자리 채우기 (중복 안됨)(HashSet 이용한 방법)
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 10);
//			if(set1.add(su)) { // 방법1
//				continue;
//			}else {
//				i--;
//			}
			System.out.println(set1);
			// 방법2
			if (!set1.add(su)) {
				i--;
			}
		}
			System.out.println(set1);
	}
}
