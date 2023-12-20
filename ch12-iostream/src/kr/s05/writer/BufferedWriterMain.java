package kr.s05.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("bufferedWriter.txt");
			bw = new BufferedWriter(fw);
			bw.write("BufferedWriter 테스트입니다.");
			bw.newLine();
			bw.write("안녕하세요"+
			    System.getProperty("line.separator")+"하하하!");
			//버퍼에 내용을 비우고 내용을 파일에 출력
			bw.flush();
			
			System.out.println("파일을 생성하고 파일에 내용을 출력합니다.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(bw!=null)try {bw.close();}catch(IOException e) {}
			if(fw!=null)try {fw.close();}catch(IOException e) {}
		}
	}
}
