public class OperatorMain11 {
	public static void main(String[] args) {
		/*
		 * [실습] 성적처리
		 * 국어,영어,수학 성적을 입력 받아서 총점, 평균(double)를 구하고
		 * 국어,영어,수학,총점,평균 출력
		 * [출력 예시]
		 * 국어 = 87
		 * 영어 = 98
		 * 수학 = 92
		 * 총점 = 
		 * 평균 = (소수점 둘째자리)
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("국어 :");
		int korean = input.nextInt();
		System.out.print("영어 :");
		int english = input.nextInt();
		System.out.print("수학 :");
		int math = input.nextInt();
		
		//총점 구하기
		int sum = korean + english + math;
		
		//평균 구하기
		double avg = sum / 3.0;//sum의 자료형이 int->double를 형변환되어
		                       //실수 / 실수 -> 실수
		
		System.out.printf("국어 = %d%n",korean);
		System.out.printf("영어 = %d%n",english);
		System.out.printf("수학 = %d%n", math);
		System.out.printf("총점 = %d%n", sum);
		System.out.printf("평균 = %.2f", avg);
		
		input.close();
	}
}
