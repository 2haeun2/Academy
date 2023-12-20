public class OperatorMain06 {
	public static void main(String[] args) {
		//증감연산자, 비교연산자, 논리연산자
		int a, b;
		a = b = 10;
		
		boolean c = a++ >= ++b && ++a > b++;
		         // 10     11
		         //    false
		System.out.println(a + ", " + b);//11,11
		System.out.println("c = " + c);//false
		
		System.out.println("--------------");
		
		int d, e;
		d = e = 10;
		
		boolean f = ++d > e++ || d++ >= ++e;
		           //11   10 
		           //true
		System.out.println(d + ", " + e);//11,11
		System.out.println("f = " + f);//true
		
	}
}



