public class ArrayMain05 {
	public static void main(String[] args) {
		//배열의 선언 및 생성
		String[] array = new String[3];
		//배열의 초기화
		array[0] = "Java";
		array[1] = "JSP";
		array[2] = "Servlet";
		
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("--------------");
		
		//확장 for문을 이용한 배열의 요소 출력
		for(String s : array) {
			System.out.println(s);
		}
	}
}




