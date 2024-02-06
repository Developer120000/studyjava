package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림
// writeObject() : 객체 직렬화 메소드
public class Ex09_output {
	public static void main(String[] args) {
		// 1. VO 를 객체로 만들자
		Ex09_VO vo1 = new Ex09_VO("고길동", 27, 79.6, true);
		Ex09_VO vo2 = new Ex09_VO("이길동", 19, 69.3, false);
		Ex09_VO vo3 = new Ex09_VO("김길동", 22, 59.8, true);
		Ex09_VO vo4 = new Ex09_VO("가길동", 10, 40.6, true);
		Ex09_VO vo5 = new Ex09_VO("나길동", 35, 81.9, false);
		Ex09_VO vo6 = new Ex09_VO("박길동", 39, 90.3, true);
		Ex09_VO vo7 = new Ex09_VO("임길동", 30, 74.5, true);
		Ex09_VO vo8 = new Ex09_VO("배길동", 13, 50.1, false);
		
		// 직렬화 (파일에 저장)
		String pathname = "D:/JS/util/object01.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 객체 직렬화
			
			// 1. 하나일 때
			// oos.writeObject(vo1);
			// oos.flush();
			
			// 2. 객체가 여러개 일 때는 객체를 컬렉션으로 모으자
			ArrayList<Ex09_VO> list = new ArrayList<Ex09_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			// 객체직렬화
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
		// 연습
		String pathname2 = "D:/JS/util/object01.txt";
		File file2 = new File(pathname2);
		
		ObjectOutputStream oos2 = null;
		
		try {
			oos2 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file2)));
			
			ArrayList<Ex09_VO> list2 = new ArrayList<Ex09_VO>();
			list2.add(vo1);
			list2.add(vo7);
			list2.add(vo6);
			
			oos2.writeObject(list2);
			oos2.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos2.close();
			} catch (Exception e2) {
			}
		}
				
	}
}
