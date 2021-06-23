<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
	<c:out value="${language.name}" />
</h1>
<p>
	Creator:
	<c:out value="${language.creator}" />
</p>
<p>
	Current Version:
	<c:out value="${language.currentVersion}" />
</p>

<a href="/languages/edit/${language.id}">Edit </a>
<a href="/languages/delete/${language.id}">delete </a>

<form action="/books/${book.id}" method="post">
	<input type="hidden" name="_method" value="delete"> <input
		type="submit" value="Delete">
</form>

</body>
</html>