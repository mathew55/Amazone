<%@ page import="java.util.*" %>
<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
<%@page import="java.util.Iterator"%> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script language="JavaScript">
  function additems(){
	  	  var cid= document.getElementsByName("userid");
	  location.href = "/Amazon/ShoppingCartServlet?ids=1"+"&&cid=1"+"&&type=addcart";
	  alert("add item successful!");
  }
  
  
  
  </script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
  
</head>
<body>


<div class="jumbotron">
  <div class="container text-center">
    <h1>Amazone</h1>      
    <p>The Best Shop On the Web</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">Products</a></li>
        <li><a href="#">Deals</a></li>
        <li><a href="#">Stores</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href=""><span class="glyphicon glyphicon-user"></span>welcome: Joe Mullins</a>
        			 <input type="hidden" name="userid" value="1"/>
        	</li>
        <li><a href="/Amazon/ShoppingCartServlet?type=mycart&&Customer_id=1"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container">    
  <div class="row">


    <div class="col-sm-4">  
    
      <div class="panel panel-primary">
        <div class="panel-heading" name="product_Name">Name = fitbit<%=request.getAttribute("product_Name")%></div>
        <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Buy 50 mobiles and get a gift card    <input type="button" value="add to Cart" onclick="javascript: additems();"></div><%-- 
       <input type="text" name="product_Name" value='<%=request.getAttribute("product_Name")%>'/> --%>
      </div>
       </div> 
  </div>

</div><br>


<footer class="container-fluid text-center">
  <p>Online Store Copyright</p>  
  <form class="form-inline" method="get" action="Search">Look for Items:
    <input type="search" class="form-control" size="50" placeholder="Search" name="searchProduct">
    <button type="submit" class="btn btn-danger">Search</button>
  </form>
</footer>

</body>
</html>