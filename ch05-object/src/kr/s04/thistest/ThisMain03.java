package kr.s04.thistest;

public class ThisMain03 {
	//은닉화
	//멤버변수
	private String name;
	private String job;
	private int age;
	private int phone;
	private String address;
	private String hobby;
	private int level;
	
	//캡슐화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//멤버변수명과 지역변수명을 동일하게 지정했기 때문에
		//메서드내에서 this를 이용해서 멤버변수와 지역변수를 구분
		//멤버변수 = 지역변수
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	

}
