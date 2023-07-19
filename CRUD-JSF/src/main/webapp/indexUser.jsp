<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List Page</title>
</head>
<body>
	User List Page
	<a href="/CRUD-JSF/User/create.p">Hello</a>
	</form>
	<table>
		<thead>
			<tr>
				<th>ID</th><th>Email</th><th>Login</th><th>Name</th><th>Password</th><th>Age</th><th>Actions</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.id}</td>
					<td>${user.email}</td>
					<td>${user.login}</td>
					<td>${user.name}</td>
					<td>${user.password}</td>
					<td>${user.age}</td>
					<td><button>ClickMe</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>