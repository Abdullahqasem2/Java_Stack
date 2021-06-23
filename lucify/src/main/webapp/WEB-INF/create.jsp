<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/creat" method="post" modelAttribute="lucy">
		<p>
			<form:label path="title">title</form:label>
			<form:errors path="title" />
			<form:input path="title" />
		</p>
		<p>
			<form:label path="artist">artist</form:label>
			<form:errors path="artist" />
			<form:textarea path="artist" />
		</p>
		<p>
			<form:label path="rating">rating</form:label>
			<form:errors path="rating" />
			<form:input path="rating" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>