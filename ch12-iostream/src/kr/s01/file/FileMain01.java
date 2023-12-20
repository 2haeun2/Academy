package kr.s01.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\";
		
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮�Դϴ�.");
			System.exit(0);
		}
		
		//������ ���丮�� �������丮 �� ���� ���� �б�
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			//File�迭�κ��� File��ü ��ȯ
			File f2 = files[i];
			if(f2.isDirectory()) {//���丮
				System.out.println("["+f2.getName()+"]");//���丮��
			}else {//����
				System.out.print(f2.getName());//���ϸ�
				System.out.printf("(%,dbytes)\n", f2.length());
			}
		}
		
		
	}
}




