package kr.s01.file;

import java.io.File;

public class FileMain06 {
	public static void main(String[] args) {
		System.out.println("=====디렉토리 생성======");
		File f1 = new File("C:\\javaWork\\javaSample");
		System.out.println(f1.mkdir());
		
		System.out.println("=====디렉토리 삭제======");
		if(f1.delete()) {
			System.out.println(f1.getName() + " 디렉토리가 삭제됨!");
		}else {
			System.out.println("디렉토리를 삭제할 수 없습니다.");
		}
	}
}
