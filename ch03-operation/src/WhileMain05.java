public class WhileMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a = 0, total = 0;
		
		System.out.println("0전까지 입력받은 정수로 합 구하기");
		
		while(true) {
			System.out.print("누적할 정수 입력:");
			a = input.nextInt();
			if(a == 0) {
				//while문 탈출
				break;
			}
			//누적
			total += a;
		}
		
		//누적한 데이터 출력
		System.out.println("total = " + total);
		
		input.close();
	}
}



