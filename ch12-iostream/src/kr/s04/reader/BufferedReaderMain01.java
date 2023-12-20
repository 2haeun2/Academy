package kr.s04.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//InputStreamReader : 바이트스트림 -> 문자스트림 변환
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("당신의 이름:");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.print("당신의 나이:");
			          //String -> int 변환
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
