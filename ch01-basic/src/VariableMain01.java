public class VariableMain01 {
	public static void main(String[] args) {
		//����(Variable)�� ���� ������ �� �ִ� �޸��� ����
		//���� ����
		int num;
		
		//������ �ʱ�ȭ
		num = 17;
	
		//���
		System.out.println(num);
		
		//���� ����� �ʱ�ȭ
		int number = 20;
		
		//���
		System.out.println(number);
		
		//���ǻ���
		//������ ������ ���� ����
		//int number = 30;
		
		//���� ����� �ʱ�ȭ
		int number2 = 100;
		//���
		System.out.println(number2);
		//������ ����
		number2 = 90;
		//���
		System.out.println(number2);
		
		System.out.println("==========");
		
		//������ �ڷ����� ����ϱ� ������ �ι�° ������ ���� �ڷ����� ������ �� ����
		/*
		int a = 10;
		int b = 20;
		*/
		int a = 10, b = 20;
		int result = a + b; //����
		System.out.printf("result = %d%n", result);
		
		//���ǻ���
		/*
		 * + : ���� (���� + ����)
		 * + : ���� (���ڿ� + ���� : ���ڿ��� ���ڸ� �����ؼ� ���ο� ���ڿ�)
		 *         (���� + ���ڿ�)
		 *         (���ڿ� + ���ڿ�)
		 */
		System.out.println("result = " + a + b);//����
		System.out.println("result = " + (a + b));//����
		
		//���� ����
		int no;
		
		//���� ���� �� ��� �Ǵ� �����ϱ� ���� �ݵ�� �ʱ�ȭ�� �ؾ� ��
		//System.out.println(no);
		
	}
}









