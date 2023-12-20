package kr.s01.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		//지정한 디렉토리의 하위디렉토리 및 파일 정보 읽기
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			//File배열로부터 File객체 반환
			File f2 = files[i];
			if(f2.isDirectory()) {//디렉토리
				System.out.println("["+f2.getName()+"]");//디렉토리명
			}else {//파일
				System.out.print(f2.getName());//파일명
				System.out.printf("(%,dbytes)\n", f2.length());
			}
		}
		
		
	}
}




