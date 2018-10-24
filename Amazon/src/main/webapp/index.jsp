<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.mySlides {display:none;}
</style>
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
</head>
<body>
<header>
 

<h2 class="w3-center"><b>AMAZON</b></h2>
</header>

<div class="w3-content w3-display-container">

  <img class="mySlides" src="images/1.jpg" style="width:100%">
  <img class="mySlides" src="images/2.jpg" style="width:100%">
  <img class="mySlides" src="images/3.jpg" style="width:100%">
  <img class="mySlides" src="images/4.jpg" style="width:100%">
  <img class="mySlides" src="images/5.jpg" style="width:100%">
  <img class="mySlides" src="images/6.jpg" style="width:100%">
   <img class="mySlides" src="images/8.jpg" style="width:100%">

     <img class="mySlides" src="images/10.jpg" style="width:100%">
   
  

  <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
  <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
</div>


<script>
var slideIndex = 1;
showDivs(slideIndex);

function plusDivs(n) {
  showDivs(slideIndex += n);
}

function showDivs(n) {
  var i;
  var x = document.getElementsByClassName("mySlides");
  if (n > x.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = x.length}
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";  
  }
  x[slideIndex-1].style.display = "block";  
}
</script>




<form action="LoginServlet" method="post">
<section>
<nav>
<div class="div1">
<h1><b>Already have an Account ? <br>Sign in for best experiences</b></h1>
<table style="background-color: blue;" >

 <tr>

 <td>Username</td>
 <td><input type="text" name="username" /></td>
 </tr>
 <tr>
 
 <td>Password</td>
 <td><input type="password" name="password" /></td>
 </tr>

 <tr>
 

 <td><input type="submit" value="Login"></input></td>
<td> <input type="reset" value="Reset"></input></td>
 </tr>
</table>
</div>

</nav>
<article>
   
  
<div class="div2" style="background-color:aqua; color:white;padding:120px;" >
<h1><b>New to Amazon? <br>Sign up for best experiences</b></h1>
<input type="submit" value="SignUp" name="button1">

</div>

</article>
</section>
<div>
<footer>
<img src = "images/admin.jpg" alt = "Administrator" style = "width:100px;">
<input type= "button" value ="Administrator" name= "button2" onclick="window.location.href='adminlogin.jsp'">
</footer>
</div>
</form>
</body>
</html>