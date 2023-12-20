package kr.s07.note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoteMain {
	private BufferedReader br;
	private NoteDAO note;
	
	public NoteMain() {
		note = new NoteDAO ();
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	//�޴�
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.�۾���,2.��Ϻ���,3.�󼼱ۺ���,4.�ۼ���,5.�ۻ���,6.����>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					//�۾���
					System.out.print("�̸�:");
					String name = br.readLine();
					
					System.out.print("��й�ȣ:");
					String passwd = br.readLine();
					
					System.out.print("����:");
					String subject = br.readLine();
					
					System.out.print("����:");
					String content = br.readLine();
					
					System.out.println("�̸���:");
					String email = br.readLine();
					
					//NoteDAO�� insertInfo()�޼��带 ȣ���ؼ�
					//�����͸� ����
					
					note.insertInfo(name, passwd, subject, content, email);
					
				}else if (no==2) {
					//��Ϻ���
					note.selectListInfo();
					
				}else if (no==3) {
					//�۹�ȣ Ȯ�ο� ��Ϻ���
					note.selectListInfo();
					System.out.println("--------------------------------------");
					System.out.println("�������� Ȯ���ϱ� ���ؼ� ��ȣ�� �����ϼ���.");
					System.out.print("��ȣ>");
					
					int num = Integer.parseInt(br.readLine());
					
					note.selectDetailInfo(num);
					
				}else if (no==4) {
					//�۹�ȣ Ȯ�ο� ��Ϻ���
					note.selectListInfo();
					System.out.println("======================================");
					System.out.println("���� �����ϱ� ���ؼ� �۹�ȣ�� ������ �Է��ϼ���.");
					System.out.print("������ �۹�ȣ:");
					int num = Integer.parseInt(br.readLine());
					
					System.out.print("�̸�:");
					String name = br.readLine();
					
					System.out.print("��й�ȣ:");
					String passwd = br.readLine();
					
					System.out.print("����:");
					String subject = br.readLine();
					
					System.out.print("����:");
					String content = br.readLine();
					
					System.out.println("�̸���:");
					String email = br.readLine();
					
					note.updateInfo(num, name, passwd, subject, content, email);
				
				}else if (no==5) {
					//�۹�ȣ ��ȸ�� ��Ϻ���
					note.selectListInfo();
					System.out.println("=======================================");
					System.out.println("�ۻ����� ���ؼ� �۹�ȣ�� �Է��ϼ���!");
					
					System.out.print("������ �۹�ȣ");
					int num = Integer.parseInt(br.readLine());
					
					note.deleteInfo(num);
					//������ ���������� ����Ǿ����� Ȯ���ϱ� ���� ��� ȣ��
					
				}else if (no==6) {
					//����
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�!!");
				}
			}catch(NumberFormatException e) {
				System.out.println("���ڸ� �Է� ����!!");
			}
		}
		
	}
	public static void main(String[] args) {
		new NoteMain();
		
	}

}
