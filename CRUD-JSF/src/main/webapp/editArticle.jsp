<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Article Page</title>
</head>
<body>
	Create Article Page
	
	
	<form action="/CRUD-JSF/Article/update.a" method="post">
		Id : <input type="text" name="id" readonly value="${article.id}">
		
		Brand : <input type="text" name="brand" value="${article.brand}">
		Description : <input type="text" name="description" value="${article.description}">
		Price : <input type="number" name="price" step="0.1" value="${article.price}">
		
		<button type="submit">Edit</button>
	</form>
	
</body>
</html>