<%@page import="com.jspiders.springmvc.dto.StudentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<jsp:include page="NavBar.jsp"></jsp:include>
	
<%
List<StudentDTO> students = (List<StudentDTO>) request.getAttribute("students");
String msg = (String) request.getAttribute("msg");
StudentDTO student = (StudentDTO) request.getAttribute("student");
%>
<%!int i;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student</title>
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
body {
	background-color: WhiteSmoke;
	background: SeaShell;
	animation: body 5s infinite;
	background-size: 100%;
}

@keyframes body {
  50% {background-color: NavajoWhite;}
  25% {background-color: Gainsboro;}
}

#vis {
	visibility: hidden;
}
table input {
	border: none;
	outline: none;
}
table tr td {
	padding: 6px 8px;
}
table #update {
	padding: 8px 30px;
	border-radius: 50px;
}
table #select {
	padding: 8px 30px;
	border-radius: 50px;
}
table #update:hover {
	background-color: #0F0;
	cursor: pointer;
}

table #select:hover {
	background-color: #0F0;
	cursor: pointer;
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

#details tr:nth-child(even){background-color: #f2f2f2;}

#details tr:hover {background-color: #ddd;}

</style>
</head>
<body>
	<%
	if (student != null) {
	%>
	<fieldset>
		<legend>:::Update Student:::</legend>
		<form method="post" action="./updateStudentData">
			<table>
				<tr>
					<td><label>Student Id</label></td>
					<td><input type="text" name="id" value="<%=student.getId()%>" id="vis"></td>
				</tr>
				<tr>
					<td><label>Name</label></td>
					<td><input type="text" name="name" value="<%=student.getName()%>"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="text" name="email" value="<%=student.getEmail()%>"></td>
				</tr>
				<tr>
					<td><label>User Name</label></td>
					<td><input type="text" name="userName" value="<%=student.getUserName()%>"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="text" name="password" value="<%=student.getPassword()%>"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Update" id="update"></td>
				</tr>
			</table>

		</form>
	</fieldset>
	<%
	} else {
	%>
	<fieldset>
		<legend>:::Select Student to Update:::</legend>
		<form method="post" action="./updateStudent">
			<table>
				<tr>
					<td><label>Enter Student ID</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Select" id="select"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	if (msg != null) {
	%>
	<h3><%=msg%></h3>
	<%
	}
	%>
	<%
	if (students != null) {
	%>
	<table style="width: 100%;" id="details">
		<tr>
			<th><h3>ID</h3></th>
			<th><h3>Name</h3></th>
			<th><h3>Email</h3></th>
			<th><h3>User Name</h3></th>
			<th><h3>Password</h3></th>
		</tr>
		<%
		for (i = 0; i < students.size(); i++) {
		%>
		<tr>
			<td><%=students.get(i).getId()%></td>
			<td><%=students.get(i).getName()%></td>
			<td><%=students.get(i).getEmail()%></td>
			<td><%=students.get(i).getUserName()%></td>
			<td><%=students.get(i).getPassword()%></td>
		</tr>

		<%
		}
		%>

	</table>

	<%
	}
	%>
	<%
	}
	%>
</body>
</html>