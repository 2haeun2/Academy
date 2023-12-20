public class OperatorMain08 {
	public static void main(String[] args) {
		System.out.println("=====조건연산자(삼항연산자)=====");
		int a = 5, b = 10;
		int max; //최대값을 저장할 변수 선언
		int min; //최소값을 저장할 변수 선언
		
		//최대값 구하기
		max = a > b ? a : b;
		     //false
		System.out.println("max = " + max);
		
		//최소값 구하기
		min = a < b ? a : b;
		     //true
		System.out.println("min = " + min);
	}
}





