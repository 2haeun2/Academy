package kr.s01.enumtest;

enum Item2{
	ADD(5), DEL(11), SEARCH(2), CANCEL(22);
	
	//위에 지정한 상수 값들을 저장하기 위한 공간
	private final int var;
	
	//생성자
	Item2(int v) {
		var = v;
	}
	
	public int getVar() {
		return var;
	}
}

public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Item2.ADD);
		System.out.println(Item2.DEL);
		System.out.println(Item2.SEARCH);
		System.out.println(Item2.CANCEL);
		System.out.println("---------------");
		
		for(Item2 n : Item2.values()) {
			System.out.println(n + " : " + n.getVar());
		}
		
	}
}




