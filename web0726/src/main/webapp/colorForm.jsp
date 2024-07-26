<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>색깔을 선택하세요</title>
</head>
<body>
<h1>if-else Example</h1>
<form action="colorResult.jsp" method="post">
이름 : <input name="name">
<br>
좋아하는 색깔 : 
<select name="color">
<option value="red">빨간색</option>
<option value="blue" selected>파란색</option>
<option value="green">초록색</option>
</select>
<br>
<input type="submit" value="보내기"> 
</form>
</body>
</html>