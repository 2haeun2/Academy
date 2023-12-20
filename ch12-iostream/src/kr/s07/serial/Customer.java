package kr.s07.serial;

import java.io.Serializable;
/*
 * Serializable �������̽��� �����ϸ� �ش� Ŭ������ ��ü ����ȭ ����� �Ǿ� 
 * �������� ��ü ����ȭ�� ������ �� ����.
 * Serializable �� �������� ������ ��ü ����ȭ �Ұ��� 
 */

public class Customer implements Serializable{
	private String name;

	public Customer(String name){
		this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
