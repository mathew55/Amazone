<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />

</head>
<body>
<div class="container">
<div class="row">
<div class="col-md-12">
<form role="form">
<div class ="col-md-6">
<div class="form-group col-xs-6">
<label for="productName">Product Name</label>
<input type="text" class="form-control" name="productName" id="productName" placeholder="Enter the Product Name" required="true">
</div>

<div class="form-group col-xs-6">
<label for="productDescription">Product Description</label>
<textarea class="form-control" name="productDescription" id="productDescription" placeholder="Enter the Product Description" required="true"></textarea>
</div>

<div class="form-group col-xs-6">
<label for="productManufacturer">Product Manufacturer</label>
<input type="text" class="form-control" name="productManufacturer" id="productManufacturer" placeholder="Enter the Product Manufacturer" required="true">
</div>
</div>

<div class="col-md-6 col-offset-1">
<div class="form-group col-xs-6">
<label for="productPrice">Product Price</label>
<input type="text" class="form-control" name="productPrice" id="productPrice" placeholder="Enter the Product Name" required="true">
</div>

<div class="form-group col-xs-6">
<label for="productQuantity">Product Quantity</label>
<input class="form-control" name="productQuantity" id="productDescription" placeholder="Enter the Product Description" required="true"/>
</div>

<div class="form-group col-xs-6">
<label for="exampleInputFile">File input</label>
<input type="file" id="exampleInputFile" class="form-control">
<p class="help-block">Example block-level help text here.</p>
</div>

</div>


<button type="submit" class="btn btn-default">Submit</button>
</form>
</div>
</div>
</div>
<script type=”text/javascript” src=”bootstrap/js/bootstrap.min.js”></script>
</body>
</html>