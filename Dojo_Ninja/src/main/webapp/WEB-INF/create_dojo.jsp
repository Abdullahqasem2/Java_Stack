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
	<h1>New DOJO</h1>
	<h2>
		<a href="/ninjas/new"> create ninja </a>
	</h2>
	<form:form action="/dojos/new" method="post" modelAttribute="dojo">
		<p>
			<form:label path="name">name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
	<c:forEach items="${ dojos }" var="doj">
		<a href="/dojos/${ doj.id }">${ doj.name }</a>
	</c:forEach>
</body>
</html>