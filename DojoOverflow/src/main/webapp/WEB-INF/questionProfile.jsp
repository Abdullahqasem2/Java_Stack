<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Question Profile</title>
</head>
<body>
	<div>
		<h1>
			<small>${question.question }</small>
		</h1>
	</div>
	<br>
	<div>
		<h4>

			Tags:
			<c:forEach items="${question.tags}" var="t">
				<button>${t.subject}</button>
			</c:forEach>

		</h4>
	</div>
	<br>
	<div>
		<div>
			<div>
				<table>
					<thead>
						<tr>
							<th>Answers</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach items="${question.answer }" var="a">
								<td>• ${a.answer}</td>
							</c:forEach>

						</tr>
					</tbody>
				</table>
			</div>
			<div>

				<form:form action="/questions/${question.id}" method="POST"
					modelAttribute="addTheAnswer">

					<form:errors path="answer" element="p" />


					<p>
						<form:label path="answer">Add your Answer</form:label>
						<form:textarea rows="3" path="answer" />
					</p>

					<p >
						<br>
						<button type="submit" >Add Answer</button>
					</p>

				</form:form>
			</div>
		</div>
	</div>
	<div>
		<a href="/"><button>Dashboard</button></a>
	</div>

</body>
</body>
</html>