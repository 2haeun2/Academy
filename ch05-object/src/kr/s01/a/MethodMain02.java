package kr.s01.a;

import java.util.Scanner;

public class MethodMain02 {
	
	//������ �����͸� ��ȯ�ϴ� ����޼���
	public int signOf(int a) {
		int sign = 0;
		
		if(a>0) {
			sign = 1;
		}else if(a<0) {
			sign = -1;
		}
		return sign;
	}
	
	public static void main(String[] args) {
		/*
		 * [�ǽ�] �Է��� int�� ������ �����̸� -1��, 0�̸� 0��,
		 * ����̸� 1�� ��ȯ�ϴ� signOf �޼��带 �ۼ��Ͻÿ�.
		 * [��¿���]
		 * ���� �Է�>5
		 * ������� ?
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�>");
		int n = input.nextInt();
		
		//��ü ���� �� ����
		MethodMain02 me = new MethodMain02();
		//��ü�� ����޼��� ȣ��
		int s = me.signOf(n);
		System.out.println("������� " + s);
		
		input.close();
	}
}


