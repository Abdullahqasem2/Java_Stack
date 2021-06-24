<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>New License</h1>
	<form:form method="post" action="/AddLicenses2"
		modelAttribute="licenses">
		<p>
			<form:label path="Person">Person</form:label>
		        <form:errors path="Person"/>
		        <form:select class="form-control" path="Person">
		        <c:forEach items="${ persons }" var="p">
		        	<form:option value="${ p.id }">${ p.getFirst_Name()} ${ p.getLast_Name()}</form:option>
		        </c:forEach>
		        </form:select>
		</p>
		<br>
		<p>
			<form:label path="state">State</form:label>
			<form:input path="state" />
			<form:errors path="state" />
		</p>
		<br>
		<p>
			<form:label path="expirationDate">ExDate</form:label>
			<form:input type="date" path="expirationDate" />
			<form:errors path="expirationDate" />
		</p>

		<input type="submit" value="go">

	</form:form>


</body>
</html>