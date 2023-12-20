public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(포맷문자,데이터)를 이용한 출력(데이터의 종류를
		//표시할 수 있는 포맷 문자 지원)
		
		//문자             포맷문자,데이터  
		System.out.printf("%c%n", 'A');
		System.out.printf("%6c%n", 'B');//6자리 확보 오른쪽에 정렬
		System.out.printf("%-6c%n", 'C');//6자리 확보 왼쪽에 정렬
		
		System.out.println("===========");
		
		//정수
		System.out.printf("%d%n", 67);
		System.out.printf("%,d원%n", 10000);//3자리 단위로 쉼표 표시
		System.out.printf("%5d%n",20);//5자리를 잡고 오른쪽부터 표시
		System.out.printf("%-5d%n", 20);//5자리를 잡고 왼쪽부터 표시
		
		System.out.println("===========");
		
		//실수
		System.out.printf("%f%n", 35.896);
		System.out.printf("%.2f%n", 35.896);//소숫점 둘째자리까지 출력
		System.out.printf("%10.2f%n", 35.896);//10자리를 잡고 오른쪽부터 표시, 
		                                      //소숫점 둘째자리까지 출력
		
		System.out.println("==========");
		
		//문자열
		System.out.printf("%s%n","우주");
		
		System.out.printf("%s는 %d점입니다.\n","점수",98);
		
		//논리값
		System.out.printf("%b", true);
		
	}
}








