package kr.s01.a;

class Worker{
	/*
	 * [�ǽ�]
	 * Worker
	 * 1)������� : ���� �̸�(name),�޿�(money),���� �ܰ�(balance)
	 * 2)����޼��� : work(�����ϸ� money�� 1000�� ����),
	 *             deposite(�����ϸ� money�� ���� balance ������Ű��
	 *             money�� 0���� ó��)
	 * MethodMain04
	 * 1)Worker ��ü ����
	 * 2)������ �̸� ����
	 * 3)10�� ���ϴµ� �� ���� 3000���� ���� ���¿� ����
	 * 4)���� �̸�, ���� ���¿� �Աݵ��� �ʰ� ���� �ִ� �޿�(money),
	 *   ���� �ܰ�(balance)�� ���            
	 */
	String name;
	int money;
	int balance;
	
	//���ϴ� �޼���
	public void work() {
		money += 1000;
	}
	//�����ϴ� �޼���
	public void deposite() {
		balance += money;
		money = 0;
	}
}
public class MethodMain04 {
	public static void main(String[] args) {
		//��ü ���� �� ����
		Worker worker = new Worker();
		worker.name = "ȫ�浿";
		
		//10�� ���ϴµ� �� ���� 3000���� ������ ����
		for(int i=1;i<=10;i++) {
			worker.work();//�޼��� ȣ��
			if(worker.money>=3000) {//3000�� �϶����� ���� worker.money%3000==0
				worker.deposite();
			}
		}
		
		System.out.println("������ �̸� : " + worker.name);
		System.out.printf("���� �Աݵ��� ���� �޿� : %,d��%n", worker.money);
		System.out.printf("������ �ܰ� : %,d��", worker.balance);		
	}
}




