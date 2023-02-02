<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% 
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String contact=request.getParameter("contact");
    String city=request.getParameter("city");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>StudentDetails</title>
</head>
<body>
<table>
<tr>
<td> Name:</td>
<td><input type="text" name="name" ></td>
</tr>
<tr>
<td> Email:</td>
<td> <input type="text" name="email"></td>
</tr>
<tr> 
<td> Contact:</td>
<td> <input type="text" name="contact"></td>
</tr>
<tr> 
<td> City:</td>
<td> <input type="text" name="city"></td>
</tr>
<tr>
<td><input type="submit" value="Send"> </td>
</tr>
</table>

</body>
</html>