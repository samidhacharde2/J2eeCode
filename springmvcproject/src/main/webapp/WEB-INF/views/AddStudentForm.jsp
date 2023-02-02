<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<jsp:include page="NavBar.jsp"></jsp:include>

<%
String name = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<style type="text/css">
body {
	background-color: WhiteSmoke;
	background: SeaShell;
	animation: body 5s infinite;
}
@keyframes body {
  50% {background-color: NavajoWhite;}
  25% {background-color: Gainsboro;}
}
fieldset {
	margin: auto;
	border-color: #0F0;
	width: 50%;
}

legend {
	width: 50%;
}

table {
	
	display: flex;
	justify-content: center;
}

table input {
	border: none;
	outline: none;
}
table tr td {
	padding: 6px 8px;
}
table #submit {
	padding: 8px 30px;
	border-radius: 50px;
	
}
table #submit:hover {
	background-color: #0F0;
	cursor: pointer;
}
</style>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: PaleGoldenrod">

	<fieldset>
		<legend style="text-align: Center">:: Insert Student Details
			:: </legend>
		<form method="post" action="./addStudent">
			<table>
				<tr>
					<td><label> Name :</label></td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td><label> Email :</label></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td><label> userName :</label></td>
					<td><input type="text" name="userName"></td>
				</tr>

				<tr>
					<td><label> Password :</label></td>
					<td><input type="text" name="password"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Add Student" id="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	if (name != null) {
	%>
	<h3>Successfully Added</h3>
	<%=name%>
	<%
	}
	%>
</body>
</html>