<%@page import="account.AccountDAO"%>
<%@page import="account.AccountDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String username = request.getParameter("username");
String password = request.getParameter("password");
String tel = request.getParameter("tel");

AccountDAO dao = new AccountDAO();
AccountDTO dto = new AccountDTO(0, username, password, tel, 0);

dao.register(dto);

out.println("<script type='text/javascript'>");
out.println("alert('환영합니다, " + username + "!');");
out.println("window.location.href = 'index.jsp';");
out.println("</script>");
%>