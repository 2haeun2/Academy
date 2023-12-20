package kr.s08.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/*
 * DAO: Data Access Object
 *      �����ͺ��̽��� �����͸� ���������� ȣ���ϰ� �����ϴ� ��ü
 */

public class ScoreDAO {
	//�����Է�
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
			System.out.println(count+ "�� ���� �߰��߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null,pstmt, conn);
		}
		
	}
	//��Ϻ���
	public void selectListInfo() {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//SQL�� �ۼ�
			sql = "SELECT * FROM score ORDER BY num DESC";
			
			//3�ܰ�:preparedStatement ��ü
			pstmt = conn.prepareStatement(sql);
			
			//4�ܰ�:SQL���� �����ؼ� ���̺�κ��� ��������� ���
			//     ResultSet�� ��Ƽ� ��ȯ
			rs= pstmt.executeQuery();
			
			System.out.println("���ڷ��:"+getCountInfo());
			System.out.println("=================================================");
			System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t���");
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
			//�ڿ�����
			DBUtil.executeClose(rs,pstmt, conn);
		}
		
	}
		
	//���ڵ� �Ѱ���
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
	//���� �� ����
	public void selectDetailInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
	
		try {
			//1,2�ܰ�
			conn=DBUtil.getConnection();
			
			//sql�� �ۼ�
			sql="SELECT COUNT(*) FROM score";
			
			//3�ܰ�:preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//4�ܰ�:SQL���� �����ؼ� ���̺�� ���� �� ���� ���ڵ带 ���
			//     Resultset�� ��Ƽ� ��ȯ
		rs= pstmt.executeQuery();
	
		if(rs.next()) {
			System.out.println("��ȣ:"+rs.getInt("num"));
			System.out.println("�̸�:"+rs.getString("name"));
			System.out.println("����:"+rs.getInt("korean"));
			System.out.println("����:"+rs.getInt("english"));
			System.out.println("����:"+rs.getInt("math"));
			System.out.println("����:"+rs.getInt("sum"));
			System.out.println("���:"+rs.getInt("avg"));
			System.out.println("���:"+rs.getString("grade"));
			System.out.println("�Է���:"+rs.getString("red_date"));
		}else {
			System.out.println("�˻��� ������ �����ϴ�.");
		}
	}catch(Exception e) {
		e.printStackTrace();
		
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
		
	}
	//���� ����
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
			
			//? ������ ���ε�
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
			System.out.println(count + "�� ���� ������ �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//���� ����
	public void deleteInfo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2�ܰ�
			conn = DBUtil.getConnection();
			//SQL�� �ۼ�
			sql = "DELETE FROM score WHERE num=?";
			//JDBC ���� 3�ܰ� : PreparedStatement ��ü
			pstmt = conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1, num);
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺��� ���� ����
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}