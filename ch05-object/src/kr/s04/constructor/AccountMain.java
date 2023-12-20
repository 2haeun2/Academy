package kr.s04.constructor;

public class AccountMain {
	//멤버변수
	String accountNo; //계좌번호
	String ownerName; //예금주 이름
	int balance; //잔고
	
	public AccountMain(String a, String o, int b) {
		accountNo = a;
		ownerName = o;
		balance = b;
		System.out.println("계좌 생성이 완료되었습니다.");
	}
	//입금하기
	public void deposite(int amount) {
		balance += amount;
		System.out.println("입금이 완료되었습니다.");
	}
	//출금하기
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println("출금이 완료되었습니다.");
	}
	//계좌 정보 보기
	public void printAccount() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주 이름 : " + ownerName);
		System.out.printf("잔고 : %,d원%n", balance);
	}
	
	public static void main(String[] args) {
		//계좌 생성
		AccountMain am = new AccountMain("100-123","홍길동",1000);
		//계좌 정보
		am.printAccount();
		
		//입금하기
		am.deposite(1000);
		am.printAccount();
		
		//출금하기
		am.withdraw(500);
		am.printAccount();
		
	}
}


