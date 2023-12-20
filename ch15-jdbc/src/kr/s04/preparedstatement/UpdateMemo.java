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
			System.out.println("�޸� ������ �����մϴ�.");
			System.out.print("�޸� ��ȣ>");
			int num = Integer.parseInt(br.readLine());
			System.out.print("����>");
			String title = br.readLine();
			System.out.print("�̸�>");
			String name = br.readLine();
			System.out.print("�޸�>");
			String memo = br.readLine();
			System.out.print("�̸���>");
			String email = br.readLine();
			
			//JDBC 1,2�ܰ�
			conn=DBUtil.getConnection();
			
			//SQL�� 
			sql="UPDATE test2 SET title = ?, name= ?, memo= ?, email= ? WHERE num =?";
			     //����  ���̺��    ���� ���� �� �͵�                        ,����
			
			//3�ܰ� : preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//4�ܰ� : SQL���� �����ؼ� ���̺� ���̺��� ������ ����
			pstmt.setString(1, title);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			pstmt.setString(4, email);
			pstmt.setInt(5, num);
			
			int count = pstmt.executeUpdate();
			System.out.println(count+" ���� ���� �����Ǿ����ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			DBUtil.executeClose(null, pstmt, conn);
			if(br!=null)try {br.close();}catch(Exception e) {}
		}
	}

}
