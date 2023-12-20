package kr.s07.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class SerialMain02 {
	public static void main(String[] args) {
		System.out.println("====��ü ������ȭ ����====");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("object.ser");
			ois = new ObjectInputStream(fis);
			
			//������ȭ ����
			Customer m = (Customer)ois.readObject();
			System.out.println(m.getName());
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
		
	}
}



