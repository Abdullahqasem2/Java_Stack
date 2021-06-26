<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>asd</title>
</head>
<body>
	<div>
		<h1>
			<small>Questions Dashboard</small>
		</h1>
	</div>
	<br>
	<div>
		<table>
			<thead>
				<tr>
					<th>Question</th>
					<th>Tags</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${questions}" var="q">
					<tr>
						<td><p>
								<a href="questions/${q.id}">${q.question}</a>
							</p></td>
						<td><c:forEach items="${q.tags}" var="t">
								<button>${t.subject}</button>
							</c:forEach></td>
					</tr>

				</c:forEach>
			</tbody>


		</table>

	</div>
	<br>
	<div>
		<br> <a href="/questions/new"><button type="button">New
				Question</button></a>
	</div>

</body>
</body>
</html>