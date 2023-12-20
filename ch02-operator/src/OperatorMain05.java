public class OperatorMain05 {
	public static void main(String[] args) {
		System.out.println("=====논리연산자=====");
		boolean a, b, result;
		a = true;
		b = false;
		
		result = a && b; //논리곱, 선조건 및 후조건 모두 true이면 결과값이 true
		System.out.println("a && b : " + result);
		
		result = a || b; //논리합, 선조건 또는 후조건 하나만이라도 true이면 결과값이 true
		System.out.println("a || b : " + result);
		
		result = !a;//부정
		System.out.println("!a : " + result);
	}
}
