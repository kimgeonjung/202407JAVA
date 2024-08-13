<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setAttribute("name", "홍길동");
request.setAttribute("money", 5000);
request.setAttribute("datalist", new String[] {"a", "b", "c"});
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${name == '홍길동' }">
이름은 홍씨<br>
</c:if>

<c:choose>
	<c:when test="${money >= 10000 }">돈 많아</c:when>
	<c:when test="${money > 0 }">돈 없어</c:when>
	<c:otherwise>그지야</c:otherwise>
</c:choose>

<br>
<c:forEach var="count" begin="0" end="30" step="3">
	${count}
</c:forEach>
<br>
<c:forEach var="i" begin="1" end="10">
	${sum = sum + i; ''}
</c:forEach>
1~10 합 ${sum}
<br>
<ul>
<c:forEach var="i" begin="1" end="9">
	<li>4 X ${i} = ${4*i}</li>
</c:forEach>
</ul>

<c:forEach var="data" items="${datalist}">
	${data}
</c:forEach>
</body>
</html>