<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
html, body{
  height: 100%;
}
body { 
			
			background-position: center center;
			background-repeat:  no-repeat;
			background-attachment: fixed;
			background-size:  cover;
			background-color: #999;
  
}

div, body{
  margin: 0;
  padding: 0;
  font-family: exo, sans-serif;
  
}
.wrapper {
  height: 100%; 
  width: 100%; 
}

.message {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  width: 100%; 
  height:45%;
  bottom: 0; 
  display: block;
  position: absolute;
  background-color: rgba(0,0,0,0.6);
  color: #fff;
  padding: 0.5em;
}
</style>
<title>Admin Console</title>
</head>
<body>
	<div>
	<hr>
	<h3>Product Details</h3>>
	<table border ="2">
		<tr>
			<td align="left">Product Id</td>
			<td> ${product_Id}</td>
		</tr>
		<tr>
			<td align="left">Name</td>
			<td> ${product_Name}</td>
		</tr>
		<tr>
			<td align="left">Manufacturer</td>
			<td> ${product_Manufacturer}</td>
		</tr>
		<tr>
			<td align="left">Price</td>
			<td> ${product_Price}</td>
		</tr>
		<tr>
			<td align="left">Quantity Available</td>
			<td>${product_Quantity}</td>
		</tr>
	</table>
		<br>
		<br>
		<br>
		<br>
		<br>
		<form method="post" action="UpdationServlet">
		<center>
		 Enter the quantity sold: <input type="text" name="qty">
		<input type="submit" value="Update DB">
		</center>
		</form>
	<br>
	<br>
	<br>
	<hr>
	<br>
	</div>
</body>
</html>