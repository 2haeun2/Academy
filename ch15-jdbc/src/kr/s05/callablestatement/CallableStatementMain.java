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
			//1,2�ܰ�
			conn = DBUtil.getConnection();
			
			//���ν��� ȣ�� ����
			sql = "{call adjust(?,?)}";
			
			//3�ܰ� : CallableStatement ��ü ���� 
			cstmt = conn.prepareCall(sql);
			
			//?�� ������ ���ε�
			cstmt.setString(1, "SUNNY");
			cstmt.setFloat(2,0.06f);
			
			//4�ܰ� : ���ν��� ����
			cstmt.executeUpdate();
			System.out.println("�޿� ������ �����Ǿ����ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			//�ڿ�����
			DBUtil.executeClose(cstmt, conn);
			
		}
		
	}

}
