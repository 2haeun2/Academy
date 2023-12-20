package shop;

import java.sql.SQLException;

import kr.s03.preparedstatement.DBUtil;

public class sdasd {

}
conn = DBUtil.getConnection();
conn.setAutoCommit(false);
sql_i = "INSERT INTO m_reservation (re_num, me_num, mo_num, re_seats) "
		+ "VALUES (m_reservation_seq.NEXTVAL, ?, ?, ?)";
pstmt_i = conn.prepareStatement(sql_i);
pstmt_i.setInt(1, reservation.getMe_num());
pstmt_i.setInt(2, reservation.getMo_num());
pstmt_i.setInt(3, reservation.getRe_seats());
sql_u = "UPDATE m_movie SET mo_seats=mo_seats-? WHERE mo_num=?";
pstmt_u = conn.prepareStatement(sql_u);
pstmt_u.setInt(1, reservation.getRe_seats());
pstmt_u.setInt(2, reservation.getMo_num());
pstmt_i.executeUpdate();
pstmt_u.executeUpdate();
conn.commit();
System.out.println(getMovieOneLine(reservation)+"을/를 "+reservation.getRe_seats()+"석 예매했습니다.");
}
catch(Exception e) {
e.printStackTrace();
try {
	conn.rollback();
	System.out.println("예매에 실패했습니다!");
}
catch(SQLException se) {
	se.printStackTrace();
}
}
finally {
DBUtil.executeClose(null, pstmt_i, null);
DBUtil.executeClose(null, pstmt_u, conn);