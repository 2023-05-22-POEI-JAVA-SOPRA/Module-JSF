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
	
	
	<form action="/CRUD-JSF/Article/store.a" method="post">
		
		Brand : <input type="text" name="brand">
		Description : <input type="text" name="description">
		Price : <input type="number" name="price" step="0.1">
		
		<button type="submit">Ajouter</button>
	</form>
	
</body>
</html>