public class Student {
	
	//필드
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student s;
		//객체 생성
		s = new Student();
		
		//객체의 필드의 기본값이 출력
		System.out.println(s.name + ", " + s.age);
		System.out.println("---------------");
		
		//객체의 필드에 데이터 저장
		s.name = "홍길동";
		s.age = 20;
		
		//객체의 필드에 저장된 데이터 읽기
		System.out.println(s.name + ", " + s.age);
		
	}
}





