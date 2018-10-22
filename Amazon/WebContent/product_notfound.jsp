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
	<h4 align="left">Stock Updation Page</h4>
	<br>
	<hr>
	<br>
	<p><b><i>Enter the product id to get details of the product from the inventory</i></b></p>
	<form method="post" action="ProductServlet">
	<center>
	Product Id: <input type="text" name="pid">
	<input type="submit" value="Enter">
	</center>
	</form>
	<br>
	<br>
		Sorry, It seems like you entered an invalid product Id.
		Try Again!
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<hr>
	<br>
	</div>
</body>
</html>l>