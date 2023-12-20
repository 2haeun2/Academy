package kr.s03.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//�����
			fos = new FileOutputStream("fileout.txt");
			//�̾��
			//fos = new FileOutputStream("fileout.txt",true);
			
			String message = "Hello File! ���Ͽ� ������ ����մϴ�.";
			
			//���Ͽ� ���� ���
			          //String -> byte[] ��ȯ
			fos.write(message.getBytes());
			
			System.out.println("������ �����ϰ� ������ ���Ͽ� ����մϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
