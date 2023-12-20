public class DoWhileMain {
	public static void main(String[] args) {
		String str = "Hello World";
		int su = 0;
		
		while(su++ < 5) {
			System.out.println(str);
		}
		System.out.println("-------------");
		
		int su2 = 0;
		do {
			System.out.println(str);
		}while(su2++ < 5);
	}
}



