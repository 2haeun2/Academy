package kr.s04.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			//InputStreamReader : ����Ʈ��Ʈ�� -> ���ڽ�Ʈ�� ��ȯ
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("����� �̸�:");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.print("����� ����:");
			          //String -> int ��ȯ
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
