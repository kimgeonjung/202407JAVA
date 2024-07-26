<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection(URL, "root", "mysql");
String sql = "select * from dept where loc = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
String location = request.getParameter("loc");
pstmt.setString(1, location);
ResultSet rs = pstmt.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
지역
<input type="text" name="loc"><p/>
<input type="submit">
</form>
<table border="1">
<tr><th colspan="3">DEPT 테이블</th></tr>
<tr><td>부서번호</td><td>부서이름</td><td>지역</td></tr>
<%
while(rs.next()){
	String deptno = rs.getString("deptno");
	String dname = rs.getString("dname");
	String loc = rs.getString("loc");
%>
<tr><td><%=deptno %></td><td><%=dname %></td><td><%=loc %></td></tr>
<%
}
%>
</table>
</body>
</html>