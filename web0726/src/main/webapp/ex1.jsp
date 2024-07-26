<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("연습<br>");
	Date now = new Date();
	out.println(now);
%>
<br>
<h1>현재 시간은 <%=now %>임</h1>

</body>
</html>