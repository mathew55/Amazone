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
<div class="col-lg-12">
<h2 class ="text-dark header-title"><span><i class="fa fa-tag"></i>Add New Products</span></h2>
<div class="row">

<div class="col-md-12">

<form class="form-horizontal" method="post" action="AddProductServlet" enctype="multipart/form-data" role="form" id="createProduct">

<div class ="row">
<div class="col-md-8 col-md-offset4">
<div class="form-group">

<label class="col-md-3 control-label" for="productName"> Product Name</label>

<div class="col-md-9">
<input class="form-control" type="text" name="productName" id="productName" placeholder="Enter the Product Name" required="true">
</div>

</div>

<div class="form-group">

<label class="col-md-4 control-label" for="productManufacturer"> Product Manufacturer</label>

<div class="col-md-9">
<input class="form-control" type="text" name="productManufacturer" id="productManufacturer" placeholder="Enter the Product Manufacturer" required="true">
</div>

</div>
<div class="form-group">

<label class="col-md-3 control-label" for="productPrice"> Product Price</label>

<div class="col-md-9">
<input class="form-control" type="text" name="productPrice" id="productName" placeholder="Enter the Product Price" required="true">
</div>

</div>

<div class="form-group">

<label class="col-md-4 control-label" for="productDescription"> Product Description</label>

<div class="col-md-9">
<textarea class="form-control" name="productDescription" id="productDescription" placeholder="Enter the Product Description" required="true"></textarea>
</div>

</div>

<div class="form-group">

<label class="col-md-4 control-label" for="productQuantity">Product Quantity</label>

<div class="col-md-9">
<input class="form-control" type="text" name="productQuantity" id="productQuantity" placeholder="Enter the Product Quantity" required="true">
</div>

</div>

<div class="form-group">

<label class="col-md-3 control-label" for="inputFile"> File Input</label>

<div class="col-md-9">
<input class="form-control" type="file" name="inputFile" id="inputFile" size="50">
</div>

</div>



<div class="form-group">
<div class="col-md-6 col-md-offset-5">
<button type="submit" class="btn btn-success waves-effect waves-light">
	<span class="btn-label">
	Save
	<i class="fa fa-save"></i>
	</span>
	
</button>
<button type="reset" class="btn btn-danger waves-light">
	<span class="btn-label">
	Cancel
	<i class="fa fa-times"></i>
	
	</span>
</button>

<a href="AdminDashboardServlet" class="btn waves-light">
	<span class="btn-label">
	Back
	<i class="fa fa-backward"></i>
	
	</span>
</a>
</div>
</div>

</div>
</div>
</form>
</div>

</div>
</div>
</div>

<script type ="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<script type ="text/javascript" src="bootstrap/js/jquery.validate.min.js"></script>
<script type ="text/javascript">

$(function () {
	
	$('#createProduct').validate({
		
		rules:{
			productName: "required",
			productDescription: "required",
			productPrice: 
				{
				required: true,
				number: true,
				},
				
			productQuantity: {
				required: true,
				number: true,
				},
		},
		
		messages: {
			productName: "Please Enter the Product Name",
			productDescription: "Please Enter the Product Description to describe the product",
		    productPrice: {
		      required: "Please Enter the Product Price",
		      number: "Please enter a digit for the Product Price"
		    },
		    productQuantity: {
			      required: "Please Enter the Product Quantity",
			      number: "Please enter a digit for the Product Quantity"
			    }
		  }
	});
	
})


</script>
</body>
</html>