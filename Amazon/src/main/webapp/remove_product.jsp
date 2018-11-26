<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
</head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/Amazon/src/main/css/main.css">
<title>Admin can now remove products by their name</title>
</head>
<body>
<h1 align="center">Product Updation</h1>
<br><br><br><br>
<form action="/Amazon/prod_update_index_byname.jsp?type=all&p=1">
    <input type="submit" align="center" value="Remove Product by Name" />
</form>
<br>
<form action="/Amazon/prod_update_index.jsp">
    <input type="submit" align="center" value="Remove Product by Product ID" />
</form>
</body>
</html>