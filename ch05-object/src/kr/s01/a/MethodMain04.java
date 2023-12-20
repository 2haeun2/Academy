package kr.s01.a;

class Worker{
	/*
	 * [실습]
	 * Worker
	 * 1)멤버변수 : 직원 이름(name),급여(money),계좌 잔고(balance)
	 * 2)멤버메서드 : work(실행하면 money에 1000원 누적),
	 *             deposite(실행하면 money의 돈을 balance 누적시키고
	 *             money는 0으로 처리)
	 * MethodMain04
	 * 1)Worker 객체 생성
	 * 2)직원의 이름 지정
	 * 3)10번 일하는데 번 돈이 3000원일 마다 계좌에 저축
	 * 4)직원 이름, 현재 계좌에 입금되지 않고 남아 있는 급여(money),
	 *   계좌 잔고(balance)를 출력            
	 */
	String name;
	int money;
	int balance;
	
	//일하는 메서드
	public void work() {
		money += 1000;
	}
	//저축하는 메서드
	public void deposite() {
		balance += money;
		money = 0;
	}
}
public class MethodMain04 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Worker worker = new Worker();
		worker.name = "홍길동";
		
		//10번 일하는데 번 돈이 3000원일 때마다 저축
		for(int i=1;i<=10;i++) {
			worker.work();//메서드 호출
			if(worker.money>=3000) {//3000원 일때마다 저축 worker.money%3000==0
				worker.deposite();
			}
		}
		
		System.out.println("직원의 이름 : " + worker.name);
		System.out.printf("현재 입금되지 않은 급여 : %,d원%n", worker.money);
		System.out.printf("통장의 잔고 : %,d원", worker.balance);		
	}
}




