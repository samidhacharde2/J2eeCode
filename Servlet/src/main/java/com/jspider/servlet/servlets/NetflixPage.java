package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NetflixPage extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter write=resp.getWriter();
	
	write.println("<img style=width=100 height=100 background-image=/Servlet/src/main/webapp/WEB-INF/IN-en-20221228-popsignuptwoweeks-perspective_alpha_website_medium.jpg;  ");
//	write.println("<a href=index.html></a>");
	}

}
