<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<title>Admin Login Page</title>
   
	<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	
	<link rel="stylesheet" href="bootstrap/fontawesome/css/all.min.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link href= "bootstrap/login.css" rel="stylesheet" type="text/css">
</head>
<body background="images/loginImage.jpg">

<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h4>AMAZON Admin LogIn Page</h4>
				<p style="color: red; font-size: 15px"><%
   					 if(null!=request.getAttribute("error"))
    					{
        						out.println(request.getAttribute("error"));
   						 }
				%></p>
			</div>
			<div class="card-body">
				<form action="/Amazon/AdminLogin_Servlet" method="post" onSubmit="return validate()">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="User Name" name="AdminName" required="true">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" name="AdminPwd" required="true">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="admin_register.jsp" class="a-links">Sign Up</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#" class="a-links">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
</div>
<script type ="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type ="text/javascript" src="bootstrap/js/jquery.validate.min.js"></script>
<script>
function validate() {
	
if (document.forms[0].name.value=="") {
alert("Please Enter your Admin Username and Password !");
return false;
}
return true;
}


</script>
</body>
</html>



