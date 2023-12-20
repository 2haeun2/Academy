package kr.s02.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1�ܰ� : ����̹� �ε�
			Class.forName(db_driver);
			//JDBC ���� 2�ܰ� : Connection ��ü ���� (ID,��й�ȣ ����)
			conn = DriverManager.getConnection(db_url,db_id,db_password);
			//JDBC ���� 3�ܰ� : Statement ��ü ����
			stmt = conn.createStatement();
			
			//SQL�� �ۼ�
			sql= "SELECT * FROM test1";
			
			//JDBC ���� 4�ܰ� : SQL���� �����ؼ� ���̺�κ��� ���ڵ�(��)�� ���޹޾Ƽ�
			//               ��������� ����� Resultset ��ü�� ��Ƽ� ��ȯ
			rs = stmt.executeQuery(sql);
			
			System.out.println("ID\t����");
			//next() : Result���� ��������� �࿡ ������ �� Ŀ���� ����ϴµ�
			//         Ŀ���� ���������� �̵���Ű�� �������� �����ϸ� true
			while(rs.next()) {
				//�÷����� ���ؼ� �����͸� ��ȯ
				//getString(�÷���) : �÷���� ��Ī�Ǿ��ִ� �����͸� String Ÿ������ ��ȯ
			//System.out.print(rs.getString("id"));
			//System.out.print("\t");
				//getInt(�÷���) : �÷���� ��Ī�Ǿ� �ִ� �����͸� int Ÿ������ ��ȯ
			//System.out.println(rs.getInt("age"));
				
				//�÷� �ε����� ���ؼ� �����͸� ��ȯ 
			System.out.print(rs.getString(1));//id
			System.out.print("\t");
			System.out.println(rs.getInt(2));//age
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//�ڿ�����
			if(rs!=null)try {rs.close();}catch(SQLException e) {}
			if(stmt!=null)try {stmt.close();}catch(SQLException e) {}
			if(conn!=null)try {conn.close();}catch(SQLException e) {}
		}
		
	}

}
