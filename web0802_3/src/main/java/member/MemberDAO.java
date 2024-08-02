package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCUtil;

public class MemberDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// sql 쿼리
	private String MEMBER_LOGIN = "select * from member where id = ? and pw = ?";
	private String MEMBER_ID_CHECK = "select id from member where id = ?";
	private String MEMBER_REGISTER = "insert into member values (?, ?, ?)";
	private String MEMBER_UPDATE = "";
	
	// 기능 1. 로그인 2. 회원가입 3. 회원수정
	
	// 1. 로그인	
	public MemberDTO loginUser(String id, String pw) {
		MemberDTO dto = null;
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_LOGIN);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new MemberDTO(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeResources(conn, pstmt, rs);
		}
		return dto;
	}
	
	// 2. 회원가입
	// 	2.1 ID 중복 확인
	public boolean confirmId(String id) {
		boolean result = false;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(MEMBER_ID_CHECK);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt, rs);
		}
		return result;
	}
	// 	2.2 회원가입
	public void registerUser(MemberDTO dto) {
		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(MEMBER_REGISTER);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.closeResources(conn, pstmt);
		}
	}
	
	// 3. 회원수정
	
}
