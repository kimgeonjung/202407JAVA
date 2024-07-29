<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%
// 데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = DriverManager.getConnection(URL, "root", "mysql");
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");

String sqlTmp = "";
String numTmp = "";
String nameTmp = "";
String korTmp = "";
String engTmp = "";
String mathTmp = "";

request.setCharacterEncoding("UTF-8");
String find = request.getParameter("find");	// update시 반드시 넘어오는 매개변수
String num = request.getParameter("num");	// null이면 오류
String name = request.getParameter("name");
String kor = request.getParameter("kor");
String eng = request.getParameter("eng");
String math = request.getParameter("math");



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 600px;
	text-align: left;
}

th {
	width: 40px;
	background-color: cyan;
}
</style>
<title>학생 점수 관리 프로그램 v2</title>
</head>
<body>
	<form>
		학번: <input type="text" name="num" value="<%=numTmp %>"><br> 
		이름: <input	type="text" name="name" value="<%=nameTmp %>"><br>  
		국어: <input type="text" name="kor" value="<%=korTmp %>"><br>  
		영어: <input type="text" name="eng" value="<%=engTmp %>"><br>  
		수학: <input type="text" name="math" value="<%=mathTmp %>"><br> 
		<input type="submit" value="입력/수정">
	</form>
<table>
<tr><th colspan="7">SCORE 테이블</th></tr>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>총점</th>
			<th>평균</th>
			<th>삭제</th>
		</tr>
<%
sqlTmp = "select * from score";
pstmt = conn.prepareStatement(sqlTmp);
ResultSet rs = pstmt.executeQuery();

while(rs.next()) {
	String num1 = rs.getString("num");
	String name1 = rs.getString("name");
	String kor1 = rs.getString("kor");
	String eng1 = rs.getString("eng");
	String math1 = rs.getString("math");
	int tot = Integer.parseInt(kor1)+Integer.parseInt(eng1)+Integer.parseInt(math1);
	double avg = tot / 3.0;
%>
	<tr>
		<td><a href="?find=<%=num1%>"><%=num1 %></a></td>
		<td><%=name1 %></td>
		<td><%=kor1 %></td>
		<td><%=eng1 %></td>
		<td><%=math1 %></td>
		<td><%=tot %></td>
		<td><%=avg %></td>
	</tr>
<%	
}
%>
</table>
</body>
</html>