public class Score {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int korean,english,math,sum;
		char grade;
		float avg;
		
		do {
			System.out.print("국어:");
			korean = input.nextInt();
		}while(korean < 0 || korean > 100);//0~100 입력시 false가 되어서 
		                                   //do블럭을 빠져나감
		
		do {
			System.out.print("영어:");
			english = input.nextInt();
		}while(english < 0 || english > 100);
		
		do {
			System.out.print("수학:");
			math = input.nextInt();
		}while(math < 0 || math > 100);
		
		//총점 구하기
		sum = korean + english + math;
		//평균 구하기
		avg = sum / 3.0f;
		
		//등급 구하기
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
		
		System.out.println();//단순 줄바꿈
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f%n",avg);
		System.out.printf("등급 = %c", grade);
		
		input.close();
	}
}



