package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String sql1 = "INSERT INTO dept (DEPTNO, DNAME, LOC) VALUES "
				+ "(10, 'ACCOUNTING', 'NEW YORK'), "
				+ "(20, 'RESEARCH', 'DALLAS'), "
				+ "(30, 'SALES',  'CHICAGO'), "
				+ "(40, 'OPERATIONS', 'BOSTON');";
		
		String sql2 = "INSERT INTO `emp` "
				+ "(`EMPNO`, `ENAME`, `JOB`, `MGR`, `HIREDATE`, `SAL`, `COMM`, `DEPTNO`) VALUES "
				+ "(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20), "
				+ "(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30), "
				+ "(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30), "
				+ "(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20), "
				+ "(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30), "
				+ "(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30), "
				+ "(7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10), "
				+ "(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000, NULL, 20), "
				+ "(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10), "
				+ "(7844, 'TURNER', 'SALESMAN', 7698, '1980-09-08', 1500, 0, 30), "
				+ "(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100, NULL, 20), "
				+ "(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30), "
				+ "(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20), "
				+ "(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);";
		
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
			System.out.println("테이블에 삽입, " + num1 + num2);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
