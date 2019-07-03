package com.everis.academia.java.agenda.digital.web.servlet.cidade.errors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "erro", urlPatterns = "/erro")

public class Erro extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletException servletException = (ServletException) req.getAttribute(RequestDispatcher.ERROR_EXCEPTION);

		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style=\"color:red; text-align:center\"> WARNING</h1>");
		out.println("</br>");
		out.println(servletException.getLocalizedMessage());
		out.println("</html>");
		out.println("</body>");
	}

}
