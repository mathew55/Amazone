<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<!-- <link href="css/skin.css" rel="stylesheet" type="text/css" />
<link href="/admindashboard/css/css.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> -->
<style type="text/css">
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #EEF2FB;
}
</style>
<script type="text/javascript">
function fun(){
var dpno=document.frm1.itid.value;
var dpname=document.frm1.itname.value;
var s1=document.getElementById("s01");
var s2=document.getElementById("s02");
var tep=0;
var flg=0;
if(dpno==""){
s1.innerHTML="Please input items number";
tep=1;

}else{
s1.innerHTML="";
}
if(dpname==""){
s2.innerHTML="Please input items name!";
tep=1;
}else{
s2.innerHTML="";
}
var vl="^[I]{1}[T]{1}[0-9]{3}$";
var jm=new RegExp(vl);
var te=jm.test(dpno);
if(te==true){
s1.innerHTML="";
}else{
s1.innerHTML="Your item number is illegal";
flg=1;
}
if(tep==0&&flg==0){
alert("add item scuessful");
return true;
}else{
alert("your item information have wrong!");
return false;
}
}

function backto(){
var tem=confirm("Would you like finish this page?");
if (tem){
window.close();
}
}
</script>
</head>


<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" valign="top"></td>
			<td valign="top">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" class="left_topbg" id="table2">
					<tr>
						<td height="31">
						<div class="titlebt" align="center">ITEM MANAGEMENT</div>
						</td>
					</tr>
				</table>
			</td>
			<td width="16" valign="top" ></td>
		</tr>
		<tr>
			<td valign="middle" >&nbsp;</td>
			<td valign="top" bgcolor="#F7F8F9">
				<table width="98%" border="0" align="center" cellpadding="0"
					cellspacing="0">
					<tr>
						<td>
							<div id="main-show">
								<center>
									<div id="table-show" style="width:420px; align='center'">ADD NEW ITEMS</div>

									<form name="frm1" action="/admindashboard/ADDItem_Servlet"
										method="post">
										<table style="width:480px; ">
											<tr align="center">
												<th>ADD NEW ITEM</th>
											</tr>
											<!--add item ID  -->
											<tr>
												<td>Product ID</td>												
												<td style="text-align:left; "><input type="hidden"
													value="add" name="type" /> <input name="itid" type="text"
													size="30">
													<br>
													<span id="s01">format is “IT”+three numbers</span></td>
											</tr>
											<!-- add item name -->
											<tr>
												<td>Product name</td>
												<td style="text-align:left; "><input name="itname"
													type="text" size="30"><span id="s02"></span></td>
											</tr>		
											<!--add item price  -->
											<tr>
												<td>Product price</td>
												<td style="text-align:left; "><input name="itprice"
													type="text" size="30"><span id="s03"></span></td>
											</tr>					
											<!--ADD ITEM NUMBER  -->
											<tr>
												<td>ITEM NUMBER</td>
												<td style="text-align:left; "><input name="itnumber"
													type="text" size="30"><span id="s04"></span></td>
											</tr>
											<!-- ADD ITEM  INTRODUCTION-->
											<tr>
												<td>Product  Discription</td>
												<td style="text-align:left; "><input name="itintroduction"
													type="text" size="100" ><span id="s05"></span></td>
											</tr>
											<!-- ADD ITEM  GRAPH-->
											<tr>
												<td>Product  image</td>
												<td style="text-align:left; "><input type="button" value="select from" onclick=""></td>
											</tr>
												<td>&nbsp;</td>
												<td><input type="submit" name="button1" value="save"
													onclick="javascript:return fun();"> 
													<input type="button" value="return" 
													onclick="javascript: backto();">
													</td>								
											</tr>
										</table>
									</form>
								</center>
							</div>
						</td>
					</tr>
					<tr>
						<td height="40" colspan="4"><table width="100%" height="1"
								border="0" cellpadding="0" cellspacing="0" bgcolor="#CCCCCC">
							</table></td>
					</tr>	
				</table></td>
			<td >&nbsp;</td>
		</tr>
		<tr>
			<td valign="bottom"></td>
			<td>&nbsp;</td>
			<td valign="bottom"></td>
		</tr>
	</table>
</body>
</html>