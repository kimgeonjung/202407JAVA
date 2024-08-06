<%@page import="board.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String num = request.getParameter("num");

BoardDAO dao = new BoardDAO();
dao.deleteBoard(Integer.parseInt(num));

response.sendRedirect("list.jsp"); // 리다이렉트 list.jsp
%>
<%
	if(session.getAttribute("userId") != null) {
		// 로그인 상태
%>            
			<ul class="util">
				<form action="logout_process.jsp" method="post">
            	<li><input type="submit" value="logout" style="border: 0px; background-color: #fff; cursor: pointer;"></li>
            	</form>
            </ul>
<%
	} else {
		// 비 로그인 상태
%>
            <ul class="util">
            	<form action="login.jsp" method="post">
            	<li><input type="submit" value="login" style="border: 0px; background-color: #fff; cursor: pointer;"></li>
            </ul>
<%
	}
%>