public class PrintMain06 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * System.out.printf를 이용해서 아래와 같이 출력하시오.
		 * 
		 * 국어 : 98점
		 * 영어 : 97점
		 * 총점 : 195점
		 * 평균 : 97.5점
		 */
		System.out.printf("%s : %d점%n", "국어", 98);
		System.out.printf("%s : %d점%n", "영어", 97);
		System.out.printf("%s : %d점%n", "총점", 195);
		System.out.printf("%s : %.1f점", "평균", 97.5);
	}
}




