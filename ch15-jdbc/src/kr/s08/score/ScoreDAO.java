package kr.s08.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/*
 * DAO: Data Access Object
 *      데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체
 */

public class ScoreDAO {
	//성적입력
	public void insertInfo(ScoreVO score) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			
			//SQL
			sql="INSERT INTO score(num,name,korean,english,math,sum,"
					+ "avg,grade,reg_date) "
					+ "VALUES (score_seq.nextval,"
					+ "?,?,?,?,?,?,?,SYSDATE)";
			//3
			pstmt = conn.prepareStatement(sql);
			//?
			pstmt.setString(1, score.getName());
			pstmt.setInt(2, score.getKorean());
			pstmt.setInt(3, score.getEnglish());
			pstmt.setInt(4, score.getMath());
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.getAvg());
			pstmt.setString(7, score.makeGrade());
			
			//4
			int count = pstmt.executeUpdate();
			System.out.println(count+ "개 행을 추가했습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null,pstmt, conn);
		}
		
	}
	//목록보기
	public void selectListInfo() {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			
			//SQL문 작성
			sql = "SELECT * FROM score ORDER BY num DESC";
			
			//3단계:preparedStatement 객체
			pstmt = conn.prepareStatement(sql);
			
			//4단계:SQL문을 실행해서 테이블로부터 결과집합을 얻고
			//     ResultSet에 담아서 반환
			rs= pstmt.executeQuery();
			
			System.out.println("총자료수:"+getCountInfo());
			System.out.println("=================================================");
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
			System.out.println("=================================================");
			
			while(rs.next()) {
				System.out.print(rs.getInt("num")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("korean")+"\t");
				System.out.print(rs.getInt("english")+"\t");
				System.out.println(rs.getInt("sum")+"\t");
				System.out.println(rs.getInt("avg")+"\t");
				System.out.println(rs.getString("grade"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(rs,pstmt, conn);
		}
		
	}
		
	//레코드 총갯수
	public int getCountInfo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			conn = DBUtil.getConnection();
			
			sql="SELECT COUNT(*) FROM score";
			
			pstmt = conn.prepareStatement(sql);
			
			rs= pstmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			DBUtil.executeClose(rs, pstmt,conn);
		}
		
		return count;
	}
	//성적 상세 보기
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
	
		try {
			//1,2단계
			conn=DBUtil.getConnection();
			
			//sql문 작성
			sql="SELECT COUNT(*) FROM score";
			
			//3단계:preparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//4단계:SQL문을 실행해서 테이블로 부터 한 개의 레코드를 얻고
			//     Resultset에 담아서 반환
		rs= pstmt.executeQuery();
	
		if(rs.next()) {
			System.out.println("번호:"+rs.getInt("num"));
			System.out.println("이름:"+rs.getString("name"));
			System.out.println("국어:"+rs.getInt("korean"));
			System.out.println("영어:"+rs.getInt("english"));
			System.out.println("수학:"+rs.getInt("math"));
			System.out.println("총점:"+rs.getInt("sum"));
			System.out.println("평균:"+rs.getInt("avg"));
			System.out.println("등급:"+rs.getString("grade"));
			System.out.println("입력일:"+rs.getString("red_date"));
		}else {
			System.out.println("검색된 내용이 없습니다.");
		}
	}catch(Exception e) {
		e.printStackTrace();
		
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
		
	}
	//성적 수정
	public void updateInfo(ScoreVO score) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//1,2
			conn = DBUtil.getConnection();
			
			//sql(name,korsan,english,math,sum,avg,grade)
			sql = "UPDATE score SET name=?,korean=?,english=?,math=?,sum=?,avg=?,grade=? "
					+ "WHERE num=?";
			//3: preparedStatement
			pstmt=conn.prepareStatement(sql);
			
			//? 데이터 바인딩
			pstmt.setString(1, score.getName());
			pstmt.setInt(2, score.getKorean());
			pstmt.setInt(3, score.getEnglish());
			pstmt.setInt(4, score.getMath());
			pstmt.setInt(5, score.makeSum());
			pstmt.setInt(6, score.makeAvg());
			pstmt.setString(7, score.makeGrade());
			pstmt.setInt(8, score.getNum());
			
			//4
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행의 정보를 수정했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//성적 삭제
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM score WHERE num=?";
			//JDBC 수행 3단계 : PreparedStatement 객체
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4단계 : SQL문을 실행해서 테이블의 행을 삭제
			int count = pstmt.executeUpdate();
			System.out.println(count + "개 행을 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}