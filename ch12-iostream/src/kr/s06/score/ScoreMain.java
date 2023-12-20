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
				System.out.print("1.성적입력,2.성적출력,3.파일생성,4.파일읽기,5.종료>");
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
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다!!");
					}
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력 가능!!");
				}
			}
		}
		
		public void input()throws IOException{
			Score s = new Score();
			System.out.print("이름 입력:");
			s.setName(br.readLine());
			
			//s.setKorean(parseInputData("국어 입력:"));
		//	s.setEnglish(parseInputData("영어 입력:"));
		//	s.setMath(parseInputData("수학 입력:"));
			
			list.add(s);
		}
	
		public void output() {
			System.out.println("=================================");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
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

