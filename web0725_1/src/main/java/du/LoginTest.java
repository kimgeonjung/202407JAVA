package du;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginTest {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3307/spring5fs";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from account where name = ? and ssn = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩");
			conn = DriverManager.getConnection(URL, "root", "mysql");
			System.out.println("MySQL 접속 성공");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "홍길동");
			pstmt.setString(2, "911224");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String ssn = rs.getString("ssn");
				String tel = rs.getString("tel");
				int balance = rs.getInt("balance");
				String str = String.format("%d, %s, %s, %s, %d", id, name, ssn, tel, balance);
				System.out.println(str);
			}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
