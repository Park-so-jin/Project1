package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	
	/*
	 * DBConnection dbc = new DBConnection(); Connection conn = dbc.getConnection();
	 */
	
	
	
	 Connection conn = new DBConnection().getConnection();
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 
	 public boolean loginCheck(MemberDto dto) {
		 String sql = "SELECT * FROM member where id=? and pw =?";
		 try {
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setString(1, dto.getId());
			 pstmt.setString(2, dto.getPw());
			 rs = pstmt.executeQuery();
			 if(rs.next()) {
				 return true;
			 }else {
				 return false;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	 }
	 
	
	
	
}
