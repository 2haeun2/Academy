package kr.s01.file;

import java.io.File;

public class FileMain04 {
	public static void main(String[] args) {
		//현재 파일명
		String path = "sample.txt";
		//새 파일명
		String path2 = "example.txt";
		
		File f1 = new File(path);
		
		System.out.println("======파일명 변경========");
		//새 파일명을 전달받아서 File 객체 생성
		File f2 = new File(path2);
		
		//파일의 이름을 변경할 때는 새 파일명 정보를 갖고 있는 File객체를
		//renameTo에 인자로 전달
		System.out.println(f1.renameTo(f2));
	}
}




