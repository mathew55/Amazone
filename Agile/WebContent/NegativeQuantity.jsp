<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
div {
    width: 600px;
    border: 5px solid black;
    border-radius: 5px;
    padding: 25px;
    margin: 25px;
    background-color: brown;
    
}
h2 {
	position: center;
	font-size:60px
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Console</title>
</head>
<body>
	<div>
	<table border ="2">
		<tr>
			<td align="left">Product Id</td>
			<td> ${product_Id}</td>
		</tr>
			<td align="left">Quantity Available</td>
			<td>${product_qty}</td>
		</tr>
	</table>
		<form method="post" action="UpdationServlet">
		<center>
		 Enter the quantity sold: <input type="text" name="qty">
		<input type="submit" value="Update DB">
		</center>
		</form>
	<br>
	<hr>
	Sorry, The updation will put the stock available to negative. Try Again!
	<br>
	<br>
	<hr>
	<br>
	</div>
</body>
</html>