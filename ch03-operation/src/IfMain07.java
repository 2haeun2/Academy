import java.util.Scanner;

public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ��������� �Է��ϰ� �� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �� ���� = (���� ���� - ����) - (������ �������� 0, ������ ������ �ʾҾ����� 1)
		 * 
		 * [��� ����]
		 * ���� �Է�:2001
		 * �� �Է�:10
		 * �� �Է�:20
		 * �� ���̴� ?
		 * [�����ּ�]pinos71@daum.net
		 * [��Ʈ]���� ������ �¾ ������ �����ؼ� ���̸� ���ϰ�
		 * ���� ���� �¾ ���� ���ؼ� �� ���̸� ����
		 * ���� ���� �¾ ���� ������ ���� �ϰ� �¾ ���� ���ؼ� �� ���̸� ����
		 */
		int thisYear = 2021;
		int thisMonth = 11;
		int thisDate = 3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("����:");
		int year = input.nextInt();
		System.out.print("��:");
		int month = input.nextInt();
		System.out.print("��:");
		int date = input.nextInt();
		
		//���� ���ϱ�
		int age = thisYear - year;
		
		//���� ���� �¾ ���� ��
		if(thisMonth < month) {//�� 11 < 12
			age--; //age-=1
		}else if(thisMonth == month) {
			if(thisDate < date) {//�� 2 < 3
				age--;
			}
		}
		System.out.printf("�� ���̴� %d%n", age);
		
	}
}





