public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("=====증감연산자=====");
		//증가연산자
		int i = 5;
		System.out.println(++i);//6, 1를 먼저 증가시키고 증가된 데이터를 읽어옴
		System.out.println(i++);//6, 데이터를 먼저 읽어오고 1를 나중에 증가시킴
		System.out.println(i);
		System.out.println("---------------");
		
		//감소연산자
		int j = 10;
		System.out.println(--j);//9, 1를 먼저 감소시키고 감소된 데이터를 읽어옴
		System.out.println(j--);//9, 데이터를 먼저 읽어오고 1를 나중에 감소시킴
		System.out.println(j);
	}
}






