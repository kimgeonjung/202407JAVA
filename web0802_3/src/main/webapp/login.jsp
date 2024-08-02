<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("id");
String pw = request.getParameter("pw");

MemberDAO dao = new MemberDAO();
MemberDTO dto = dao.loginUser(id, pw);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<%
if (dto != null) {
	if(dto.getId().equals(id) && dto.getPw().equals(pw)){
		session.setAttribute("userId", id);
		session.setAttribute("userName", dto.getName());
		response.sendRedirect("login_main.jsp");   
	}	
} else {
%>
	<script>
		alert('아이디 또는 비밀번호가 틀립니다!');
		history.back();
	</script>
<%
}
%>
</body>
</html>
