public class ArrayMain08 {
	public static void main(String[] args) {
		//클래스를 실행할 때 main의 인자인 args가 가리키는 배열에
		//데이터를 전달해서 활용할 수 있음
		//배열의 자료형 String이기 때문에 숫자를 전달해도 모두 문자열로
		//변환해서 저장하게 됨
		System.out.println(args[0] + args[1]);//문자열 + 문자열
		System.out.println("---------------");
		
		//문자열을 숫자로 변환
		//        String -> int
		int num = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("합계 : " + (num + num2));
	}
}





