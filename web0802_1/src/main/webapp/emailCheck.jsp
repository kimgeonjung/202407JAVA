<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Cookies cookies = new Cookies(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(cookies.exits("email")){
%>
이메일 :<%=cookies.getValue("email") %>임
<%
}else{
%>
이메일 저장 안됨
<%
}
%>
</body>
</html>