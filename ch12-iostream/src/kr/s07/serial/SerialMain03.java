package kr.s07.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class SerialMain03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//����ȭ�� ��ü ����
		UserInfo u1 = new UserInfo("John",20,"�����");
		UserInfo u2 = new UserInfo("Sunny",18,"�λ��");
		
		ArrayList<UserInfo> list = new ArrayList<UserInfo>();
		list.add(u1);
		list.add(u2);
		
		try {
			fos = new FileOutputStream("userInfo.ser");
			oos = new ObjectOutputStream(fos);
			
			//��ü ����ȭ ����
			oos.writeObject(list);
			
			System.out.println("��ü ����ȭ�� ���������� �Ϸ�Ǿ����ϴ�.");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(oos!=null)try {oos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}




