package com.ict.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex06 {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap 에 저장시키고
		// 원하는 나라가 key 값이 되어. 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성

		Scanner scan = new Scanner(System.in);

//		Map<String, String> map = new HashMap<String, String>();
//		map.put("대한민국", "서울");
//		map.put("캐나다", "오타와");
//		map.put("영국", "런던");
//		map.put("스위스", "베른");
//		
//		Set<String> keys = map.keySet();
//		
//		esc: while (true) {
//			System.out.println("나라 입력 : ");
//			String con = scan.next();
//
//			if(keys.contains(con)) {
//				String res = map.get(con);
//				System.out.println(con + "의 수도는 " + res + "입니다.");
//			}else {
//				System.out.println("데이터가 없는 나라 입니다.");
//			}
//			if (map.containsKey(con)) {
//				System.out.println(con + "의 수도는 " + map.get(con) + "입니다.");
//			} else if (map.get(con) == null)
//				System.out.println("데이터가 없는 나라 입니다.");
			
//			while (true) {
//				System.out.println("계속할까요? 1.계속, 2.그만");
//				int su = scan.nextInt();
//				if (su == 1) {
//					continue esc;
//				} else if (su == 2) {
//					break esc;
//				} else {
//					System.out.println("다시 입력하세요");
//				}
//			} // 내부 while
//		} // 밖 while
		
		
		
		
		
		
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap 에 저장시키고
		// 원하는 나라가 key 값이 되어. 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		
		HashMap<String, String> it2 = new HashMap<String, String>();
		it2.put("대한민국", "서울");
		it2.put("캐나다", "오타와");
		it2.put("영국", "런던");
		it2.put("스위스", "베른");
		
		Set<String> res = it2.keySet();
		
		ex:while (true) {
				System.out.print("나라 입력 : ");
				String an = scan.next();
				
				if(res.contains(an)) {
					String res2 = it2.get(an);
					System.out.println(an + "의 수도는 " + res2 + "입니다.");
				}else {
					System.out.println("데이터가 없는 나라입니다.");
				}
					
			while (true) {
				try {
					System.out.println("계속 할까요? 1.y 2.n");
					int ans = scan.nextInt();
					if(ans == 1) {
						continue ex;
					}else if(ans == 2) {
						break ex;
					}else {
						System.out.println("다시 입력해주세요");
						continue;
					}
				} catch (Exception e) {
					System.out.println("숫자로 입력하세요");
					String h = scan.nextLine();
					continue;
				}
			}
		}
		
		
		
		
	}
}
