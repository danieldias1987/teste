package com.everis.academia.java.agenda.digital.web.servlet.cidade.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;

@WebServlet(name = "cidadedelete", urlPatterns = "/cidade/delete/controller")

public class CidadeDeleteControler extends HttpServlet {

	private ICidadeBusiness del = new CidadeBusiness();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recuperacao de parametros
		@SuppressWarnings("unused")
		Integer codigo = Integer.valueOf(req.getParameter("codigo"));

//		// obetcao de parametros
//		BaseDados.cidades.remove(new Cidade(codigo));
		@SuppressWarnings("unused")
		ICidadeBusiness busi = new CidadeBusiness();

		del.delete(codigo);

		// volta a lista
		resp.sendRedirect(req.getContextPath() + "/lista/cidades");

	}
}
