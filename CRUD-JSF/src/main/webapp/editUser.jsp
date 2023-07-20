<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User page</title>
<link href="/CRUD-JSF/css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
</head>
<body>
	<%@ include file="components/Header.jsp"%>

	<div class="container">
		<div class="col-md-8 offset-2 col-xm-8 col-sm-8 ">
			<div class="card my-5">
				<div class="card-header">
					<span>Update User</span> <a type="button"
						class="btn btn-danger float-right" href="/CRUD-JSF/User/index.p">Annuler</a>
				</div>
				<div class="card-body">
					<form action="/CRUD-JSF/User/update.p" method="post">
						<div class="form-group">
							<label class="label-control">ID :</label> <input readonly
								class="form-control" name="id" value="${user.id}">
						</div>
						<div class="form-group">
							<label class="label-control">Email :</label> <input
								class="form-control" name="email" value="${user.email}">
						</div>
						<div class="form-group">
							<label class="label-control">Login :</label> <input
								class="form-control" name="login" value="${user.login}">
						</div>
						<div class="form-group">
							<label class="label-control">Password :</label> <input
								class="form-control" name="password" value="${user.password}">
						</div>
						<div class="form-group">
							<label class="label-control">Name :</label> <input
								class="form-control" name="name" value="${user.name}">
						</div>

						<div class="form-group">
							<label class="label-control">Age :</label> <input
								class="form-control" name="age">
						</div>

						<button class="btn btn-success" type="submit">Update</button>
					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>