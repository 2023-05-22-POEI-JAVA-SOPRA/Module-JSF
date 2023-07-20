<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create User Page</title>
</head>
<body>
	Create User Page
	
	
	<form action="/CRUD-JSF/User/store.p" method="post">
		Email : <input type="text" name="email">
		Login : <input type="text" name="login">
		Password : <input type="text" name="password">
		Name : <input type="text" name="name">
		age : <input type="number" name="age">
		
		<button type="submit">Ajouter</button>
	</form>
	
</body>
</html>