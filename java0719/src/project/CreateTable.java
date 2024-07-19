package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		String sql1 = "CREATE TABLE IF NOT EXISTS dept "
				+ "(DEPTNO int(11) DEFAULT NULL,"
				+ "DNAME varchar(14) DEFAULT NULL, "
				+ "LOC varchar(13) DEFAULT NULL)"
				+ "ENGINE=InnoDB DEFAULT CHARSET=utf8;";
		
		String sql2 = "CREATE TABLE IF NOT EXISTS emp "
				+ "(EMPNO int(11) NOT NULL, "
				+ "ENAME varchar(10) DEFAULT NULL, "
				+ "JOB varchar(9) DEFAULT NULL, "
				+ "MGR int(11) DEFAULT NULL, "
				+ "HIREDATE date DEFAULT NULL, "
				+ "SAL int(11) DEFAULT NULL, "
				+ "COMM int(11) DEFAULT NULL, "
				+ "DEPTNO int(11) DEFAULT NULL)"
				+ "ENGINE=InnoDB DEFAULT CHARSET=utf8;";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("MySQL 접속 성공");
			
			stmt = con.createStatement();
			int num1 = stmt.executeUpdate(sql1);
			int num2 = stmt.executeUpdate(sql2);
			System.out.println("테이블 생성" + num1 + num2);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
