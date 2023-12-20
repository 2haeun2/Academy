class Car{
	//멤버 변수
	String company = "현대자동차";
	String model = "아이오닉5";
	String color = "은색";
	int maxSpeed = 350;
	int speed;
}
public class CarMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car myCar = new Car();
		//객체의 멤버 변수에 저장된 데이터 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		System.out.println("-----------------------");
		//멤버 변수의 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}





