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
	<div >
		<h1><small> <c:out value="${category.name}"/> </small></h1>
	</div>
	<br>
	<div>
		<div >
			<div >
				<h4 ><small>Products</small></h4>
				<ul >
					<c:forEach items="${category.products}" var="product">
						<li > -  ${product.name} </li>
					</c:forEach> 
				 
				</ul>
			</div>
			<div class="col">
				<form:form action="/categories/${category.id}" method="POST" modelAttribute="categoryProduct">
					 <p>Add a Category</p> 
					<form:select path="product">
						<c:forEach items="${products}" var="prod">
							<form:option value="${prod.id}"> ${prod.name} </form:option>
						</c:forEach>
					</form:select>
					<button type="submit" >Add to Category</button>
				</form:form>
			</div>
		</div>
	</div>
  </body>
</body>
</html>