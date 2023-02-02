<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String contact = request.getParameter("contact");
String city = request.getParameter("city");

Connection connection = null;
PreparedStatement preparedStatement = null;
int result = 0;
String driverPath = "com.mysql.cj.jdbc.Driver";
String dburl = "jdbc:mysql://localhost:3306/wejm4";
String user = "root";
String pass = "root";
String query = "insert into student values (?,?,?,?)";
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
	<table>
		<tr>
			<td>Name :</td>
			<td><%= name%></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><%= email%></td>
		</tr>
		<tr>
			<td>Contact :</td>
			<td><%= contact%></td>
		</tr>
		<tr>
			<td>City :</td>
			<td><%= city%></td>
		</tr>
	</table>
	<%
	try{
	Class.forName(driverPath);
	connection = DriverManager.getConnection(dburl,user,pass);
	preparedStatement = connection.prepareStatement(query);
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, email);
	preparedStatement.setString(3, contact);
	preparedStatement.setString(4, city);
	result = preparedStatement.executeUpdate();
	if(result != 0){
	%>
	<h3>
	<%=result%> 
	row(s) affected
	</h3>
	<%
	}
	} catch (Exception e) {
	%>
	
	<%=e%>
	<%
	}
	%>

</body>
</html>