public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(���˹���,������)�� �̿��� ���(�������� ������
		//ǥ���� �� �ִ� ���� ���� ����)
		
		//����             ���˹���,������  
		System.out.printf("%c%n", 'A');
		System.out.printf("%6c%n", 'B');//6�ڸ� Ȯ�� �����ʿ� ����
		System.out.printf("%-6c%n", 'C');//6�ڸ� Ȯ�� ���ʿ� ����
		
		System.out.println("===========");
		
		//����
		System.out.printf("%d%n", 67);
		System.out.printf("%,d��%n", 10000);//3�ڸ� ������ ��ǥ ǥ��
		System.out.printf("%5d%n",20);//5�ڸ��� ��� �����ʺ��� ǥ��
		System.out.printf("%-5d%n", 20);//5�ڸ��� ��� ���ʺ��� ǥ��
		
		System.out.println("===========");
		
		//�Ǽ�
		System.out.printf("%f%n", 35.896);
		System.out.printf("%.2f%n", 35.896);//�Ҽ��� ��°�ڸ����� ���
		System.out.printf("%10.2f%n", 35.896);//10�ڸ��� ��� �����ʺ��� ǥ��, 
		                                      //�Ҽ��� ��°�ڸ����� ���
		
		System.out.println("==========");
		
		//���ڿ�
		System.out.printf("%s%n","����");
		
		System.out.printf("%s�� %d���Դϴ�.\n","����",98);
		
		//����
		System.out.printf("%b", true);
		
	}
}








