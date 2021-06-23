<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Code</title>
</head>
<body>
	<h3>What is the code</h3>
	<span><c:out value="${ error }" /></span>
	<form action="/check" method="post">
		<input type="text" name="code" placeholder="Code in heare"> <input
			type="submit" value="Try Code">
	</form>
</body>
</html>