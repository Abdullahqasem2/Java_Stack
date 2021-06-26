<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach items="${dojo}" var="ninja">
		<br>
		<p> Ninja = ${ ninja.first_name }</p> <p>${ ninja.last_name }</p><hr><p> for DOJO: ${ ninja.dojo.name }</p><hr>
		<br>
	</c:forEach> 
	<a href="/" > Back To DOJO create </a>
	<br>
	<a href="/ninjas/new" > Back To NINJA create </a>
</body>
</html>