<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--   <jsp:include page="DemoJsp1.jsp"></jsp:include>  --%>
   
<%--     <jsp:forward page="DemoJsp1.jsp"></jsp:forward> --%>

<%!String url = "http://www.google.co.in"; %>
	<%response.sendRedirect(url); %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo JSP2</title>
</head>
<body>
<h1 align="center">This is Demo JSP2</h1>
</body>
</html>