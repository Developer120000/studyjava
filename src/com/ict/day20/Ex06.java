package com.ict.day20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
// 문서 제외한 노래,동영상,이미지 는 바이트 스트림(기계위주) 사용, 글자는 문자 스트림(사람 위주) 사용
// BufferedReader => readLine() : 한줄씩 읽는다. 더 이상 읽을 수 없을 때 null; 이 출력된다.
public class Ex06 {
	public static void main(String[] args) {
		String pathname = "D:/JS/util/test06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg = null;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
}
