public class IfMain02 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수형 데이터 한 개 입력:");
		int a = input.nextInt();
		
		//if~else
		if(a%2==1) //홀수
			System.out.println("홀수입니다!!");
		else //짝수
			System.out.println("짝수입니다!!");
		
		input.close();
	}
}
