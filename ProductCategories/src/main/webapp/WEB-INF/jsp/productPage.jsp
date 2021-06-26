<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Product Page</title>
</head>
<body>
<br>
	<div>
		<h1 ><small> <c:out value="${product.name}"/> </small></h1>
	</div>
	<br>
	<div >
		<div >
			<div>
				<h4><small>Categories</small></h4>
				<ul>
					<c:forEach items="${product.categories}" var="category">
						<li class="list-group-item"> -  ${category.name} </li>
					</c:forEach> 
				 
				</ul>
			</div>
			<div>
				<form:form action="/products/${product.id}" method="POST" modelAttribute="categoryProduct">
					 <p>Add a Category</p> 
					<form:select  path="category">
						<c:forEach items="${categories}" var="category">
							<form:option value="${category.id}"> ${category.name} </form:option>
						</c:forEach>
					</form:select>
					<button type="submit" >Add to Product</button>
				</form:form>
			</div>
		</div>
	</div>
  </body>
</body>
</html>