package kr.s01.thread;

public class ThreadMain01 extends Thread{

	public ThreadMain01(String threadname) {
		super(threadname);
	}

	//Thread의 run 메서드 재정의
	@Override
	public void run() {
		//현재 수행되는 스레드 객체를 반환
		Thread t = currentThread();
		System.out.println("실행 스레드 : " + t);

		for(int i=0;i<10;i++) {
			try {
				//밀리세컨드
				sleep(1000);//지정된 시간만큼 수행을 멈춤
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//getName() : 스레드의 이름 반환
			System.out.printf(
					"스레드 이름 : %s ,",currentThread().getName());
			System.out.printf("temp value : %d%n", i);
		}

	}

	public static void main(String[] args) {
		ThreadMain01 tm = new ThreadMain01("첫번째");
		tm.start();//start메서드를 실행하면 run 메서드 실행
	}
}
