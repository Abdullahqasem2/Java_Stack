<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${lan}" var="lan">
			<tr>
				<td><a href="/show/${lan.id}"><c:out value="${lan.name}" /></a></td>
				<td><a href="/show/${lan.id}"><c:out value="${lan.creator}" /></a></td>
				<td><a href="/show/${lan.id}"><c:out value="${lan.version}" /></a></td>
				<td><a href="/edit/${lan.id}">Edit</a> <a href="/delete/${lan.id}">delete</a> </td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<h1>New Add</h1>
	<form:form action="/creat" method="post" modelAttribute="lang">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version" />
			<form:input path="version" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>