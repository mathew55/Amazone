<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="model.CustomerHist" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>CUustomerHist</h1>
   <table border="1" style="border-collapse: collapse; width: 600px; ">
    <tr><th>FirstName</th><th>LastName</th><th>product_Name</th><th>product_Price</th><th>product_Quantity</th></tr>
    <%
        ArrayList<CustomerHist> CustomerHist = (ArrayList<CustomerHist>) request.getAttribute("CustomerHistlist");
        for(int i=0; i<CustomerHist.size(); i++) {
        	CustomerHist ch = CustomerHist.get(i);
            %>
            <tr>
                <td><%=ch.getcustomer_firstname() %></td>
                <td><%=ch.getcustomer_lastname()%></td>
                <td><%=ch.getproductName() %></td>
                <td><%=ch.getproductPrice() %></td>
                 <td><%=ch.getproductQuantity() %></td>
            </tr>
            <%
        }
     %>
   </table>
</body>
</html>