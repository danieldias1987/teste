package com.everis.academia.java.agenda.digital.web.servlet.cidade.componentes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cidadecreate", urlPatterns = "/cidade/create")

public class CidadeCreate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=\"" + request.getContextPath() + "/cidade/controller\">");
		out.println("<table border=\"1\">");
		out.println("<tr><td colspan=\"2\">Adiconar Cidade</td></tr>");
		out.println("<tr><td>Nome:</td><td><input type=\"text\" name=\"nome\"/></td></tr>");
		out.println("<tr><td colspan=\"2\" align=\"center\">");
		out.println("<input type=\"submit\" value=\"Criar\">");
		out.println("<input type=\"reset\" value=\"Limpar\"/>");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href=\"" + request.getContextPath()
				+ "/hello\" target=\"self\"><input type=\"submit\" Value=\"Inicio\"></a>");
		out.println("</body>");
		out.println("</html>");

	}

}
