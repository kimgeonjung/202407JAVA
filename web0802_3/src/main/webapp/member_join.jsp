<%@page import="member.MemberDTO"%>
<%@page import="member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");

MemberDAO dao = new MemberDAO();
MemberDTO dto = null;
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
if (dao.confirmId(id)) {
%>
<script>
    alert('이미 등록된 아이디입니다.');
    history.back()
</script>
<%          
} else {
	dto = new MemberDTO(id, pw, name);
	dao.registerUser(dto);
%>
<script>
	alert('가입이 완료되었습니다.');
	window.close();
</script>
<%          
}
%>

</body>
</html>