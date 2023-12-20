public class IfMain03 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 한 개 입력:");
		int a = input.nextInt();
		if(a>0) // a가 0보다 크면
			System.out.println(a + "는 양수입니다.");
		else if(a < 0) //a가 0보다 작으면
			System.out.println(a + "는 음수입니다.");
		else
			System.out.println("0입니다.");
		
		input.close();
	}
}
