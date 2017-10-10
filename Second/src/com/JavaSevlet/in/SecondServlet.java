package com.JavaSevlet.in;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class SecondServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String un=request.getParameter("username");
		  String pw=request.getParameter("password");
		  
		  if(un.equals("raji") && pw.equals("flash123"))
		  {
		   response.sendRedirect("success.html");
		   return;
		  }
		  else
		  {
		   response.sendRedirect("error.html");
		   return;
		  }
		 }
}
