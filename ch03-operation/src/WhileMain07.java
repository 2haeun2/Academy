public class WhileMain07 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		/*
		 * [�ǽ�]
		 * Ŀ������������ �Ƹ޸�ī�� 4,000���Դϴ�. ���� Ŀ�� ������ ���ϰ� ���� �����ϼ���
		 * ������ ������ �߻��� �Ž������� ����ϰ� ��ǰ�� �� ��뺸�� ������ ���� ���
		 * ��ǰ�� ������ �� ���� ��� "�ݾ��� �����մϴ�."��� �˷��� �� �ٽ� ������ 
		 * �� �ִ� ���α׷� �ۼ�
		 * [��¿���]
		 * ���� ���� �Է�>2
		 * ���� ������ �ݾ�>10000
		 * �Ž��� �� : 2,000��
		 * ---> ���� ����
		 * --------------
		 * ���� ���� �Է�>2
		 * ���� ������ �ݾ�>5000
		 * 3,000���� �����մϴ�. 
		 * ---> �ٽ� ������ �� �ֵ��� ó��
		 */
		int price = 4000;
		int quantity; //����
		int balance; //�Ž�����
		int payment; //������ ��
		int total; //�� �����ؾ� �� �ݾ�
		
		while(true) {
			System.out.print("���� ���� �Է�>");
			quantity = input.nextInt();
			System.out.print("���� ������ �ݾ�>");
			payment = input.nextInt();
			
			total = price * quantity;
			balance = payment - total;
			
			if(balance >= 0) {
				break; //while���� ��������
			}
			
			System.out.printf("%,d���� �����մϴ�.%n", -balance);
		}
		
		//�Ž����� ǥ��
		System.out.printf("�Ž����� : %,d��",balance);
		
		input.close();
	}
}



