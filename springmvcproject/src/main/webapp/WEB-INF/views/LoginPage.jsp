<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	margin: 0px;
	padding: 0px;
	background-color: Gainsboro;
}

fieldset {
	border-color: #0F0;
	margin: auto;
	width: 50%;
	box-shadow: 0 2px 2px #0F0;
}

legend {
	width: 50%;
	font-size: 30px;
	text-align: center;
	color: DimGray;
	animation: legend 5s infinite;
}

@keyframes legend {
  50% {color: #FF4500;}
}

table {
	display: flex;
	justify-content: center;
}

table input {
	outline: none;
	border: none;
}
table tr td {
	padding: 6px 8px;
}

table #submit {
	padding: 8px 30px;
	background-color: #0F0;
	border-radius: 50px;
}

table #submit:hover {
	background-image: linear-gradient(to right, red, yellow);
	cursor: pointer;
}
</style>




</head>
<body>
	<fieldset>
		<%
		if (msg != null) {
		%>
		<%=msg%>
		<%
		}
		%>
		<legend>::: Login Page :::</legend>
		<form method="post" action="./home">
			<table>
				<tr>
					<td><label> UserName:</label></td>
					<td><input type="text" name="userName" placeholder="user Name"></td>
				</tr>

				<tr>
					<td><label> password :</label></td>
					<td><input type="text" name="password" placeholder="password"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Login" id="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>