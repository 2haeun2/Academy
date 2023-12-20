package kr.s03.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertMain {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			//JDBC ����1,2�ܰ�
			conn = DBUtil.getConnection();

			//SQL�� �ۼ�
			sql = "INSERT INTO test1 VALUES(?,?)";

			//JDBC ����3�ܰ� : PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//?�� �����͸� ���ε�
			pstmt.setString(1, "star");//1�� ?�� ������ ����
			pstmt.setInt(2, 50);//2�� ?�� ������ ����

			//JDBC ����4�ܰ� : SQL���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count + "�� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
