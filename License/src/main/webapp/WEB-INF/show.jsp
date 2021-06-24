<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Name</th>
			<th>license num</th>
			<th>state</th>
			<th>EXdate</th>
		</tr>
		<c:forEach items="${License}" var="L">
		<tr>
			<td>${L.person.getFirst_Name()}</td>
			<td>${L.id}</td>
			<td>${L.state}</td>
			<td>${L.expirationDate}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>