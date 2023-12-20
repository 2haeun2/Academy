public class ArrayMain02 {
	public static void main(String[] args) {
		//배열 선언 및 생성(암시적 배열 생성), 초기화
		int[] score = {100,88,88,100,90};//length=5
		int sum = 0; //총점
		float avg = 0.0f; //평균
		
		//반복문을 이용한 총점 구하기
		             //배열의 길이(5)
		for(int i=0;i<score.length;i++) {
			//누적
			sum += score[i];
		}
		
		//평균 구하기
		avg = sum / (float)score.length;
		
		System.out.printf("총점 : %d%n", sum);
		System.out.printf("평균 : %.2f", avg);
		
		
	}
}


