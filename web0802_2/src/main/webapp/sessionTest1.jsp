<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
session.setAttribute("key1", "문자열");
session.setAttribute("key2", Arrays.asList("홍씨", "강씨", "이씨"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session test1</title>
</head>
<body>

</body>
</html>