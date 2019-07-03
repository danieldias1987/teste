package com.everis.academia.java.agenda.digital.web.servlet.cidade.componentes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hello", urlPatterns = "/hello")

public class Hello extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Pagina teste");
		out.println("</br>");
		out.println("</br>");
		out.println("<a href=\"cidade/create\" target=\"self\"><input type=\"submit\" Value=\"Criar Cidade\"></a>");
		out.println("<a href=\"lista/cidades\" target=\"self\"><input type=\"submit\" Value=\"Lista de Cidades\"></a>");
		out.println("</body>");
		out.println("</html>");

	}

}