import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int n;
		
		do {
			n = input.nextInt();
		}while(n<0);
		
		System.out.printf("%d",n);
		
		input.close();
	}
}
