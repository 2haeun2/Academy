public class OperatorMain11 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�] ����ó��
		 * ����,����,���� ������ �Է� �޾Ƽ� ����, ���(double)�� ���ϰ�
		 * ����,����,����,����,��� ���
		 * [��� ����]
		 * ���� = 87
		 * ���� = 98
		 * ���� = 92
		 * ���� = 
		 * ��� = (�Ҽ��� ��°�ڸ�)
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("���� :");
		int korean = input.nextInt();
		System.out.print("���� :");
		int english = input.nextInt();
		System.out.print("���� :");
		int math = input.nextInt();
		
		//���� ���ϱ�
		int sum = korean + english + math;
		
		//��� ���ϱ�
		double avg = sum / 3.0;//sum�� �ڷ����� int->double�� ����ȯ�Ǿ�
		                       //�Ǽ� / �Ǽ� -> �Ǽ�
		
		System.out.printf("���� = %d%n",korean);
		System.out.printf("���� = %d%n",english);
		System.out.printf("���� = %d%n", math);
		System.out.printf("���� = %d%n", sum);
		System.out.printf("��� = %.2f", avg);
		
		input.close();
	}
}
