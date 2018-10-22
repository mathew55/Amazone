<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<title>Insert title here</title>
<script language="JavaScript">
/* function correctPNG() {
	var arVersion = navigator.appVersion.split("MSIE")
	var version = parseFloat(arVersion[1])
	if ((version >= 5.5) && (document.body.filters)) {
		for ( var j = 0; j < document.images.length; j++) {
			var img = document.images[j]
			var imgName = img.src.toUpperCase()
			if (imgName.substring(imgName.length - 3, imgName.length) == "PNG") {
				var imgID = (img.id) ? "id='" + img.id + "' " : ""
				var imgClass = (img.className) ? "class='" + img.className
						+ "' " : ""
				var imgTitle = (img.title) ? "title='" + img.title + "' "
						: "title='" + img.alt + "' "
				var imgStyle = "display:inline-block;" + img.style.cssText
				if (img.align == "left")
					imgStyle = "float:left;" + imgStyle
				if (img.align == "right")
					imgStyle = "float:right;" + imgStyle
				if (img.parentElement.href)
					imgStyle = "cursor:hand;" + imgStyle
				var strNewHTML = "<span "
						+ imgID
						+ imgClass
						+ imgTitle
						+ " style=\""
						+ "width:"
						+ img.width
						+ "px; height:"
						+ img.height
						+ "px;"
						+ imgStyle
						+ ";"
						+ "filter:progid:DXImageTransform.Microsoft.AlphaImageLoader"
						+ "(src=\'" + img.src
						+ "\', sizingMethod='scale');\"></span>"
				img.outerHTML = strNewHTML
				j = j - 1
			}
		}
	}
}
window.attachEvent("onload", correctPNG);
function _refeshimg() {
	document.getElementById("imgs").src = "ImageServlet?r=" + Math.random();
} */
	/* use this part to check register information */
	function checkinfo() {
		var adfirstname = document.frm1.FirstName.value;
		var adlastname = document.frm1.LastName.value;
		var adname = document.frm1.AdminName.value;
		var adpwd = document.frm1.AdminPwd.value.toLowerCase();
		var advtypwd = document.frm1.vtyAdminPwd.value.toLowerCase();
		var c1 = document.getElementById("c01");
		var c2 = document.getElementById("c02");
		var c3 = document.getElementById("c03");
		var c4 = document.getElementById("c04");
		var c5 = document.getElementById("c05");
		var tep = 0;
		var flg = 0;
		/* verfity adminname*/
		if (adname == "") {
			c5.innerHTML = "Please input admin name!";
			tep = 1;
		} else {
			c5.innerHTML = "";
		}
		/* verfity adminfirstname */
		if (adfirstname == "") {
			c1.innerHTML = "Please input admin firstname";
			tep = 1;
		} else {
			c1.innerHTML = "";
		}
		/* verfity adlastname*/
		if (adlastname == "") {
			c2.innerHTML = "Please input admin lastname!";
			tep = 1;
		} else {
			c2.innerHTML = "";
		}
		/*verfity adminpwd  */
		if (adpwd == "") {
			c3.innerHTML = "Please input admin password!";
			tep = 1;
		} else {
			c3.innerHTML = "admin password is good";
		}
		/*verfity admin password tow times is same  */
		 if (advtypwd == adpwd && advtypwd!=""&& adpwd!="") {
			c4.innerHTML = "two time password is same";
			tep = 1;
		} else {
			c4.innerHTML = "two time password is not same!";
		} 
		//var vl = "^[A]{1}[T]{1}[0-9]{8}$";
		var vl = "^[A]{1}[0-9]{8}$";
		var jm = new RegExp(vl);
		var te = jm.test(adname);
		if (te == true) {
			c5.innerHTML = "AdminID is good";
		} else {
			c5.innerHTML = "Your AdminID is illegal";
			flg = 1;
		}
		if (tep == 0 && flg == 0) {
			alert("admin register scuessful");
			return true;
		} else {
			alert("your information have wrong!");
			return false;
		}
	}
	/*  verfity password as same */
	/* function checkpwd() {
		var adpwd = document.frm1.AdminPwd.value;
		var advtypwd = document.frm1.vtyAdminPwd.value;
		if (advtypwd.equals(adpwd)) {
			c3.innerHTML = "two time password is same";
			tep = 1;
		} else {
			c3.innerHTML = "two time password is not same!";
		}
	}
	 */
	/* use this part to cancle register */
	function cancle() {
		var tem = confirm("Would you like cancle register?");
		if (tem) {
			window.close();
		}
	}
</script>
</head>
<body>
	<div>
		<table align="center">
			<tr>
				<td>
					<h2>Administrator registration</h2>
				</td>
			</tr>
		</table>
	</div>
	<!-- main show -->
	<form name="frm1" action="/Agile/AdminRegister_Servlet" method="post">
		<div>
			<table align="center" cellSpacing="0" cellPadding="0" border="1"
				width="28%" id="table211" height="328">
				<tr>
					<td align="center">AdminName:&nbsp;&nbsp;</td>
					<td colspan="2"><input name="AdminName" type="text"> <span
						id="c05">A+ 8 numbers</span></td>
				</tr>
				<tr>

					<td align="center">FirstName:&nbsp;&nbsp;</td>
					<td colspan="2"><input type="hidden" value="register"
						name="type" /> <input name="FirstName" type="text"><span
						id="c01"></span></td>
				</tr>
				<tr>
					<td align="center">LastName:&nbsp;&nbsp;</td>
					<td colspan="2"><input name="LastName" type="text"><span
						id="c02"></span></td>
				</tr>
				<tr>
					<td align="center">Password:&nbsp;&nbsp;</td>
					<td colspan="2"><input name="AdminPwd" type="password"><span
						id="c03"></span></td>
				</tr>
				<tr>
					<td align="center">VerityPassword:&nbsp;&nbsp;</td>
					<td colspan="2"><input name="vtyAdminPwd" type="password">
						<span id="c04"></span></td>
				</tr>


				<!-- <tr>
					<td align="center">VerificationCode:&nbsp;&nbsp;</td>
					<td colspan="2"><input name="verifty" type=text maxLength=4
						size=10> <img id="vcimgs" src="/Agile/VCImages"> <a
						href="javascript:_refeshimg();">change</a></td>
				</tr> -->
			</table>
			<br>
			<table align="center">
				<tr>
					<td width="50%"><input name="register" type="submit"
						value="register" onclick="javascript:return checkinfo();"></td>

					<td width="50%"><input type="button" value="cancle"
						onclick="javascript: cancle();"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>