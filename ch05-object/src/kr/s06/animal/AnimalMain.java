package kr.s06.animal;

public class AnimalMain {
	public static void main(String[] args) {
		//�⺻ �����ڸ� �̿��ؼ� ��ü ����
		Animal a1 = new Animal();
		//�⺻ ���� ����
		a1.setName("�⸰");
		a1.setAge(10);
		a1.setFly(false);
		//���� ���
		System.out.println("�̸� : " + a1.getName());
		System.out.println("���� : " + a1.getAge());
		System.out.println("���� ���� : " + printFly(a1.isFly()));
		System.out.println("-----------------------");
		
		//�����ڷ� ������ ����
		Animal a2 = new Animal("�ⷯ��",3,true);
		//���� ���
		System.out.println("�̸� : " + a2.getName());
		System.out.println("���� : " + a2.getAge());
		System.out.println("���� ���� : " + printFly(a2.isFly()));
	}
	
	private static String printFly(boolean fly) {
		return fly ? "����" : "�Ұ���";
	}
	
}




