public class OperatorMain03 {
	public static void main(String[] args) {
		int korean = 90;
		int english = 95;
		int math = 88;
		
		//ÃÑÁ¡±¸ÇÏ±â
		int sum = korean + english + math;
		//Æò±Õ±¸ÇÏ±â
		int avg = sum / 3;
		
		System.out.printf("±¹¾î : %dÁ¡\n",korean);
		System.out.printf("¿µ¾î : %dÁ¡\n", english);
		System.out.printf("¼öÇÐ : %dÁ¡\n", math);
		System.out.printf("ÃÑÁ¡ : %dÁ¡\n", sum);
		System.out.printf("Æò±Õ : %dÁ¡", avg);
		
	}
}



