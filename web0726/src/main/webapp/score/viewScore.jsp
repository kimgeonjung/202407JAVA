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
String sql = "select * from score";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table { width: 600px; text-align: left; }
th    { width: 40px; background-color: cyan; }
</style>
</head>
<body>
<table>
<tr><th colspan="7">SCORE 테이블</th></tr>
<tr>
<td>학번</td>
<td>이름</td>
<td>국어</td>
<td>영어</td>
<td>수학</td>
<td>총점</td>
<td>평균</td>
</tr>
<%
while(rs.next()){
	String num = rs.getString("num");
	String name = rs.getString("name");
	String kor = rs.getString("kor");
	String eng = rs.getString("eng");
	String math = rs.getString("math");
%>
<tr>
<td><%=num %></td>
<td><%=name %></td>
<td><%=kor %></td>
<td><%=eng %></td>
<td><%=math %></td>
<td><%
double sum = Double.parseDouble(kor)+Double.parseDouble(eng)+Double.parseDouble(math);
%>
<%=sum %></td>
<td>
<%
double avg = sum/3;
%>
<%=avg %>
</td>
</tr>
<%
}
%>
</table>
<a href="insertForm.jsp">입력창</a>
</body>
</html>