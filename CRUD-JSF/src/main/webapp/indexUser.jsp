<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List Page</title>
<link href="/CRUD-JSF/css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
</head>
<body>

	<%@ include file="components/Header.jsp"%>

	<div class="container">
		<h1 class="text-center text-warming mb-3 mt-3">User List Page</h1>

		<div class="col-md-12 col-xm-8 col-sm-8">
			<form class="form-group d-flex" action="/CRUD-JSF/User/index.p"
				method="get">
				<input class="form-control col-md-4 mr-3" name="search" type="text">

				<button class="btn btn-success" type="submit">Rechercher</button>
			</form>
			<table class="table table-dark table-striped">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Email</th>
						<th scope="col">Login</th>
						<th scope="col">Name</th>
						<th scope="col">Password</th>
						<th scope="col">Age</th>
						<th scope="col">Actions</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td scope="row">${user.id}</td>
							<td>${user.email}</td>
							<td>${user.login}</td>
							<td>${user.name}</td>
							<td>${user.password}</td>
							<td>${user.age}</td>
							<td><a class="btn btn-danger"
								href="/CRUD-JSF/User/delete.p?id=${user.id}">Delete</a> <a
								class="btn btn-primary"
								href="/CRUD-JSF/User/edit.p?id=${user.id}">Edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>