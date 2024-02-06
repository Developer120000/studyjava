package com.ict.study;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class Study7 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "C:/JS/util/map.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			URL url = new URL("https://map.naver.com/p?c=15.00,0,0,0,dh");
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(is = conn.getInputStream()));
			
			String msg = null;
			StringBuilder sb = new StringBuilder();
			
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
				is.close();
			} catch (Exception e2) {
			}
		}
		
		
		InputStream is2 = null;
		BufferedReader br2 = null;
		
		String pathname2 = "C:/JS/util/map.txt";
		File file2 = new File(pathname2);
		BufferedWriter bw2 = null;
		
		try {
			URL url2 = new URL("https://map.naver.com/p?c=15.00,0,0,0,dh");
			URLConnection conn2 = url2.openConnection();
			br2 = new BufferedReader(new InputStreamReader(is2));
			
			String msg2 = null;
			StringBuilder sb2 = new StringBuilder();
			
			while((msg2 = br2.readLine()) != null) {
				sb2.append(msg2 + "\n");
			}
			
			bw2 = new BufferedWriter(new FileWriter(file2));
			bw2.write(sb2.toString());
			bw2.flush();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw2.close();
				br2.close();
				is2.close();
			} catch (Exception e2) {
			}
		}
		

		
		
		
	}
}
