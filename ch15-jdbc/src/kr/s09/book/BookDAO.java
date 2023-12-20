package kr.s09.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.s03.preparedstatement.DBUtil;

/*
 * DAO: Data Access Object
 *      �����ͺ��̽��� �����͸� ���������� ȣ���ϰ� �����ϴ� ��ü
 */
public class BookDAO {
	//�������
	public void insertBook(BookVO book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 1,2
			conn = DBUtil.getConnection();
			
			//sql�� �ۼ�
			sql="INSERT INTO book(bk_num,bk_name,bk_category)"
					+ "VALUES(book_seq.nextval,?,?)";
			
			//3 : preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			
			//?������ ���ε�
			pstmt.setString(1, book.getBk_name());
			pstmt.setString(2, book.getBk_category());
			
			//4:sql�� ���� �ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count+"�� ���� �߰� �߽��ϴ�.");
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null,pstmt, conn);
			
		}
		
		
		
	}
	
	//���� ��� ����
	public void selectListBook() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC ���� 1,2
			conn = DBUtil.getConnection();
			//sql
			sql="SELECT bk_num,bk_name,bk_category,bk_regdate,re_status "
					+ "FROM book LEFT OUTER JOIN "
					+ "(SELECT * FROM reservation WHERE re_status=1) USING(bk_num) "
					+ "ORDER BY bk_num DESC";
			//3: preparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//4: sql ���� �����ؼ� ���̺�κ��� ��� ������ ��� resultSet ��Ƽ� ��ȯ
			rs= pstmt.executeQuery();
			
			System.out.println("------------------------------------------------");
			System.out.println("��ȣ\t�з�\t\t�����\t���⿩��\t������");
			System.out.println("------------------------------------------------");
			
			while(rs.next()){
				System.out.print(rs.getInt("bk_num")+"\t");
				System.out.print(rs.getString("bk_category")+"\t");
				System.out.print(rs.getDate("bk_regdate")+"\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("���Ⱑ��\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.println(rs.getString("bk_name")+"\t");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt,conn);
			
		}
		
		
		
	}
	//���� ���
	public void insertReservation(ReservationVO reservation) {
		Connection conn =null;
		PreparedStatement pstmt = null;
		String sql =null;
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			//sql
			sql="INSERT INTO reservation (re_num,bk_num,me_num,re_status)"
					+ "VALUES(reservation_seq.nextval,?,?,1)";
			//3: preparedStatement
			pstmt=conn.prepareStatement(sql);
			//?������ ���ε�
			pstmt.setInt(1, reservation.getBk_num());
			pstmt.setInt(2, reservation.getMe_num());
			//4:sql���� �����ؼ� ���̺� ���� �߰�
			int count = pstmt.executeUpdate();
			System.out.println(count+"�� ���� �߰��߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
			
		}
	}
	//���⿩�� Ȯ��
	public int getStatusReservation(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		int count =0;
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			//sql
			sql = "SELECT re_status FROM book "
				+ "LEFT OUTER JOIN (SELECT*FROM reservation WHERE re_status=1)USING(bk_num)"
				+ "WHERE bk_num=?";
			//3
			pstmt=conn.prepareStatement(sql);
			//?
			pstmt.setInt(1,bk_num);
			//4
			rs=pstmt.executeQuery();
			if(rs.next()) {
				                //�÷� �ε���=re_status
				count = rs.getInt(1);//���� ��ȣ�� ���� ��
			}else{
				count=-1;//���� ��ȣ�� ���� ��
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
		
		return count;
	}
	//�ݳ� ���� üũ
	public int getStatusBack(int re_num, int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			//sql
			sql = "SELECT re_status FROM reservation "
					+ "WHERE re_num=?AND me_num=?";
			//3
			pstmt=conn.prepareStatement(sql);
			//?
			pstmt.setInt(1, re_num);//�����ȣ
			pstmt.setInt(2, me_num);//ȸ����ȣ
			//4:sql�� �����ؼ� ���̺�κ��� �ݳ� ���� üũ
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}else {
				count = -1;
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
		
		return count;
	}
	//�ݳ�
	public void updateReservation(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			//sql
			sql = "UPDATE reservation SET re_status=0,"
			    + "re_modifydate=SYSDATE WHERE re_num=?";
			//3
			pstmt=conn.prepareStatement(sql);
			//?
			pstmt.setInt(1, re_num);
			//4
			int count = pstmt.executeUpdate();
			System.out.println(count+"���� ���� �����߽��ϴ�.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt,conn);
		}
		
	}
	//���� ��� ����
	public void selectListReservation() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//1,2
			conn = DBUtil.getConnection();
			//sql
			sql="SELECT re_num,me_id,me_name,bk_name,re_status,"
			   + "re_regdate,re_modifydate FROM reservation "
			   + "JOIN book USING(bk_num) "
			   + "JOIN member USING(me_num)ORDER BY re_num DESC";
			//3
			pstmt = conn.prepareStatement(sql);
			//4:sql���� ���� �ϰ� ���̺�κ��� ��������� �� resultset�� �־� ��ȯ
			rs=pstmt.executeQuery();
			System.out.println("----------------------------------------");

			System.out.println("��ȣ\t���̵�\t������\t���⵵����\t���⿩��\t������\t�ݳ���");
			System.out.println("----------------------------------------");
			while(rs.next()){
				System.out.print(rs.getInt("re_num")+"\t");
				System.out.print(rs.getString("me_id")+"\t");
				System.out.print(rs.getString("me_name")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("�ݳ�\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.print(rs.getDate("re_regdate")+"\t");
				if(rs.getDate("re_modifydate")==null) {
					System.out.println("");
				}else {
					System.out.println(rs.getDate("re_modifydate"));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
	}
	
	//MY���� ��Ϻ���
	public void selectMyList(int me_num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null; 
		
		try {
			//1,2
			conn=DBUtil.getConnection();
			//sql
			sql="SELECT re_num,me_id,me_name,bk_name,re_status,"
					   + "re_regdate,re_modifydate FROM reservation "
					   + "JOIN book USING(bk_num) "
					   + "JOIN member USING(me_num) WHERE me_num=? "
					   + "ORDER BY re_num DESC";
			//3
			pstmt=conn.prepareStatement(sql);
			//?�� ������ ���ε�
			pstmt.setInt(1,me_num);
			//4 sql���� �����ؼ� ���̺�� ���� ��� ������ �� resultset�� ��� ��ȯ
			rs=pstmt.executeQuery();
			System.out.println("----------------------------------------");
			System.out.println("��ȣ\t���̵�\t������\t���⵵����\t���⿩��\t������\t�ݳ���");
			System.out.println("----------------------------------------");
			while(rs.next()){
				System.out.print(rs.getInt("re_num")+"\t");
				System.out.print(rs.getString("me_id")+"\t");
				System.out.print(rs.getString("me_name")+"\t");
				System.out.print(rs.getString("bk_name")+"\t");
				if(rs.getInt("re_status")==0) {
					System.out.print("�ݳ�\t");
				}else {
					System.out.print("���� ��\t");
				}
				System.out.print(rs.getDate("re_regdate")+"\t");
				if(rs.getDate("re_modifydate")==null) {
					System.out.println("");
				}else {
					System.out.println(rs.getDate("re_modifydate"));
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
	}
	
	//ȸ������
	public void insertMember(MemberVO member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//1,2
			conn= DBUtil.getConnection();
			//sql
			sql="INSERT INTO member (me_num,me_id,me_passwd,me_name,me_phone)"
					+ "VALUES (member_seq.nextval,?,?,?,?)";
			//3 : preparedStatement
			pstmt = conn.prepareStatement(sql);
			//?������ ���ε�
			pstmt.setString(1, member.getMe_id());
			pstmt.setString(2, member.getMe_passwd());
			pstmt.setString(3, member.getMe_name());
			pstmt.setString(4, member.getMe_phone());
			//4
			int count = pstmt.executeUpdate();
			System.out.println(count+"�� ���� �߰��߽��ϴ�.");
			
		}catch(Exception e) {
			
		}finally {
			//�ڿ�����
			DBUtil.executeClose(null,pstmt, conn);
		}
	}
	//ȸ�����
	public void selectListMember() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//1,2
			conn = DBUtil.getConnection();
			//sql
			sql = "SELECT * FROM member ORDER BY me_num DESC";
			//3: PreparedStatement ��ü ����
			pstmt = conn.prepareStatement(sql);
			//4:sql���� �����ؼ� ���̕�ȣ ���� ��� ������ ���
			 // resultSet ��Ƽ� ��ȯ
			rs = pstmt.executeQuery();
			System.out.println("-------------------------------------------");
			System.out.println("��ȣ\t���̵�\t�̸�\t��й�ȣ\t��ȭ��ȣ\t������");
			System.out.println("-------------------------------------------");
		    
			while(rs.next()) {
				System.out.print(rs.getInt("me_num")+"\t");
				System.out.print(rs.getString("me_id")+"\t");
				System.out.print(rs.getString("me_name")+"\t");
				System.out.print(rs.getString("me_passwd")+"\t");
				System.out.print(rs.getString("me_phone")+"\t");
				System.out.println(rs.getDate("me_regdate"));
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//�ڿ�����
			DBUtil.executeClose(rs,pstmt, conn);
		}
			
	}
	//���̵� �ߺ� üũ
	public int checkId(String me_id) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int count = 0;
		
		try {
			//1
			conn=DBUtil.getConnection();
			//sql
			sql="SELECT me_id FROM member WHERE me_id=?";
			//3
			pstmt=conn.prepareStatement(sql);
			//?
			pstmt.setString(1,me_id);
			//4
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt,conn);
		}
		return count;
	}
	//�α��� üũ
	
		public int loginCheck(String me_id,String me_passwd) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			int me_num = 0;
			
			try {
				//1,2
				conn = DBUtil.getConnection();
				//sql
				sql = "SELECT me_num FROM member WHERE me_id=? AND me_passwd=?";
				//3:preparedStatement
				pstmt = conn.prepareStatement(sql);
				//?�� ������ ���ε�
				pstmt.setString(1, me_id);
				pstmt.setString(2, me_passwd);
				//4:sql���� �����ؼ� ���̺�κ��� ȸ����ȣ ���ϱ�
				rs = pstmt.executeQuery();
				if(rs.next()) {
					me_num = rs.getInt(1); //me_num = rs.getInt(me_num);
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				DBUtil.executeClose(rs, pstmt, conn);
			}
			return me_num;
			
			
			
		}
			
		
	}
		
	
	









