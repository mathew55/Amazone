<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center"><h1 >AMAZON ADMIN LOGIN</h1></div>

<form action="/Agile/AdminLogin_Servlet" method="post">
<div align="center">
<table align="center">
<tr>
<td>AdminName:&nbsp;&nbsp;<input type="text" value="please input your adminname" size="30"></td>
</tr>
<tr>
<td>Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" size="31"></td>
</tr>
<tr><td>
<input type="submit" value="Login">
</td></tr>
<tr align="center">
<td>
<a href="admin_register.jsp">register a admin account click here</a>
</td>
</tr>
</table>
</div>
<!-- <input type="button" value="tex_Login" onclick="window.location.href='homepage.html'"> -->
</form>
</body>
</html>