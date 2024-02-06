package com.ict.day16;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05 {
	public static void main(String[] args) {	
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("주소", "충청북도");
		map.put("취미", "운동");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("주소"));
		System.out.println();
		
		// 꺼내기
		for (String k : map.keySet()) {
			System.out.println(k);
			System.out.println(map.get(k));
		}
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k = it.next(); // k 는 키값
			System.out.println(k + " : " + map.get(k));
			
		}
		
		
		Iterator<String> it3 = map.keySet().iterator();
		while (it3.hasNext()) {
			String t = it3.next();
			System.out.println(map.get(t));
		}
		
		Collection<String> va = map.values();
		System.out.println(va);
		
		Set<Entry<String, String>> a1 = map.entrySet();
		Iterator<Entry<String, String>> it2 = a1.iterator();
			while (it2.hasNext()) {
				Entry<String, String> entry = it2.next();
				String k = entry.getKey();
				String j = entry.getValue();
				System.out.println(k + ":" + j);
				
			}
	}
}
