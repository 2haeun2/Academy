package kr.s05.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;

import kr.s03.preparedstatement.DBUtil;

public class CallableStatementMain {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = null;
		
		try {
			//1,2단계
			conn = DBUtil.getConnection();
			
			//프로시저 호출 문장
			sql = "{call adjust(?,?)}";
			
			//3단계 : CallableStatement 객체 생성 
			cstmt = conn.prepareCall(sql);
			
			//?에 데이터 바인딩
			cstmt.setString(1, "SUNNY");
			cstmt.setFloat(2,0.06f);
			
			//4단계 : 프로시저 실행
			cstmt.executeUpdate();
			System.out.println("급여 정보가 수정되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			//자원정리
			DBUtil.executeClose(cstmt, conn);
			
		}
		
	}

}
