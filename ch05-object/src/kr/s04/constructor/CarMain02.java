package kr.s04.constructor;

class Car2{
	String color;//����
	String gearType;//���ӱ� ����
	int door;//���� ����

	//������ �����ε�
	public Car2() {}

	public Car2(String c, String g) {
		//���๮
		color = c;
		gearType = g;
		door = 4;
	}

	public Car2(String c, String g, int d) {
		//���๮
		color = c;
		gearType = g;
		door = d;
	}

}

public class CarMain02 {
	public static void main(String[] args) {
		//Car2 c1 = new Car2();

		Car2 c2 = new Car2("blue","auto");
		System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);
		System.out.println("-----------");

		Car2 c3 = new Car2("black","auto",2);
		System.out.println(c3.color + ", " + c3.gearType + ", " + c3.door);


	}
}




