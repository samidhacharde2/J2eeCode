<%@ page import="com.jspiders.springmvc.dto.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="NavBar.jsp"></jsp:include>

<%
StudentDTO student = (StudentDTO) request.getAttribute("student");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
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
</style>

</head>
<body>
	<%
	if (student != null) {
	%>
	<h3>
		Welcome
		<%=student.getName()%></h3>
	<%
	}
	%>
</body>
</html>