
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class one {
	public static void main(String[] args) {
		String db_driver = "oracle.jdbc.OracleDriver";
		String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
		String db_id = "scott";
		String db_password = "tiger";
		
		Connection conn = null;
		Statement stmt= null;
		String sql =null;
		try {
			
			//1
			Class.forName(db_driver);
			//2
			conn=DriverManager.getConnection(db_url, sql, db_password);
			
			System.out.println("test26 ���̺��� �����մϴ�.");
			
			//3
			stmt = conn.createStatement();
			
			//sql
			sql="CREATE TABLE test26(menu varchar2(30),price number)";
			
			//4
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
