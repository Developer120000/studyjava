package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/JS/util/image01.jpg 파일을 D:/JS/image01.jpg 로 복사 하자 
public class Ex12 {	
	public static void main(String[] args) {
		String inputPath = "D:/JS/util/image01.jpg";
		String outputPath = "D:/JS/image01.jpg";
		
		File in_file = new File(inputPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		File out_file = new File(outputPath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while((b = bis.read()) != -1) {
				bos.write(b);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				// 원본 삭제
				boolean s = in_file.delete();
				if(s) {
					System.out.println("삭제 성공");
				}else {
					System.out.println("삭제 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
