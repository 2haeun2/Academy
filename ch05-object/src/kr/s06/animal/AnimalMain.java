package kr.s06.animal;

public class AnimalMain {
	public static void main(String[] args) {
		//기본 생성자를 이용해서 객체 생성
		Animal a1 = new Animal();
		//기본 정보 셋팅
		a1.setName("기린");
		a1.setAge(10);
		a1.setFly(false);
		//정보 출력
		System.out.println("이름 : " + a1.getName());
		System.out.println("나이 : " + a1.getAge());
		System.out.println("비행 여부 : " + printFly(a1.isFly()));
		System.out.println("-----------------------");
		
		//생성자로 데이터 셋팅
		Animal a2 = new Animal("기러기",3,true);
		//정보 출력
		System.out.println("이름 : " + a2.getName());
		System.out.println("나이 : " + a2.getAge());
		System.out.println("비행 여부 : " + printFly(a2.isFly()));
	}
	
	private static String printFly(boolean fly) {
		return fly ? "가능" : "불가능";
	}
	
}




