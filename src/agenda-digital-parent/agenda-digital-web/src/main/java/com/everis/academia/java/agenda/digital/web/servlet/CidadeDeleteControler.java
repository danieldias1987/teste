package com.everis.academia.java.agenda.digital.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name = "cidadedelete", urlPatterns = "/cidade/delete/controller")

public class CidadeDeleteControler extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recuperacao de parametros
		Integer codigo = Integer.valueOf(req.getParameter("codigo"));

		// obetcao de parametros
		BaseDados.cidades.remove(new Cidade(codigo));

		// volta a lista
		resp.sendRedirect(req.getContextPath() + "/lista/cidades");

	}

}
