package account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class AccountDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private String ACCOUNT_LOGIN = "select count(*) from account where name = ? and ssn = ?";
	private String ACCOUNT_REGISTER = "insert into account (name, ssn, tel, balance) values (?,?,?,0)";
	
	// 로그인
	public boolean checkLogin(String name, String ssn) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_LOGIN);
			pstmt.setString(1, name);
			pstmt.setString(2, ssn);
			rs = pstmt.executeQuery();
			rs.next();
			if(rs.getInt(1) == 1) return true;
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
		return false;
	}
	
	// 회원가입
	public void register(AccountDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(ACCOUNT_REGISTER);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getTel());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
}
