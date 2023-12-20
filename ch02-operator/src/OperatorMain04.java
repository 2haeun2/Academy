public class OperatorMain04 {
	public static void main(String[] args) {
		System.out.println("====비교연산자====");
		boolean result;
		int a = 10;
		double b = 10.5;
		
		result = a < b;
		System.out.println("a < b : " + result);
		
		result = a > b;
		System.out.println("a > b : " + result);
		
		result = a >= b;
		System.out.println("a >= b : " + result);
		
		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b;//서로 같으면 true
		System.out.println("a == b : " + result);
		
		result = a != b;//서로 같지 않으면 true
		System.out.println("a != b : " + result);
		
	}
}






