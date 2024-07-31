<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//데이터베이스 접속
String URL = "jdbc:mysql://localhost:3307/spring5fs";
Connection conn = null;
PreparedStatement pstmt = null;
Class.forName("com.mysql.cj.jdbc.Driver");
conn = DriverManager.getConnection(URL, "root", "mysql");

//임시 저장 변수
String writer = "";
String title = "";
String content = "";
String regtime = "";
String hits = "";

//매개 변수
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");

//선택 조회 
String sql = "select * from board where num = ?";
pstmt = conn.prepareStatement(sql);
pstmt.setString(1, num);
ResultSet rs = pstmt.executeQuery();
if (rs.next()) {
	title = rs.getString("title");
	writer = rs.getString("writer");
	regtime = rs.getString("regtime");
	hits = rs.getString("hits");
	content = rs.getString("content"); 
}

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        table { width:680px; text-align:center; }
        th    { width:100px; background-color:cyan; }
        td    { text-align:left; border:1px solid gray; }
    </style>
</head>
<body>

<table>
    <tr>
        <th>제목</th>
        <td><%=title %></td>
    </tr>
    <tr>
        <th>작성자</th>
        <td><%=writer %></td>
    </tr>
    <tr>
        <th>작성일시</th>
        <td><%=regtime %></td>
    </tr>
    <tr>
        <th>조회수</th>
        <td><%=hits %></td>
    </tr>
    <tr>
        <th>내용</th>
        <td><%=content %></td>
    </tr>
</table>

<br>
<input type="button" value="목록보기" onclick="location.href='list.jsp'">
<input type="button" value="수정"
       onclick="location.href='write2.jsp?num=<%=num %>'">
<input type="button" value="삭제"
       onclick="location.href='delete.jsp?num=<%=num %>'">

</body>
</html>
