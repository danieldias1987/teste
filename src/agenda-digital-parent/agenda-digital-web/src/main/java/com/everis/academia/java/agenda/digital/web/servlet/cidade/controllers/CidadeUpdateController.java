package com.everis.academia.java.agenda.digital.web.servlet.cidade.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name = "cidadeupdatecontroller", urlPatterns = "/cidade/update/controller")

public class CidadeUpdateController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// recuperacao de parametros
		Integer codigo = Integer.valueOf(req.getParameter("codigo"));
		String nome = req.getParameter("nome");

		// novo objecto com os parametros codigo e nome Cidade cidade = new
		Cidade cidade = new Cidade(codigo, nome);
		// mandou a camada de business
		ICidadeBusiness busi = new CidadeBusiness();
		try {
			busi.update(cidade);
		} catch (Exception e) {
			throw new ServletException(e);
		}

		// volta a lista
		// resp.sendRedirect(req.getContextPath() + "/lista/cidades");
		resp.sendRedirect(req.getContextPath() + "/jsp/cidade/read.jsp");

	}

}
