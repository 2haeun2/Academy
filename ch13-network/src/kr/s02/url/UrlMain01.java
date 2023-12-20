package kr.s02.url;

import java.net.URL;
import java.net.MalformedURLException;

public class UrlMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=dragon#content");
			
			System.out.println("�������� : " + url.getProtocol());
			System.out.println("ȣ��Ʈ : " + url.getHost());
			System.out.println("�⺻ ��Ʈ : " + url.getDefaultPort());
			//��Ʈ�� ������� ������ -1 ��ȯ
			System.out.println("��Ʈ : " + url.getPort());
			System.out.println("�н� : " + url.getPath());
			System.out.println("���� : " + url.getQuery());
			System.out.println("ref : " + url.getRef());
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
