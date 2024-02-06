package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL (Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소
// URL 클래스 : 해당 위치의 자원의 결과만 가져온다.
// 			  final 클래스이다. 상속 안됨
public class Ex12 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null; // 사람이 봐야되서 Reader 가 있어야 된다.
		BufferedReader br = null;
		
		// 내 컴퓨터에 저장
		String pathname = "C:/JS/util/webpage01.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://comic.naver.com/index");
			
			is = url.openStream(); // 주소가서 먼저 정보를 가져온다
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			// String 에 여러 번 "+" 사용하면 메모리에 쓸데없는 공간들이 만들어진다.
			// 그것을 해결하기 위해서 StringBuffer 나 StringBuilder 를 사용한다.
			// append() 로 추가 한다.
			StringBuffer sb = new StringBuffer(); // 둘다 하는일은 같지만 멀티스레드 지원, 단일스레드에서 빌더보다 성능 떨어짐
//			StringBuilder sb = new StringBuilder(); // 둘다 하는일 같지만 멀티스레드 지원안함, 단일 스레드에서 쓰면 좋음
			while((msg = br.readLine()) != null) {
				System.out.println(msg + "\n");
				sb.append(msg + "\n"); // while 문 돌면서 계속 쌓이면서 저장된다.
			}
			 // 안나오는 글이 있을 수 있어 toSting으로 자료형을 변환해준다
//			System.out.println(sb.toString());
			
			// 파일에 저장하기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
		
		
	}
}
