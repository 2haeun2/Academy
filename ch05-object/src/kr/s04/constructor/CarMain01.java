package kr.s04.constructor;

class Car{
	String color; //색상
	String gearType; //변속기 종류
	int door; //문의 갯수
	
	//생성자, 기본 생성자는 생략 가능
	//단 한 번만 호출
	//멤버변수 초기화
	public Car() {}
}

public class CarMain01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("c1.color : " + c1.color);
		System.out.println("c1.gearType : " + c1.gearType);
		System.out.println("c1.door : " + c1.door);
		System.out.println("---------------");
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		System.out.println(c1.color + ", " + c1.gearType + ", " + c1.door);
		
		//새롭게 객체를 생성함
		Car c2 = new Car();
		c2.color = "red";
		c2.gearType = "manual";
		c2.door = 5;
		
		System.out.println(c2.color + ", " + c2.gearType + "," + c2.door);
	}
}




