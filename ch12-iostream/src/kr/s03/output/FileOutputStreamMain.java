package kr.s03.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//덮어쓰기
			fos = new FileOutputStream("fileout.txt");
			//이어쓰기
			//fos = new FileOutputStream("fileout.txt",true);
			
			String message = "Hello File! 파일에 내용을 출력합니다.";
			
			//파일에 내용 출력
			          //String -> byte[] 변환
			fos.write(message.getBytes());
			
			System.out.println("파일을 생성하고 내용을 파일에 출력합니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
