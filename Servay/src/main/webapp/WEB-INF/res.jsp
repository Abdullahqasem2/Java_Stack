<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Submitted Info</h1>
	<p><strong>Name:</strong> ${result}</p>
	<p><strong>Language:</strong> <c:out value="${lan}"/></p>
	<p><strong>Location:</strong> <c:out value="${loc}"/></p>
	<p><strong>Comment:</strong> <c:out value="${comment}"/></p>
</body>
</html>