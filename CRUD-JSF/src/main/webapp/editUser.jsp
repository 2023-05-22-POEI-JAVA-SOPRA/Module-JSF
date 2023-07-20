<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User page</title>
</head>
<body>
	Edit User page
	
	<form action="/CRUD-JSF/User/update.p" method="post">
		Id : <input readonly name="id" value="${user.id}">
		Email : <input type="text" name="email" value="${user.email}">
		Login : <input type="text" name="login" value="${user.login}">
		Password : <input type="text" name="password" value="${user.password}">
		Name : <input type="text" name="name" value="${user.name}">
		age : <input type="number" name="age" value="${user.age}">
		
		<button type="submit">Update</button>
	</form>
</body>
</html>