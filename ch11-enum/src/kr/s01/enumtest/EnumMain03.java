package kr.s01.enumtest;

enum Item{
	ADD,DEL,SEARCH,CANCEL
}

public class EnumMain03 {
	public static void main(String[] args) {
		//values() 메서드는 열거 타입의 모든 열거 객체들을 배열로 만들어 반환
		Item[] items = Item.values();
		System.out.println("items.length : " + items.length);
		
		//확장for문을 이용한 출력
		for(Item n : items) {
			System.out.println(n.ordinal());
		}
		
	}
}




