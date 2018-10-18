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
    background-color: green;
    
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
		${product_Id}
		<br>
		${product_Name}
		<br>
		${product_Manufacturer}
		<br>
		${product_Price}
		<br>
		${product_Quantity}
		<br>
		<br>
		<br>
		<form method="post" action="Updation">
		<center>
		 Enter the quantity sold: <input type="text" name="qty">
		 Product Id : <input type="text" value= ${product_Id} name="pid" readonly>
		<input type="submit" value="Update DB">
		</center>
		</form>
	<br>
	<hr>
	<br>
	<br>
	<hr>
	<br>
	</div>
</body>
</html>