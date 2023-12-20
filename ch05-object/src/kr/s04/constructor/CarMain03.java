package kr.s04.constructor;

public class CarMain03 {
	
	//생성자 오버로딩
	public CarMain03(int n) {
		//생성자내에서 또 다른 생성자를 호출할 때는 생성자명을 쓸 수 없고
		//this라고 표시해야 함
		this(String.valueOf(n)); //int -> String
	}
	public CarMain03(float n) {
		//생성자내에서 또 다른 생성자를 호출하기 전에 수행문을 배치하면 오류 발생
		//System.out.println("float 데이터 변환");
		this(String.valueOf(n)); //float -> String
		System.out.println("float 데이터 변환");
	}
	public CarMain03(String s) {
		System.out.println(s + "의 길이 : " + s.length());
	}
	
	public static void main(String[] args) {
		CarMain03 cm1 = new CarMain03(2000);
		CarMain03 cm2 = new CarMain03(3.141592f);
		CarMain03 cm3 = new CarMain03("World");
	}
}


