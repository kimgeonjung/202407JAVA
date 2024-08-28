<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String num = request.getParameter("deptno");
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/spring5fs", "root", "mysql");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th class="num">사번</th>
<th class="writer">이름</th>
<th class="writer">직급</th>
<th class="writer">급여</th>
</tr>
<%
String sql = "select * from emp where deptno = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
ResultSet rs = pstmt.executeQuery();

while(rs.next()){
	String empno = rs.getString("empno");
	String ename = rs.getString("ename");
	String job = rs.getString("job");
	String sal = rs.getString("sal");

%>
<tr>
<td><%=empno %></td>
<td><%=ename %></td>
<td><%=job %></td>
<td><%=sal %></td>
</tr>
<%
}
%>
</table>
<hr>
</body>
</html>