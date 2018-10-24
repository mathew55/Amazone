<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>

<body>
<h1>User Registration Form</h1>
	<div class="ex">
<form  name="form" action="RegistrationServlet" method="post">
<section>

<table style="with: 50%">

<tr>

</tr>


<tr>
 
 <td>Your Name</td>
 <td><input type="text" name="userFullName" /></td>
 </tr>

 <tr>
 </tr>
 <tr>
 
 <td>Email</td>
 <td><input type="text" name="email" /></td>
 </tr>

 <tr>
 </tr>

<tr>
 
 <td>Username</td>
 <td><input type="text"  name="username" /></td>
 </tr> 
 <tr>

</tr>
 <tr>
 
 <td>Password</td>
 <td><input type="password" name="password1" /></td>
 </tr>
 <tr>

</tr>
 <tr>
 
 <td>Re-enter Password</td>
 <td><input type="password" name="password2" /></td>
 </tr>
 <tr>

</tr>


 <tr>
 
</tr>

</table>
<input type="submit" value="Create your Account" name="regbutton">
<p>By creating an account, you agree to Amazone's Conditions of Use and Privacy Notice.<p>


</section>
 </form>
 </div>
</body>

</html>