public class ArrayMain10 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� �Է¹޾Ƽ� 1~9���� ���ؼ� ������� ���ϰ� �迭�� �� ����
		 * ������ �� ������ ��� ���� (2 * 1 = 2)���� �迭���� ���� �ҷ���
		 * ����Ͻÿ�.
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] array = new int[9];
		
		System.out.print("�� �Է�>");
		int dan = input.nextInt();
		
		for(int i=0;i<array.length;i++) {//i : 0 ~ 8
			array[i] = dan * (i+1);//���ϴ� ���� 1~9
			//������ ��� ���� �°� ���
			System.out.println(dan + " * " + (i+1) + " = " + array[i]);
		}
		
		
		input.close();
	}
}
