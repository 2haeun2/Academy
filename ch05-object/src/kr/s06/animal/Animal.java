package kr.s06.animal;

public class Animal {
	//멤버변수
	private String name; //이름
	private int age; //나이
	private boolean fly; //비행 여부
	
	public Animal() {}
	
	public Animal(String name, int age, boolean fly) {
		//멤버변수 = 지역변수
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
