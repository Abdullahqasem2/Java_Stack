<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Question</title>
</head>
<body>
	<div>
		<h1>
			<small>What is your Question?</small>
		</h1>
	</div>
	<br>
	<div >
		<c:out value="${error}" escapeXml="false" />
		<form:form action="/questions/new" method="POST" modelAttribute="addQuestion">
			<p>
				<form:errors path="question" />


			</p>
			<p>
				<form:label path="question">Question</form:label>
				<form:textarea rows="3" path="question" />
			</p>

			<p>
				<label for="tags">Tags</label> <input type="text" name="other">

			</p>
			<p>
				<br>
				<button type="submit" >Ask</button>
			</p>

		</form:form>
	</div>

</body>
</body>
</html>