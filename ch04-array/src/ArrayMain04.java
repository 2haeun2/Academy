public class ArrayMain04 {
	public static void main(String[] args) {
		//배열 선언 및 생성, 초기화
		int[] array = {10,20,30,40,50};
		
		//반복문을 이용한 요소의 출력
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:" + array[i]);
		}
		System.out.println("==============");
		
		//개선된 루프(확장 for문)
		//num : 배열의 요소(저장된 데이터)를 읽어와서 저장한 변수             
		//array: 배열명 
		for(int num : array) {
			System.out.print(num + "\t");
		}
	}
}





