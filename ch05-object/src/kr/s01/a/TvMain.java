package kr.s01.a;

class Tv{
	//멤버변수(속성)
	boolean power;//전원상태(on/off)
	int channel;//채널
	
	//멤버메서드(동작)
	public void isPower() {
		power = !power;//Tv가 켜져 있으면 끄고 꺼져있으면 켬
	}
	public void channelUp() {//채널을 높이는 기능
		++channel;
	}
	public void channelDown() {//채널을 낮추는 기능
		--channel;
	}
}

public class TvMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Tv t = new Tv();
		//Tv를 실행
		t.isPower();
		System.out.println("Tv 실행 여부 : " + t.power);
		System.out.println("현재 채널 : " + t.channel);
		System.out.println("--------------");
		//채널 변경
		t.channel = 7;
		System.out.println("첫번째 변경된 채널 : " + t.channel);
		System.out.println("--------------");
		//채널 변경
		t.channelDown();
		System.out.println("두번째 변경된 채널 : " + t.channel);
		System.out.println("--------------");
		//Tv 끄기
		t.isPower();
		System.out.println("Tv 실행 여부 : " + t.power);
	}
}










