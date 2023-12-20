package kr.s02.method;

import java.util.Scanner;

/*
 * [실습]
 * Account
 * 1)멤버변수 : 계좌번호(account_num), 예금주(name),잔고(balance)
 * 2)멤버메서드 : 1.예금하기(deposite) : balance 값 누적
 *              예금 처리 후 입금이 완료되었습니다. 문구 출력
 *             2. 출금하기(withdraw) : balance 값 차감
 *             출금 처리 후 출금이 완료되었습니다. 문구 출력
 *             3. 계좌정보(printAccount) : 계좌번호, 예금주, 잔고 출력  
 * MethodMain04
 * 1)Account 생성
 * 2)계좌 기본 정보 입력 : 계좌번호, 예금주, 잔고
 * 3)계좌 정보 출력
 * 4)입금하기
 * 5)계좌 정보 출력
 * 6)출금하기
 * 7)계좌 정보 출력  
 */

class Account{
	//멤버변수
	String account_num;//계좌번호
	String name;//예금주
	int balance;//잔고
	
	//멤버메서드
	//예금하기
	public void deposite(int money) {
		//누적
		balance += money;
		System.out.println("입금이 완료되었습니다.");
	}
	//출금하기
	public void withdraw(int money) {
		//차감
		balance -= money;
		System.out.println("출금이 완료되었습니다.");
	}
	//계좌정보
	public void printAccount() {
		System.out.println("계좌번호:" + account_num);
		System.out.println("예금주 :" + name);
		System.out.printf("잔고 : %,d%n", balance);
	}
}

public class MethodMain04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//계좌 생성
		Account account = new Account();
		//계좌 기본 정보 입력
		System.out.print("계좌번호:");
		account.account_num = input.nextLine();
		System.out.print("예금주:");
		account.name = input.nextLine();
		System.out.print("잔고:");
		account.balance = input.nextInt();
		
		/*
		//계좌정보 출력
		account.printAccount();
		
		//입금
		System.out.print("입금액:");
		account.deposite(input.nextInt());
		
		//계좌정보 출력
		account.printAccount();
		
		//출금
		System.out.print("출금액:");
		account.withdraw(input.nextInt());
		
		//계좌정보 출력
		account.printAccount();
		*/
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			
			System.out.print("메뉴 선택>");
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("예금액>");
				account.deposite(input.nextInt());
			}else if(num == 2) {
				System.out.print("출금액>");
				account.withdraw(input.nextInt());
			}else if(num == 3) {
				account.printAccount();
			}else if(num == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		input.close();
	}
}




