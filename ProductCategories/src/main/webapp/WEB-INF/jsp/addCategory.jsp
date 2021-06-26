<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Add Category</title>
</head>
<body >
	<h3 >
		<small>New Category</small>
	</h3>
	<br>
	<form:form action="/categories/new" method="POST"
		modelAttribute="category">

		<p>
			<form:errors path="name"  />
		</p>
		<p>
			<form:label  path="name">Name</form:label>
		</p>
		<p>
			<form:input  path="name" />
		</p>
		<br>
		<button type="submit" >Add Category</button>

	</form:form>
</body>
</body>
</html>