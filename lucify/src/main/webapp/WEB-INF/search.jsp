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
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${luc}" var="luc">
			<tr>
				<td><c:out value="${luc.title}" /></td>
				<td><c:out value="${luc.artist}" /></td><td><c:out value="${luc.rating}" /></td>
				
				<td><a href="/edit/${luc.id}">Edit</a> <a
					href="/delete/${luc.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>