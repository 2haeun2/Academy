package kr.s04.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.s03.preparedstatement.DBUtil;

public class UpdateMemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("메모 정보를 수정합니다.");
			System.out.print("메모 번호>");
			int num = Integer.parseInt(br.readLine());
			System.out.print("제목>");
			String title = br.readLine();
			System.out.print("이름>");
			String name = br.readLine();
			System.out.print("메모>");
			String memo = br.readLine();
			System.out.print("이메일>");
			String email = br.readLine();
			
			//JDBC 1,2단계
			conn=DBUtil.getConnection();
			
			//SQL문 
			sql="UPDATE test2 SET title = ?, name= ?, memo= ?, email= ? WHERE num =?";
			     //수정  테이블명    수정 가능 한 것들                        ,없음
			
			//3단계 : preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//4단계 : SQL문을 실행해서 테이블에 테이블의 데이터 변경
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count+" 개의 행이 수정되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
		}
	}

}
