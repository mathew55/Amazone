<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
	#header {
    width: 100%;
    background-color: red;
    height: 30px;
}

#container {
    width: 300px;
    background-color: #ffcc33;
    margin: auto;
}
#first {
    width: 100px;
    float: left;
    height: 300px;
        background-color: blue;
}
#second {
    width: 200px;
    float: left;
    height: 300px;
    background-color: green;
}
#clear {
    clear: both;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id="header"></div>
<div id="container">
    <div id="first"></div>
    <div id="second"></div>
    <div id="clear"></div>
</div>
</body>
</html>