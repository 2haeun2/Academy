package kr.s08.score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreMain {
	private BufferedReader br;
	private ScoreDAO dao;
	
	public ScoreMain() {
		dao=new ScoreDAO();
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	public void callMenu()throws IOException{
		while(true) {
			System.out.print("1.성적입력,2.목록보기,3.상세정보,4.수정,5.삭제,6.종료:");
		     try{
		    	 int no = Integer.parseInt(br.readLine());
		    	 if(no==1) {//성적입력
		    		 System.out.print("이름:");
		    		 String name = br.readLine();
		    		 int korean = parseInputData("국어:");
		    		 int english = parseInputData("영어:");
		    		 int math= parseInputData("수학:");
		    		 
		    		 //Score 객체 생성
		    		 ScoreVO score = new ScoreVO();
		    		 score.setName(name);
		    		 score.setKorean(korean);
		    		 score.setEnglish(english);
		    		 score.setMath(math);
		    		 
		    		 dao.insertInfo(score);
		    		 
		    		 
		    	 }else if(no==2) {//목록보기
		    		 dao.selectListInfo();
		    		 
		    	 }else if(no==3) {//상세보기
		    		 
		    		 dao.selectListInfo();
		    		 System.out.println("-----------------------------");
		    		 System.out.print("번호 :");
		    		 
		    		 int num = Integer.parseInt(br.readLine());
		    		 
		    		 dao.selectDetailInfo(num);
		    		 
		    	 }else if(no==4) {//수정
		    		//번호 확인용 목록보기
						dao.selectListInfo();
						System.out.println("----------------------------");
						System.out.print("번호:");
						int num = Integer.parseInt(br.readLine());
						System.out.print("이름:");
						String name = br.readLine();
						int korean = parseInputData("국어:");
						int english = parseInputData("영어:");
						int math = parseInputData("수학:");
						
						ScoreVO score = new ScoreVO();
						score.setNum(num);
						score.setName(name);
						score.setKorean(korean);
						score.setEnglish(english);
						score.setMath(math);
						
						dao.updateInfo(score);	
		    		 
		    	 }else if(no==5) {//삭제
		    		//번호 확인용 목록보기
						dao.selectListInfo();
						System.out.println("-----------------------");
						System.out.print("삭제할 번호:");
						int num = Integer.parseInt(br.readLine());
						
						dao.deleteInfo(num);
						
						//행 삭제가 정상적으로 수행되었는 확인
						dao.selectListInfo();
		    		 
		    	 }else if(no==6) {
		    		 System.out.println("프로그램 종료");
		    		 break;
		    	 }else {
		    		 System.out.println("잘못입력했습니다.");
		    	 }
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
		
	}
	//성적 범위 체크(0~100)
		public int parseInputData(String cours)throws IOException{
			while(true) {
				System.out.print(cours);
				try {
					int num = Integer.parseInt(br.readLine());
					
					if(num<0 || num>100)
						throw new ScoreValueException("0~100사이의 값만 인정!");
					
					 return num;
				}catch(NumberFormatException e) {
					System.out.println("숫자만 입력가능!");
				}catch(ScoreValueException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		public static void main(String[] args) {
			new ScoreMain();
		}
	}