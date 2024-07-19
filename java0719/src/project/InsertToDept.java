package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertToDept {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sql = "INSERT INTO dept (DEPTNO, DNAME, LOC) VALUES ";
		// (50, 'PROGRAMMER', 'SEOUL')
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("MySQL 접속 성공");
			
			System.out.println("생성할 데이터 입력: ");
			String query = sc.nextLine();
			sql += query;
			
			stmt = con.createStatement();
			int num = stmt.executeUpdate(sql);
			System.out.println("테이블에 삽입, " + num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
