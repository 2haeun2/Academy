public class ArrayMain06 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		String[] course = {"±¹¾î","¿µ¾î","¼öÇÐ"};
		int[] score = new int[course.length];//0:±¹¾î,1:¿µ¾î,2:¼öÇÐ
		int sum = 0; //ÃÑÁ¡
		float avg = 0.0f; //Æò±Õ
		
		for(int i=0;i<course.length;i++) {
			do {
				System.out.print(course[i] + "=");
				score[i] = input.nextInt();
			}while(score[i] < 0 || score[i] > 100);
			//ÃÑÁ¡ ±¸ÇÏ±â
			sum += score[i];
		}
		
		//Æò±Õ ±¸ÇÏ±â
		avg = sum / (float)course.length;
		
		System.out.printf("ÃÑÁ¡ : %d%n", sum);
		System.out.printf("Æò±Õ : %.2f", avg);
		
		input.close();
	}
}
