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
String sql = "insert into score (num, name, kor, eng, math) values (?,?,?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(sql);

String num = request.getParameter("num");
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");

pstmt.setString(1, num);
pstmt.setString(2, name);
pstmt.setString(3, kor);
pstmt.setString(4, eng);
pstmt.setString(5, math);
int scores = pstmt.executeUpdate();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=scores%>건 입력
<p/><a href="viewScore.jsp">테이블 보기</a>
<br>
</body>
</html>