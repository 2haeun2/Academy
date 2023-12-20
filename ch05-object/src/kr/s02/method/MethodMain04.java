package kr.s02.method;

import java.util.Scanner;

/*
 * [�ǽ�]
 * Account
 * 1)������� : ���¹�ȣ(account_num), ������(name),�ܰ�(balance)
 * 2)����޼��� : 1.�����ϱ�(deposite) : balance �� ����
 *              ���� ó�� �� �Ա��� �Ϸ�Ǿ����ϴ�. ���� ���
 *             2. ����ϱ�(withdraw) : balance �� ����
 *             ��� ó�� �� ����� �Ϸ�Ǿ����ϴ�. ���� ���
 *             3. ��������(printAccount) : ���¹�ȣ, ������, �ܰ� ���  
 * MethodMain04
 * 1)Account ����
 * 2)���� �⺻ ���� �Է� : ���¹�ȣ, ������, �ܰ�
 * 3)���� ���� ���
 * 4)�Ա��ϱ�
 * 5)���� ���� ���
 * 6)����ϱ�
 * 7)���� ���� ���  
 */

class Account{
	//�������
	String account_num;//���¹�ȣ
	String name;//������
	int balance;//�ܰ�
	
	//����޼���
	//�����ϱ�
	public void deposite(int money) {
		//����
		balance += money;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");
	}
	//����ϱ�
	public void withdraw(int money) {
		//����
		balance -= money;
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
	//��������
	public void printAccount() {
		System.out.println("���¹�ȣ:" + account_num);
		System.out.println("������ :" + name);
		System.out.printf("�ܰ� : %,d%n", balance);
	}
}

public class MethodMain04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//���� ����
		Account account = new Account();
		//���� �⺻ ���� �Է�
		System.out.print("���¹�ȣ:");
		account.account_num = input.nextLine();
		System.out.print("������:");
		account.name = input.nextLine();
		System.out.print("�ܰ�:");
		account.balance = input.nextInt();
		
		/*
		//�������� ���
		account.printAccount();
		
		//�Ա�
		System.out.print("�Աݾ�:");
		account.deposite(input.nextInt());
		
		//�������� ���
		account.printAccount();
		
		//���
		System.out.print("��ݾ�:");
		account.withdraw(input.nextInt());
		
		//�������� ���
		account.printAccount();
		*/
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("-----------------------");
			
			System.out.print("�޴� ����>");
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("���ݾ�>");
				account.deposite(input.nextInt());
			}else if(num == 2) {
				System.out.print("��ݾ�>");
				account.withdraw(input.nextInt());
			}else if(num == 3) {
				account.printAccount();
			}else if(num == 4) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸� �Է��߽��ϴ�.");
			}
		}
		input.close();
	}
}




