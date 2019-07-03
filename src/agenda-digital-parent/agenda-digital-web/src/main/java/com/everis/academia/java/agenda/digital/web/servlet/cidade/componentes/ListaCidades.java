package com.everis.academia.java.agenda.digital.web.servlet.cidade.componentes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.web.servlet.cidade.basedados.BaseDados;

@WebServlet(name = "listacidades", urlPatterns = "/lista/cidades")

public class ListaCidades extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=\"1\">");
		out.println("<tr><td colspan=\"5\">Parametros Recebido</td></tr>");
		out.println("<tr><th>Id</th><th>Nome</th><th colspan=\"2\">Ação</th></tr>");

		for (Cidade cidade : BaseDados.cidades) {
			out.println("<tr><td>" + cidade.getCodigo() + "</td><td>" + cidade.getNome() + "</td><td>" + "<a href=\""
					+ req.getContextPath() + "/cidade/update?codigo=" + cidade.getCodigo()
					+ "\" class=\"button\">Update</a>" + "</td><td><a href=\"" + req.getContextPath()
					+ "/cidade/delete/controller?codigo=" + cidade.getCodigo() + "\" class=\"button\">Delete</a>"
					+ "</td></tr>");
		}
		out.println("</table>");
		out.println("</br>");
		out.println("<a href=\"" + req.getContextPath()
				+ "/cidade/create\" target=\"self\"><input type=\"submit\" Value=\"Criar Cidade\"></a>");
		out.println("<a href=\"" + req.getContextPath()
				+ "/hello\" target=\"self\"><input type=\"submit\" Value=\"Inicio\"></a>");
		out.println("</body>");
		out.println("</html>");
	}

}
