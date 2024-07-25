package du;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/First")
public class First extends HttpServlet {

	public First() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean flag = false;

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf8");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");

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
			pstmt.setString(1, name);
			pstmt.setString(2, ssn);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name1 = rs.getString("name");
				String ssn1 = rs.getString("ssn");
				String tel = rs.getString("tel");
				int balance = rs.getInt("balance");
				String str = String.format("%d, %s, %s, %s, %d", id, name1, ssn1, tel, balance);
				out.println(str);
				LoginSession.id = id;
				LoginSession.name = name1;
				LoginSession.ssn = ssn1;
				LoginSession.tel = tel;
				LoginSession.balance = balance;
				flag = true;
			}
			
			if (flag) {
				out.println("<h1>" + name + "님, 환영합니다.</h1>");
			} else {
				out.println("<h1>로그인을 다시 해 주세요</h1>");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
