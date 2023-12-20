import java.util.Scanner;

public class IfMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년원일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만 나이 = (현재 연도 - 생년) - (생일이 지났으면 0, 생일이 지나지 않았았으면 1)
		 * 
		 * [출력 예시]
		 * 연도 입력:2001
		 * 월 입력:10
		 * 일 입력:20
		 * 만 나이는 ?
		 * [메일주소]pinos71@daum.net
		 * [힌트]현재 연도와 태어난 연도를 연산해서 나이를 구하고
		 * 현재 월과 태어난 월을 비교해서 만 나이를 구함
		 * 현재 월과 태어난 월이 같으면 현재 일과 태어난 일을 비교해서 만 나이를 구함
		 */
		int thisYear = 2021;
		int thisMonth = 11;
		int thisDate = 3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("연도:");
		int year = input.nextInt();
		System.out.print("월:");
		int month = input.nextInt();
		System.out.print("일:");
		int date = input.nextInt();
		
		//나이 구하기
		int age = thisYear - year;
		
		//현재 월과 태어난 월을 비교
		if(thisMonth < month) {//예 11 < 12
			age--; //age-=1
		}else if(thisMonth == month) {
			if(thisDate < date) {//예 2 < 3
				age--;
			}
		}
		System.out.printf("만 나이는 %d%n", age);
		
	}
}





