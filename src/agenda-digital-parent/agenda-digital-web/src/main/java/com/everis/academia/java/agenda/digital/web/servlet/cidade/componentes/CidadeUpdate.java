package com.everis.academia.java.agenda.digital.web.servlet.cidade.componentes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name = "cidadeupdate", urlPatterns = "/cidade/update")

public class CidadeUpdate extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ICidadeBusiness cidadebusiness = new CidadeBusiness();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// variavel do nome codigo do tipo Iterger que obtem um parametro nome de um
		// request
		// Integer.valueOf(request.getParameter("nome")) --- tranformacao de Interger em
		// string
		Integer codigo = Integer.valueOf(request.getParameter("codigo"));

		Cidade cidade = cidadebusiness.retorna(codigo);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action=\"" + request.getContextPath() + "/cidade/update/controller\" width=\"100%\">");
		out.println("<table border=\"1\">");
		out.println("<tr><td colspan=\"2\">Actualiazar</td></tr>");

		// get.codigo obtem o codigo
		out.println("<tr><td>Codigo:</td><td><input type=\"text\" name=\"codigo\" value=\"" + cidade.getCodigo()
				+ "\" /></td></tr>");
		out.println("<tr><td>Nome:</td><td><input type=\"text\" name=\"nome\" value=\"" + cidade.getNome()
				+ "\" /></td></tr>");

		out.println("<tr><td colspan=\"2\" align=\"center\">");
		out.println("<input type=\"submit\" value=\"Update\">");
		out.println("</td></tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
}
