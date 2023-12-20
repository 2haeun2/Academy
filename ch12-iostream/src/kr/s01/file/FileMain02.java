package kr.s01.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain02 {
	public static void main(String[] args) {
		SimpleDateFormat sf = 
				        new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String path = "C:\\";
		File f = new File(path);
		
		//������ ����� �������丮 �� ���� ���� File[]�� ��ȯ
		File[] files = f.listFiles();
		
		String attribute = "";
		String size = "";
		String name = "";
		
		for(int i=0;i<files.length;i++) {
			//File�迭���� File�� ��ȯ
			File f2 = files[i];
			name = f2.getName();
			
			if(f2.isDirectory()) {//���丮
				size = "0";
				attribute = "DIR";
			}else {//����
				size = f2.length() + "";
				attribute = f2.canRead() ? "R" : " ";
				attribute += f2.canWrite() ? "W" : " ";
				attribute += f2.isHidden() ? "H" : " ";
			} 
			
			System.out.printf("%s %3s %6s %s\n", 
					sf.format(new Date(f2.lastModified())), attribute,
					size, name);
		}
	}
}







