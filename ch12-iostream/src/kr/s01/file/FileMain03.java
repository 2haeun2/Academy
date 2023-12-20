package kr.s01.file;

import java.io.File;
import java.io.IOException;

public class FileMain03 {
	public static void main(String[] args) {
		//������
		//String path = "C:\\javaWork\\sample.txt";
		
		//�����
		String path = "sample.txt";
		
		File f1 = new File(path);
		System.out.println("=====���� ����====");
		try {
			//������ ��θ� ������� ���� ����. ������ �����Ǹ� true ��ȯ, ��������
			//������ false ��ȯ, ��ΰ� �߸��Ǹ� IOException �߻�
			System.out.println(f1.createNewFile());
		}catch(IOException e) {
			e.printStackTrace();//���� ���� ���
		}
		
		System.out.println("======���� ����======");
		System.out.println("������ : " + f1.getAbsolutePath());
		System.out.println("����� : " + f1.getPath());
		System.out.println("���丮�� : " + f1.getParent());
		System.out.println("���ϸ� : " + f1.getName());
		
	}
}








