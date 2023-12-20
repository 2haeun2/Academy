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
		
		//지정한 경로의 하위디렉토리 및 파일 정보 File[]로 반환
		File[] files = f.listFiles();
		
		String attribute = "";
		String size = "";
		String name = "";
		
		for(int i=0;i<files.length;i++) {
			//File배열에서 File를 반환
			File f2 = files[i];
			name = f2.getName();
			
			if(f2.isDirectory()) {//디렉토리
				size = "0";
				attribute = "DIR";
			}else {//파일
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







