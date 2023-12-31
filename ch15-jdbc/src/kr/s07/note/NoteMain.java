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
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.글쓰기,2.목록보기,3.상세글보기,4.글수정,5.글삭제,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no==1) {
					//글쓰기
					System.out.print("이름:");
					String name = br.readLine();
					
					System.out.print("비밀번호:");
					String passwd = br.readLine();
					
					System.out.print("제목:");
					String subject = br.readLine();
					
					System.out.print("내용:");
					String content = br.readLine();
					
					System.out.println("이메일:");
					String email = br.readLine();
					
					//NoteDAO의 insertInfo()메서드를 호출해서
					//데이터를 전달
					
					note.insertInfo(name, passwd, subject, content, email);
					
				}else if (no==2) {
					//목록보기
					note.selectListInfo();
					
				}else if (no==3) {
					//글번호 확인용 목록보기
					note.selectListInfo();
					System.out.println("--------------------------------------");
					System.out.println("상세정보를 확인하기 위해서 번호를 선택하세요.");
					System.out.print("번호>");
					
					int num = Integer.parseInt(br.readLine());
					
					note.selectDetailInfo(num);
					
				}else if (no==4) {
					//글번호 확인용 목록보기
					note.selectListInfo();
					System.out.println("======================================");
					System.out.println("글을 수정하기 위해서 글번호와 정보를 입력하세요.");
					System.out.print("수정할 글번호:");
					int num = Integer.parseInt(br.readLine());
					
					System.out.print("이름:");
					String name = br.readLine();
					
					System.out.print("비밀번호:");
					String passwd = br.readLine();
					
					System.out.print("제목:");
					String subject = br.readLine();
					
					System.out.print("내용:");
					String content = br.readLine();
					
					System.out.println("이메일:");
					String email = br.readLine();
					
					note.updateInfo(num, name, passwd, subject, content, email);
				
				}else if (no==5) {
					//글번호 조회용 목록보기
					note.selectListInfo();
					System.out.println("=======================================");
					System.out.println("글삭제를 위해서 글번호를 입력하세요!");
					
					System.out.print("삭제할 글번호");
					int num = Integer.parseInt(br.readLine());
					
					note.deleteInfo(num);
					//삭제가 정상적으로 수행되었는지 확인하기 위해 목록 호출
					
				}else if (no==6) {
					//종료
					System.out.println("프로그램을 종료합니다.");
					break;
				}else {
					System.out.println("잘못 입력했습니다!!");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능!!");
			}
		}
		
	}
	public static void main(String[] args) {
		new NoteMain();
		
	}

}
