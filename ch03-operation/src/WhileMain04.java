public class WhileMain04 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0 ������ �Է¹��� ������ �� ���ϱ�");
		
		System.out.print("������ ���� ������ �Է�:");
		//�Է°��� a�� �����ϰ� a�� ���� 0�� �ƴϸ� true
		while((a = input.nextInt()) != 0) {
			//����
			total += a;
			System.out.print("������ ���� ������ �Է�:");
		}
		
		//������ ������ ���
		System.out.println("total = " + total);
		
		input.close();
	}
}



