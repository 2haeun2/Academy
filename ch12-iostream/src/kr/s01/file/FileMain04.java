package kr.s01.file;

import java.io.File;

public class FileMain04 {
	public static void main(String[] args) {
		//���� ���ϸ�
		String path = "sample.txt";
		//�� ���ϸ�
		String path2 = "example.txt";
		
		File f1 = new File(path);
		
		System.out.println("======���ϸ� ����========");
		//�� ���ϸ��� ���޹޾Ƽ� File ��ü ����
		File f2 = new File(path2);
		
		//������ �̸��� ������ ���� �� ���ϸ� ������ ���� �ִ� File��ü��
		//renameTo�� ���ڷ� ����
		System.out.println(f1.renameTo(f2));
	}
}




