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
<title>Name Database</title>
<link href=”bootstrap/css/bootstrap.min.css” rel=”stylesheet” type=”text/css” />
</head>
<body>
	<div>
	<h1 align="center">Welcome</h2>
	<h4 align="center">to</h4>
	<h1 align="center">amazone.ie</h3>
	<br>
	<hr>
	<br>
	<p><b><i>Enter a name in the text box below and click enter to add it to the MySQL Database</i></b></p>
	<form method="post" action="MyServlet">
	<center>
	Enter Name: <input type="text" name="name">
	<input type="submit" value="Enter">
	</center>
	</form>
	<br>
	<hr>
	<br>
	<p><b><i>Enter a name in the text box below and click enter to check if it is in the MySQL Database</i></b></p>
	<center>
	<form method="get" action="MyServlet">
	Enter Name: <input type="text" name="name">
	<input type="submit" value="Search">
	</center>
	</form>
	<br>
	<hr>
	<br>
	</div>
	<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
</body>
</html>