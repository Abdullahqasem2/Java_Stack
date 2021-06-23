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
	<a href="/song/new"> Add new </a> <a href="/topTen"> Top 10 </a>
	<form action="/search">
		<input type="text" name="lucy" />
		<button>Search Artists</button>
	</form>
	<table>
		<tr>
			<th>Name</th>
			<th>Creator</th>
			<th>Version</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${luc}" var="luc">
			<tr>
				<td><a href="/show/${luc.id}"><c:out value="${luc.title}" /></a></td>
				<td><c:out value="${luc.artist}" /></td>
				<td><c:out value="${luc.rating}" /></td>
				<td><a href="/edit/${luc.id}">Edit</a> <a
					href="/delete/${luc.id}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>