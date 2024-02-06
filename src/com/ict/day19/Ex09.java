package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억) 를 이용해서 지연 현상을 해결한다.
// BufferdOutStream 사용 // 혼자서는 사용 안됨 OutputStream 이랑 같이 사용 
public class Ex09 {
	public static void main(String[] args) {
		String pathname = "D:/JS/util/test01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			// true 있으면 이어쓰기가 된다(실행횟수만큼 저장됨), 없으면 덮어쓰기가 된다.
			fos = new FileOutputStream(file, true);
			bos = new BufferedOutputStream(fos); // 체인방식 위에 변수를 아래에 넣어 사용
			
			String msg = "한국 ICT 인재 개발원 \n5강의장 \n자바 실습 중\n";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close(); // 바깥쪽 먼저 닫고 안쪽 닫는게 정석
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
