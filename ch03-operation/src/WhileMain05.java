public class WhileMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a = 0, total = 0;
		
		System.out.println("0������ �Է¹��� ������ �� ���ϱ�");
		
		while(true) {
			System.out.print("������ ���� �Է�:");
			a = input.nextInt();
			if(a == 0) {
				//while�� Ż��
				break;
			}
			//����
			total += a;
		}
		
		//������ ������ ���
		System.out.println("total = " + total);
		
		input.close();
	}
}


