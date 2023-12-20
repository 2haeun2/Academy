package kr.s07.array;

public class ScoreMain {
	public static void main(String[] args) {
		//배열 생성, 배열의 길이 4
		Score[] scoreArray = new Score[4];
		
		int total = 0; //반(4명) 전체 총점
		int avg = 0; //반(4명) 전체 과목의 평균

		//Score 객체를 4개 생성해서 배열에 저장
		scoreArray[0] = new Score("홍길동",98,96,88);
		scoreArray[1] = new Score("이순신",99,72,82);
		scoreArray[2] = new Score("장영실",97,83,81);
		scoreArray[3] = new Score("김유신",86,66,83);
		
		//반복문을 이용해서 배열에 접근해서 객체의 데이터를 읽기
		for(int i=0;i<scoreArray.length;i++) {
			System.out.printf("%s\t",scoreArray[i].getName());
			System.out.printf("%d\t", scoreArray[i].getKorean());
			System.out.printf("%d\t", scoreArray[i].getEnglish());
			System.out.printf("%d\t", scoreArray[i].getMath());
			System.out.printf("%d\t", scoreArray[i].makeSum());
			System.out.printf("%d\t", scoreArray[i].makeAvg());
			System.out.printf("%s\n", scoreArray[i].makeGrade());
			
			//전체 총점
			total += scoreArray[i].makeSum();
		}
		//전체 평균
		avg = total / (scoreArray.length * 3);
		
		//반 전체 총점,평균 출력
		System.out.printf("전체 총점 : %d, 전체 평균 : %d", total, avg);
	}
}



