package kr.s04.preparedstatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

public class SelectDetailMemo {
	public static void main(String[] args) {
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("메모 상세페이지를 조회합니다.");
			System.out.print("메모 번호>");
			int num = Integer.parseInt(br.readLine());
			
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM test2 WHERE num = ?";
			
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//?에 데이터 바인딩
			pstmt.setInt(1, num);

			//JDBC 수행 4단계 : SQL문을 실행해서 테이블로부터 한 개의 레코드를 얻어
			//                ResultSet에 담아서 반환
			rs = pstmt.executeQuery();
			if(rs.next()) { //if문을 쓴 이유 -> 행이 있거나 없거나 결과가 2개의 선택지 밖에 없어서/while문은 여러개 반복할때 쓰는게 더 유리(목록)
				            //셀렉트 딜렉트 업데이트->executeUpdate
				System.out.println("번호 :"+rs.getInt("num"));
				System.out.println("제목 :"+rs.getString("title"));
				System.out.println("작성자 :"+rs.getString("name"));
				System.out.println("내용 : "+rs.getString("memo"));
				System.out.println("이메일 : "+rs.getString("email"));
				System.out.println("작성일 : "+rs.getString("reg_date"));
				
			}else {
				System.out.println("검색한 데이터가 없습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
		}
	}
}








