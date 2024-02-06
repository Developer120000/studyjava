package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String pathname = "D:/JS/util/exam01.txt";
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패"); // 같은 이름이 있거나 위치가 다르면 실패
			}
			System.out.println();
			
			File file3 = new File("D:/JS/util/kkk/yyy");
			boolean b2 = file3.mkdir();
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				// 만들고자 하는 yyy 위에 kkkk 가 존재 하지 않아서 실패 = mkdirs() 하면 성공
				System.out.println("디렉토리 생성 실패");
			}
			
			boolean b3 = file3.mkdirs();
			if(b3) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}

			// 삭제 대상(파일)
			String pathname2 = "D:/JS/util/exam01.txt";
			File file4 = new File(pathname2);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}

			// 삭제 대상(디렉토리), 실패(폴더 안에 내용이 있으면 삭제 불가)
			String pathname4 = "D:/JS/util/kkk";
			File file6 = new File(pathname4);
			boolean b6 = file6.delete();
			if (b6) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			// 삭제 성공
			String pathname3 = "D:/JS/util/kkk/yyy";
			File file5 = new File(pathname3);
			boolean b5 = file5.delete();
			if (b5) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			
			String pathname5 = "D:/JS/util/kkk";
			File file7 = new File(pathname5);
			boolean b7 = file6.delete();
			if (b7) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
