package kr.s01.file;

import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		String path = "example.txt";
		
		File f1 = new File(path);
		
		System.out.println("=====파일 삭제=====");
		//delete() : 삭제할 수 있으면 삭제하고 true 반환
		//           삭제가 불가능하면 false 반환
		if(f1.delete()) {
			System.out.println(f1.getName() + " 파일 삭제");
		}else {
			System.out.println("파일을 삭제할 수 없습니다.");
		}
		
	}
}






