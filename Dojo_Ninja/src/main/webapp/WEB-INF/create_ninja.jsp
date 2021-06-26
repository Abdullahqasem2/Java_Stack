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
	<h1>New NINJA</h1>
	<h2>
		<a href="/dojos/new"> create dodo </a>
	</h2>
	<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
		<p>
			<form:label path="dojo">Dojo Name</form:label>
			<form:errors path="dojo"/>
			<form:select class="form-control" path="dojo">
				<c:forEach items="${ dojos }" var="dojo">
					<option value="${ dojo.id}">${ dojo.name }</option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="first_name">first_name</form:label>
			<form:errors path="first_name" />
			<form:input path="first_name" />
		</p>
		<p>
			<form:label path="last_name">last_name</form:label>
			<form:errors path="last_name" />
			<form:input path="last_name" />
		</p>
		<p>
			<form:label path="age">age</form:label>
			<form:errors path="age" />
			<form:input path="age" />
		</p>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>