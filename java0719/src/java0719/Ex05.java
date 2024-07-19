package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		String sql = "INSERT INTO customer VALUES "
				+ "('C-1001', 'Kim', '010-1234-5678', 'Seoul')";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("MySQL 접속 성공");
			
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);
			System.out.println("테이블에 삽입" + num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
