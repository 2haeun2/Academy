public class IfMain06 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �� ���� �Է� �޾Ƽ� ������ �����ϰ� �� �� �� �ִ밪�� �ּҰ��� ���Ͽ�
		 * �ִ밪�� �ּҰ��� ����Ͻÿ�.
		 * �Է��� �� ���� ���� ��� "�� ���� ����."��� ���
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		int a, b;
		System.out.print("ù��° ���� �Է�:");
		a = input.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("�ִ밪 : " + a);
			System.out.println("�ּҰ� : " + b);
		}else if(a < b) {
			System.out.println("�ִ밪 : " + b);
			System.out.println("�ּҰ� : " + a);
		}else {//a == b
			System.out.println("�� ���� ����!");
		}
		
		
		input.close();
	}
}
