public class SwitchMain03 {
	public static void main(String[] args) {
		/*
		 * [�ǽ�]
		 * ���� 2���� �Է� �ް� ���������(+,-,*,/,%)�� �Է��ؼ� ������ ������ �����
		 * ����Ͻÿ�.
		 * [��� ����]
		 * ù��° ��:7
		 * ������:+
		 * �ι�° ��:5
		 * 7 + 5 = 12
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0;
		
		System.out.print("ù��° ��:");
		int first = input.nextInt();
		
		System.out.print("������:");
		String operator = input.next();
		
		System.out.print("�ι�° ��:");
		int second = input.nextInt();
		
		switch(operator) {
		case "+":
			result = first + second;break;
		case "-":
			result = first - second;break;
		case "*":
			result = first * second;break;
		case "/":
			if(second!=0) {
				result = first / second;break;
			}else {//�ι�° ���� 0�� ���
				System.out.println("0���� ���� �� �����ϴ�.");
				//���α׷� ����
				System.exit(0);
			}
		case "%":
			if(second!=0) {
				result = first % second;break;
			}else {//�ι�° ���� 0�� ���
				System.out.println("0���� ���� �� �����ϴ�.");
				//���α׷� ����
				System.exit(0);
			}
		default :
			 System.out.println("�߸��� ������ �Է�");
			 //���α׷� ����
			 System.exit(0);
		}
		
		//���
		System.out.println();//�ܼ� �ٹٲ�
		System.out.printf("%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}
}





