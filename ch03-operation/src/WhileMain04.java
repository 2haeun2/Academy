public class WhileMain04 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a, total = 0;
		
		System.out.println("0 전까지 입력받은 정수로 합 구하기");
		
		System.out.print("누적할 정수 데이터 입력:");
		//입력값을 a에 저장하고 a의 값이 0이 아니면 true
		while((a = input.nextInt()) != 0) {
			//누적
			total += a;
			System.out.print("누적할 정수 데이터 입력:");
		}
		
		//누적한 데이터 출력
		System.out.println("total = " + total);
		
		input.close();
	}
}



