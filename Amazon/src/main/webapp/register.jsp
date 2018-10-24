<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <style>
* {
    box-sizing: border-box;
}

body {
    font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
    background-color: #666;
    padding: 30px;
    text-align: center;
    font-size: 35px;
    color: white;
}

/* Create two columns/boxes that floats next to each other */
nav {
    float: left;
    width: 30%;
    height: 300px; /* only for demonstration, should be removed */
    background: #ccc;
    padding: 20px;
}

/* Style the list inside the menu */
nav ul {
    list-style-type: none;
    padding: 0;
}

article {
    float: left;
    padding: 20px;
    width: 70%;
    background-color: #f1f1f1;
    height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
    content: "";
    display: table;
    clear: both;
}

/* Style the footer */
footer {
    background-color: #777;
    padding: 10px;
    text-align: center;
    color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
    nav, article {
        width: 100%;
        height: auto;
    }
}
</style>
<body>
<form  name="form" action="RegistrationServlet" method="post">
<section>
<nav>
<img src="file:///C:/Users/Shoma/eclipse-workspace/Amazon/WebContent/images/ama.jpg" style="width:100%">
<table style="background-color: blue; width:100%;" >
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
<p>By creating an account, you agree to Amazon's Conditions of Use and Privacy Notice.<p>
</nav>

</section>
 </form>
</body>

</html>