<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controller.AdminDashboardServlet"%>
<%@page import="dao.AdminDashboard"%>
<%@page import="model.DashboardProduct"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Amazone Admin - Dashboard</title>

<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link rel="stylesheet" href="bootstrap/fontawesome/css/all.min.css"
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU"
	crossorigin="anonymous">

<!--Custom styles-->
<link href="bootstrap/admin-dashboard.css" rel="stylesheet"
	type="text/css">
</head>
<body id="page-top" >
	<%--Importing all the dependent classes--%>


	<nav class="navbar navbar-expand navbar-dark bg-dark static-top">

	<button class="btn btn-link btn-sm text-white order-1 order-sm-0"
		id="sidebarToggle" href="#">
		<i class="fas fa-bars"></i>
	</button>

	<!-- Navbar Search -->
	<form
		class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
		<div class="input-group">
			<input type="text" class="form-control" placeholder="Search for..."
				aria-label="Search" aria-describedby="basic-addon2">
			<div class="input-group-append">
				<button class="btn btn-primary" type="button">
					<i class="fas fa-search"></i>
				</button>
			</div>
		</div>
	</form>

	<!-- Navbar -->
	<ul class="navbar-nav ml-auto ml-md-0">
		<li class="nav-item dropdown no-arrow mx-1"><a
			class="nav-link dropdown-toggle" href="#" id="alertsDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-bell fa-fw"></i> <!--<span class="badge badge-danger">9+</span>-->
		</a> <!-- <div class="dropdown-menu dropdown-menu-right" aria-labelledby="alertsDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
          </div> --></li>
		<li class="nav-item dropdown no-arrow mx-1"><a
			class="nav-link dropdown-toggle" href="#" id="messagesDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-envelope fa-fw"></i>
		</a> <!-- <div class="dropdown-menu dropdown-menu-right" aria-labelledby="messagesDropdown">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Something else here</a>
          </div>--></li>
		<li class="nav-item dropdown no-arrow"><a
			class="nav-link dropdown-toggle" href="#" id="userDropdown"
			role="button" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false"> <i class="fas fa-user-circle fa-fw"></i>
		</a>
			<div class="dropdown-menu dropdown-menu-right"
				aria-labelledby="userDropdown">
				<!-- <a class="dropdown-item" href="#">Settings</a>
            <a class="dropdown-item" href="#">Activity Log</a>-->

				<div class="dropdown-divider"></div>
				<a class="dropdown-item" href="adminlogin.jsp">Logout</a>
			</div></li>
	</ul>

	</nav>

	<div id="wrapper">

		<!-- Sidebar -->
		<ul class="sidebar navbar-nav">
			<li class="nav-item active"><a class="nav-link"
				href="AdminDashboardServlet"> <i
					class="fas fa-fw fa-tachometer-alt"></i> <span>Dashboard</span>
			</a></li>

			<li class="nav-item"><a class="nav-link" href="product.jsp">
					<i class="fas fa-fw fa-plus"></i> <span>Add Product</span>
			</a></li>
			<li class="nav-item"><a class="nav-link"
				href="prod_update_index.jsp"> <i class="fas fa-fw fa-tag"></i> <span>Update
						Product</span></a></li>
			<li class="nav-item"><a class="nav-link" href="CustomerHist.jsp">
					<i class="fas fa-fw fa-book"></i> <span>Customer History</span>
			</a></li>
		</ul>

		<div id="content-wrapper">

			<div class="container-fluid">

				<!-- Breadcrumbs-->
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="#">Admin</a></li>
					<li class="breadcrumb-item active">Dashboard</li>
				</ol>

				<!-- Icon Cards-->
				<div class="row">
					<div class="col-xl-3 col-sm-6 mb-3">
						<div class="card text-white bg-primary o-hidden h-100">
							<div class="card-body">
								<div class="card-body-icon">
									<i class="fas fa-fw fa-calculator"></i>
								</div>
								<div class="mr-5">Total Available Products</div>
							</div>
							<a class="card-footer text-white clearfix small z-1" href="#" style="text-decoration: none">
								<span class="" style="font-size: 25px; text-align: center">
									<%=request.getAttribute("ProductTotal")%> <%if(request.getAttribute("ProductTotal")== null){
    				out.print("0");   
					}
						else {%> <%request.getAttribute("ProductTotal"); %> <% } %>
							</span>
							</a>
						</div>
					</div>
					<div class="col-xl-3 col-sm-6 mb-3">
						<div class="card text-white bg-danger o-hidden h-100">
							<div class="card-body">
								<div class="card-body-icon">
									<i class="fas fa-fw fa-list"></i>
								</div>
								<div class="mr-5">Product with Quantity less than 3</div>
							</div>
							<a class="card-footer text-white clearfix small z-1" href="#" style="text-decoration: none">
								<span class="" style="font-size: 25px; text-align: center">

									<%=request.getAttribute("ProductTotalLessThan3") %> <%if(request.getAttribute("ProductTotalLessThan3")== null){
    				out.print("0");   
					}
						else {%> <%request.getAttribute("ProductTotalLessThan3"); %> <% } %>


							</span>
							</a>
						</div>
					</div>

				</div>

				<!-- DataTables Example -->
				<div class="card mb-3">
					<div class="card-header">
						<i class="fas fa-table"></i> List of 7 recent Products
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table table-bordered" id="dataTable" width="100%"
								cellspacing="0">
								<thead>
									<tr>
										<th>Product Name</th>
										<th>Product Price</th>
										<th>Product Quantity</th>
										<th>Product Manufacturer</th>
									</tr>
								</thead>
								<tbody>


									<%  
// retrieve your list from the request, with casting 
ArrayList<DashboardProduct> list = (ArrayList<DashboardProduct>) request.getAttribute("ProductList");
System.out.println(request.getAttribute("ProductList"));
// print the information about every category of the list
for(DashboardProduct products : list) {
    %>
									<tr>
										<td><%= products.getProductName()%></td>
										<td><%= products.getProductPrice()%></td>
										<td><%= products.getProductQuantity()%></td>
										<td><%= products.getProductManufacturer()%></td>
									</tr>
									<%
}
%>




								</tbody>
							</table>
						</div>
					</div>
				</div>

			</div>
			<!-- /.container-fluid -->

			<!-- Sticky Footer -->
			<footer class="sticky-footer">
			<div class="container my-auto">
				<div class="copyright text-center my-auto">
					<span>Copyright Amazon 2018</span>
				</div>
			</div>
			</footer>

		</div>
		<!-- /.content-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->



	</div>
	</div>
	<script type="text/javascript" src="bootstrap/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="bootstrap/js/jquery.validate.min.js"></script>


</body>

</html>