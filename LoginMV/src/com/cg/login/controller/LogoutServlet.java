package com.cg.login.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession httpSession = request.getSession();
		if(httpSession.getAttribute("username")!=null)
		{
			httpSession.setAttribute("username", null);
			httpSession.invalidate();
			request.getRequestDispatcher("index.jsp").forward(request, response);
		
		}else
		{
			request.setAttribute("errms", "Login First");
			request.getRequestDispatcher("error.jsp").include(request, response);
			
		}
		
	}

}
