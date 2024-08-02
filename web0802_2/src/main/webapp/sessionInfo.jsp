<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Date time = new Date();
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
System.out.println(session.getCreationTime());
System.out.println(session.getLastAccessedTime());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session info</title>
</head>
<body>
세션 ID: <%=session.getId() %><br>
<%
time.setTime(session.getCreationTime());
%>
세션 생성 시간: <%=formatter.format(time) %><br>
<%
time.setTime(session.getLastAccessedTime());
%>
최근 접근 시간: <%=formatter.format(time) %>
</body>
</html>