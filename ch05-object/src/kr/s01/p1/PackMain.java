package kr.s01.p1;

//호출하고자 하는 클래스의 패키지 등록
import kr.s01.p2.PackTwo;

public class PackMain {
	public static void main(String[] args) {
		//kr.s01.p1.PackOne p1 = new kr.s01.p1.PackOne();
		//같은 패키지에 있는 클래스에서 호출하기 때문에 패키지 생략 가능
		PackOne p1 = new PackOne();
		p1.study();
		
		kr.s01.p2.PackTwo p2 = new kr.s01.p2.PackTwo();
		p2.play();
		
		//호출하고자 하는 클래스의 패키지를 등록했기 때문에 클래스명만 명시
		PackTwo p3 = new PackTwo();
		p3.play();
		
	}
}



