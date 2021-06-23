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
	<form action="/login" method="post" >
	Nme	<input type="text" name="name"> 
	<br>
	<br>
	Dojo location	<select name="loc">
			<option value="Tulkarm">Tulkarm</option>
			<option value="Ramallah">Ramallah</option>
		</select>
	<br>
	<br> 
	Favoriet lan	<select name="lan">
			<option value="Python">Python</option>
			<option value="Java">Java</option>
		</select>
	<br>
	<br>
	Comment	<textarea name="comment" rows="4" cols="50"></textarea>
	<br>
	<br>
	<input type="submit">
	</form>
</body>
</html>