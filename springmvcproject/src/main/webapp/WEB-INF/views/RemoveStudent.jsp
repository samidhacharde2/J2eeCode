<%@page import="com.jspiders.springmvc.dto.StudentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp"></jsp:include>
<%
List<StudentDTO> students = (List<StudentDTO>) request.getAttribute("students");
%>
<%!int i;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove Student</title>
<style type="text/css">
fieldset {
	margin: auto;
	border-color: #0F0;
	width: 50%;
}

legend {
	width: 50%;
	text-align: center;
}
table {
  margin: auto;
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
tr {
	text-align: center;
}

table input {
	border: none;
	outline: none;
}
table tr td {
	padding: 6px 8px;
}
#details {
	margin-top: 30px;
}

#details th {
	background-color: #04AA6D;
}
#details td, #details th {
  border: 1px solid #ddd;
  padding: 5px;
  text-align: center;
}

body {
	background-size: 100%;
	background: SeaShell;
	animation: body 5s infinite;
}

@keyframes body {
  50% {background-color: NavajoWhite;}
  25% {background-color: Gainsboro;}
}

#remove {
	padding: 8px 30px;
	border-radius: 50px;
}

table #remove:hover {
	background-color: #0F0;
	cursor: pointer;
}
#details tr:nth-child(even){background-color: #f2f2f2;}

#details tr:hover {background-color: #ddd;}

</style>
</head>
<body>

	<fieldset>
		<legend>::: Select Student to Remove :::</legend>
		<form method="post" action="./removeStudent">
			<table>
				<tr>
					<td><label> Enter student Id:</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Remove" id="remove"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
	if (students != null) {
	%>
	<table style="width: 50%;" id="details">
		<tr>
			<th><h3>ID</h3></th>
			<th><h3>Name</h3></th>
			<th><h3>Email</h3></th>
		</tr>
		<%
		for (i = 0; i < students.size(); i++) {
		%>
		<tr>
			<td><%=students.get(i).getId()%></td>
			<td><%=students.get(i).getName()%></td>
			<td><%=students.get(i).getEmail()%></td>
		</tr>

		<%
		}
		%>

	</table>

	<%
	}
	%>


</body>
</html>