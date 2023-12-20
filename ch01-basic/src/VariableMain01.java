public class VariableMain01 {
	public static void main(String[] args) {
		//변수(Variable)은 값을 저장할 수 있는 메모리의 공간
		//변수 선언
		int num;
		
		//변수의 초기화
		num = 17;
	
		//출력
		System.out.println(num);
		
		//변수 선언과 초기화
		int number = 20;
		
		//출력
		System.out.println(number);
		
		//주의사항
		//동일한 변수명 선언 오류
		//int number = 30;
		
		//변수 선언과 초기화
		int number2 = 100;
		//출력
		System.out.println(number2);
		//데이터 변경
		number2 = 90;
		//출력
		System.out.println(number2);
		
		System.out.println("==========");
		
		//동일한 자료형을 사용하기 때문에 두번째 변수명 앞의 자료형은 생략할 수 있음
		/*
		int a = 10;
		int b = 20;
		*/
		int a = 10, b = 20;
		int result = a + b; //연산
		System.out.printf("result = %d%n", result);
		
		//주의사항
		/*
		 * + : 연산 (숫자 + 숫자)
		 * + : 연결 (문자열 + 숫자 : 문자열과 숫자를 연결해서 새로운 문자열)
		 *         (숫자 + 문자열)
		 *         (문자열 + 문자열)
		 */
		System.out.println("result = " + a + b);//연결
		System.out.println("result = " + (a + b));//연산
		
		//변수 선언
		int no;
		
		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 함
		//System.out.println(no);
		
	}
}









