public class Score {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int korean,english,math,sum;
		char grade;
		float avg;
		
		do {
			System.out.print("����:");
			korean = input.nextInt();
		}while(korean < 0 || korean > 100);//0~100 �Է½� false�� �Ǿ 
		                                   //do���� ��������
		
		do {
			System.out.print("����:");
			english = input.nextInt();
		}while(english < 0 || english > 100);
		
		do {
			System.out.print("����:");
			math = input.nextInt();
		}while(math < 0 || math > 100);
		
		//���� ���ϱ�
		sum = korean + english + math;
		//��� ���ϱ�
		avg = sum / 3.0f;
		
		//��� ���ϱ�
		switch((int)(avg/10)) {
		case 10: //100
		case 9: //90~99
			grade = 'A';break;
		case 8: //80~89
			grade = 'B';break;
		case 7: //70~79
			grade = 'C';break;
		case 6: //60~69
			grade = 'D';break;
		default:
			grade = 'F';
		}
		
		System.out.println();//�ܼ� �ٹٲ�
		System.out.printf("���� = %d%n", sum);
		System.out.printf("��� = %.2f%n",avg);
		System.out.printf("��� = %c", grade);
		
		input.close();
	}
}



