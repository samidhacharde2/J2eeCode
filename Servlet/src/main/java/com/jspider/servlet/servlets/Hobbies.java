package com.jspider.servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("./hobbies")
public class Hobbies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Hobbies() {
        super();

    }

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
	   response.setContentType("text/html");
       PrintWriter writer=response.getWriter();
       
	   String[] hobbies=request.getParameterValues("hobby");
	   
       writer.println("<h1>Your Selected Hobbies</h1>");
         for(String hobby:hobbies) {
        	 writer.println("<h3> +hobby+ </h3>");
         }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
