public class ArrayMain03 {
	public static void main(String[] args) {
		//배열의 선언 및 생성, 초기화
		int[] score = {79,88,91,33,100,55,95}; //length=7
		             //0   1 2  3  4   5   6
		
		int max = score[0]; //배열의 첫번째 값으로 최대값을 초기화
		int min = score[0]; //배열의 첫번째 값으로 최소값을 초기화
		
		for(int i=1;i<score.length;i++) {
			//최대값 구하기
			if(score[i] > max) {
				max = score[i];
			}
			//최소값 구하기
			if(score[i] < min) {
				min = score[i];
			}
		}
		
		//최대값과 최소값 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
}




