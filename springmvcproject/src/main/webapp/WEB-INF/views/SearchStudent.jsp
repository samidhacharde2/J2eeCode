<%@page import="java.util.List"%>
<%@page import="com.jspiders.springmvc.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp"></jsp:include>
<%
List<StudentDTO> students = (List<StudentDTO>) request.getAttribute("students");
String msg = (String) request.getAttribute("msg");
StudentDTO student = (StudentDTO) request.getAttribute("student");
%>
<%! int i; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: WhiteSmoke;
	background: SeaShell;
	animation: body 5s infinite;
	background-size: 100%;
}

@
keyframes body { 
50% {background-color: NavajoWhite;}
25%{background-color:Gainsboro;}
}
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
  margin-top:30px;
  border-collapse: collapse;
  width: 100%;
}

table #search {
	padding: 8px 30px;
	border-radius: 50px;
}
th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}
tr {
	text-align: center;
}
table tr td {
	padding: 6px 8px;
}

table input {
	border: none;
	outline: none;
}
#search th {
	background-color: #04AA6D;
}

table #search:hover {
	background-color: #0F0;
	cursor: pointer;
}

#details tr:nth-child(even) {
	background-color: #f2f2f2;
}

#details tr:hover {
	background-color: #ddd;
}
#search td, #search th {
  border: 1px solid #ddd;
  padding: 5px;
  text-align: center;
}
#details tr:nth-child(even){background-color: #f2f2f2;}

#details tr:hover {background-color: #ddd;}

</style>
</head>
<body>
	<fieldset>
		<legend>:::Search Student :::</legend>
		<form method="post" action="./searchStudent">
			<table>
				<tr>
					<td><label>Enter Student ID</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Search" id="search"></td>
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
	if (student != null) {
	%>
	<table style="width: 100%;" id="search">
		<tr>
			<th><h3>ID</h3></th>
			<th><h3>Name</h3></th>
			<th><h3>Email</h3></th>
			<th><h3>User Name</h3></th>
			<th><h3>Password</h3></th>
		</tr>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getUserName()%></td>
			<td><%=student.getPassword()%></td>
		</tr>
	</table>
	<%
	}
	%>

</body>
</html>