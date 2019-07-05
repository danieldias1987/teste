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

@WebServlet(name = "cidadecontroller", urlPatterns = "/cidade/controller")

public class CidadeCreatController extends HttpServlet {

	private ICidadeBusiness business = new CidadeBusiness();// tem uma instancia unica
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		try {

			String nome = request.getParameter("nome");

			// criacao do objecto cidade
			Cidade cidade = new Cidade();
			cidade.setNome(nome);

			business.create(cidade);
			// response.sendRedirect(request.getContextPath() + "/lista/cidades");
			response.sendRedirect(request.getContextPath() + "/jsp/cidade/read.jsp");

		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}

	}
}
