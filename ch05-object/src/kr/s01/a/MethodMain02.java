package kr.s01.a;

import java.util.Scanner;

public class MethodMain02 {
	
	//정수형 데이터를 반환하는 멤버메서드
	public int signOf(int a) {
		int sign = 0;
		
		if(a>0) {
			sign = 1;
		}else if(a<0) {
			sign = -1;
		}
		return sign;
	}
	
	public static void main(String[] args) {
		/*
		 * [실습] 입력한 int형 정수가 음수이면 -1을, 0이면 0을,
		 * 양수이면 1을 반환하는 signOf 메서드를 작성하시오.
		 * [출력예시]
		 * 정수 입력>5
		 * 결과값은 ?
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력>");
		int n = input.nextInt();
		
		//객체 선언 및 생성
		MethodMain02 me = new MethodMain02();
		//객체의 멤버메서드 호출
		int s = me.signOf(n);
		System.out.println("결과값은 " + s);
		
		input.close();
	}
}


