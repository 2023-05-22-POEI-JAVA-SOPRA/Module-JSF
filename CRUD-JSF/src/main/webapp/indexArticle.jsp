<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article List Page</title>
</head>
<body>
	Article List Page
	<a href="/CRUD-JSF/Article/create.a">Create new article</a>

	<table>
		<thead>
			<tr>
				<th>ID</th><th>Description</th><th>Brand</th><th>Price</th><th>Actions</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${articles}" var="article">
				<tr>
					<td>${article.id}</td>
					<td>${article.description}</td>
					<td>${article.brand}</td>
					<td>${article.price}</td>
					<td><a href="#"></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>