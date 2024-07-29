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
String sql = "select * from score where num = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, "321");
ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(rs.next()){
	String num = rs.getString("num");
	String name = rs.getString("name");
	String kor = rs.getString("kor");
	String eng = rs.getString("eng");
	String math = rs.getString("math");
	out.print(num+", "+name+", "+kor+", "+eng+", "+math);
	
}
%>
</body>
</html>