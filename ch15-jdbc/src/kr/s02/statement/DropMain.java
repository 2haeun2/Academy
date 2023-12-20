package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		String sql = null;
		
		try {
		    //1�ܰ�
			Class.forName(db_driver);
			//2�ܰ�
			conn=DriverManager.getConnection(db_url, db_id, db_password);
			//3�ܰ�
			stmt = conn.createStatement();
			//SQL�� �ۼ�
			sql = "DROP TABLE test1";
			//4�ܰ�
			stmt.executeUpdate(sql);
			System.out.println("���̺��� ���������� �����Ǿ����ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {stmt.close();}catch(SQLException e) {}
		}
	}

}
