package kr.s06.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.text.ParseException;

public class ScoreMain {
	
	BufferedReader br;
	ArrayList<Score>list;
	
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			callMenu();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try{br.close();}catch(IOException e) {}
		}
	}
		public void callMenu()throws IOException{
			while(true) {
				System.out.println("------------------------");
				System.out.print("1.�����Է�,2.�������,3.���ϻ���,4.�����б�,5.����>");
				try {
					int num = Integer.parseInt(br.readLine());
					if(num==1) {
						input();
					}else if(num==2) {
						output();
					}else if(num==3) {
						input();
					}else if(num==4) {
						output();
						
					}else if(num==5) {
						System.out.println("���α׷� ����");
						break;
					}else {
						System.out.println("�߸� �Է��߽��ϴ�!!");
					}
				}catch(NumberFormatException e) {
					System.out.println("���ڸ� �Է� ����!!");
				}
			}
		}
		
		public void input()throws IOException{
			Score s = new Score();
			System.out.print("�̸� �Է�:");
			s.setName(br.readLine());
			
			//s.setKorean(parseInputData("���� �Է�:"));
		//	s.setEnglish(parseInputData("���� �Է�:"));
		//	s.setMath(parseInputData("���� �Է�:"));
			
			list.add(s);
		}
	
		public void output() {
			System.out.println("=================================");
			System.out.println("�̸�\t����\t����\t����\t����\t���\t���");
			System.out.println("=================================");
			for(Score s : list) {
				System.out.print(s.getName() + "\t");
				System.out.print(s.getKorean() + "\t");
				System.out.print(s.getEnglish() + "\t");
				System.out.print(s.getMath() + "\t");
				System.out.print(s.makeSum() + "\t");
				System.out.printf("%.2f\t", s.makeAvg());
				System.out.print(s.makeGrade() + "\n");
			}
		}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new ScoreMain();
	}
		
	}

