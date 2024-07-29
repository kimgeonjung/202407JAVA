<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertResult.jsp">
	학번 : <input name="num"><br>
	이름 : <input name="name"><br>
	국어 : <input name="kor"><br>
	영어 : <input name="eng"><br>
	수학 : <input name="math"><br>
	<input type="submit" value="확인">
	</form>
	<a href="viewScore.jsp">테이블 보기</a>
</body>
</html>