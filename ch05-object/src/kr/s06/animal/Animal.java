package kr.s06.animal;

public class Animal {
	//�������
	private String name; //�̸�
	private int age; //����
	private boolean fly; //���� ����
	
	public Animal() {}
	
	public Animal(String name, int age, boolean fly) {
		//������� = ��������
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
}
