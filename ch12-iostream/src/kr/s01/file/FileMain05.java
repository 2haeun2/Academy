package kr.s01.file;

import java.io.File;

public class FileMain05 {
	public static void main(String[] args) {
		String path = "example.txt";
		
		File f1 = new File(path);
		
		System.out.println("=====���� ����=====");
		//delete() : ������ �� ������ �����ϰ� true ��ȯ
		//           ������ �Ұ����ϸ� false ��ȯ
		if(f1.delete()) {
			System.out.println(f1.getName() + " ���� ����");
		}else {
			System.out.println("������ ������ �� �����ϴ�.");
		}
		
	}
}





