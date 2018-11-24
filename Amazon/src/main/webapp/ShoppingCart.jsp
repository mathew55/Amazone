<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="agile.TeamA.Vo.ShoppingCart_Vo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script language="JavaScript">
function CalculationTotal(){		
	var str = 0;
	var p01 = document.getElementById("p01");
	var checks = document.getElementsByName("checkitem");
	for ( var i = 0; i < checks.length; i++) {
		if (checks[i].checked) {
		var price=document.getElementsByName(i);	
			str += price.value;
		}
	}
	p01.innerHTML = str;
	
	
}
function finishpay(){		
		var str = "";
		var ids = document.getElementsByName("checkitem");
		var cid= document.getElementsByName("cusid");
		for ( var i = 0; i < ids.length; i++) {
			if (ids[i].checked) {
				str += ids[i].value + ",";
			}
		}
		if(str == ""){		
			alert("please select items!");
		}else{
			var tep = confirm("do you want to buy these select items?");
			if (tep) {
			location.href = "/Amazon/ShoppingCartServlet?ids=" + str + "&&cid="+ cid
			+ "&&type=getItems";	}
		}
		
}
	
function finishdel(){
		var str = "";
		var ids = document.getElementsByName("checkitem");
		var cid = document.getElementsByName("cusid");
		for ( var i = 0; i < ids.length; i++) {
			if (ids[i].checked) {
				str += ids[i].value + ",";
			}
		}
		if(str == ""){		
			alert("please select items!");
		}else{
			var tep = confirm("do you want to buy these select items?");
			if (tep) {
				location.href = "/Amazon/ShoppingCartServlet?ids=" + str + "&&cid="+ cid
				+ "&&type=del";}
		}		
		}
</script>
</head>
<body>
  <h1>MyShopping_Cart</h1>
  <a href="/Amazon/GotoHallUI"> continue shopping </a>
   <table border="1" style="border-collapse: collapse; width: 600px; ">
    <tr><th>select</th><th>itemID</th><th>itemName</th><th>unit price</th><th>Quantity</th></tr>
    <%
        ArrayList<ShoppingCart_Vo> ShoppingCart = (ArrayList<ShoppingCart_Vo>) request.getAttribute("Cart");
        Object cid = request.getAttribute("Customer_id");
        for(int i=0; i<ShoppingCart.size(); i++) {
        	ShoppingCart_Vo sc = ShoppingCart.get(i);
            %> 
            <tr>
               	<td><input type="checkbox" name="checkitem" value=<%=sc.getCartId() %> onclick="javascript: CalculationTotal();">              		
               		</td>               
                <td><input type="hidden" value=<%=sc.getProductID()%>> </td> 
                <td> <%=sc.getItemsName() %> </td>
                <td> <%=sc.getItemsPrice() %> </td>
                <td><%=sc.getitems_Quantity() %></td>
                <%-- <td><input type="text" name="item_Quantity" value="<%=sc.getitems_Quantity() %>" /></td> --%>
               <%--  <td> <input type="hidden" name=<%=i %> value=<%=sc.getTotalItemsPrice() %>><%=sc.getTotalItemsPrice()%> </td> --%>
                <%-- <td><a href="/Amazon/ShoppingCartServlet?type=del&id=<%=sc.getProductID() %>">DELETE</a></td> --%>
            </tr>       <%
        }
     %>
    <tr>
        <td colspan="6" id="totalvalue">total price:<span id="p01"></span>
        	<input type="hidden" name="cusid" value=<%=cid %>/>
        </td>
    </tr> 
     <tr>
        <td colspan="6"><input type="submit" value="buy" onclick="javascript: finishpay();">
        				<input type="submit" value="delete" onclick="javascript: finishdel();"></td>
    </tr>
   </table>
</body>

</html>