class Car{
	//��� ����
	String company = "�����ڵ���";
	String model = "���̿���5";
	String color = "����";
	int maxSpeed = 350;
	int speed;
}
public class CarMain {
	public static void main(String[] args) {
		//��ü ���� �� ����
		Car myCar = new Car();
		//��ü�� ��� ������ ����� ������ �б�
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		System.out.println("-----------------------");
		//��� ������ �� ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}
}





