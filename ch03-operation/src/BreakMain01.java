public class BreakMain01 {
	public static void main(String[] args) {
		int n = 1;
		while(n<=10) {
			System.out.println(n);
			n++;
			if(n == 8)
				break;//while문을 빠져나감
		}
	}
}
