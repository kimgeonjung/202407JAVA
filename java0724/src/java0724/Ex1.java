package java0724;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex1 {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update dept set dname = ?, loc = ? where deptno = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("MySQL 접속 성공");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "비서부");
			pstmt.setString(2, "대전");
			pstmt.setInt(3, 1007);
			int ret = pstmt.executeUpdate();
			System.out.println(ret+ "건 update 성공");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
