<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
</head>
<body>

	<h3>Men Clothing</h3>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		
			<tr>
				<td>M01</td>
				<td>Men Blazer</td>
				<td><img src="image/menCloth1.jpg" width="200"></td>
				<td>$250</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/cart/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>M02</td>
				<td>Men Ethnic Wear</td>
				<td><img src="image/menCloth2.jpg" width="200"></td>
				<td>$400</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>M03</td>
				<td>Men Formal Shirt</td>
				<td><img src="image/menCloth3.jpeg" width="200"></td>
				<td>$150</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
			<tr>
				<td>M04</td>
				<td>Men winter jacket</td>
				<td><img src="image/menCloth4.jpg" width="200"></td>
				<td>$350</td>
				<td align="center">
					<a href="${pageContext.request.contextPath }/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
	
	</table>

</body>
</html>