public class SwitchMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 정수 2개를 입력 받고 산술연산자(+,-,*,/,%)를 입력해서 연산을 수행한 결과를
		 * 출력하시오.
		 * [출력 예시]
		 * 첫번째 수:7
		 * 연산자:+
		 * 두번째 수:5
		 * 7 + 5 = 12
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int result = 0;
		
		System.out.print("첫번째 수:");
		int first = input.nextInt();
		
		System.out.print("연산자:");
		String operator = input.next();
		
		System.out.print("두번째 수:");
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
			}else {//두번째 수가 0인 경우
				System.out.println("0으로 나눌 수 없습니다.");
				//프로그램 종료
				System.exit(0);
			}
		case "%":
			if(second!=0) {
				result = first % second;break;
			}else {//두번째 수가 0인 경우
				System.out.println("0으로 나눌 수 없습니다.");
				//프로그램 종료
				System.exit(0);
			}
		default :
			 System.out.println("잘못된 연산자 입력");
			 //프로그램 종료
			 System.exit(0);
		}
		
		//출력
		System.out.println();//단순 줄바꿈
		System.out.printf("%d %s %d = %d", first,operator,second,result);
		
		input.close();
	}
}





