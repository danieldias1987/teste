package com.everis.academia.java.agenda.digital.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebServlet(name = "cidadecontroller", urlPatterns = "/cidade/controller")

public class CidadeCreatController extends HttpServlet {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String nome = request.getParameter("nome");

		// validacao
		if (nome == null || nome.trim().isEmpty()) {

			throw new ServletException("Nome Obrigatório");
		}
		// verificacao
		for (Cidade cidade : BaseDados.cidades) {

			if (cidade.getNome().trim().equalsIgnoreCase(nome)) {
				throw new ServletException("Cidade existente");
			}
		}
		// criacao do objecto cidade
		Cidade cidade = new Cidade();
		cidade.setCodigo(BaseDados.cidades.size() + 1);
		cidade.setNome(request.getParameter("nome"));

		// add cidade dentro da base de dados
		BaseDados.cidades.add(cidade);

		response.sendRedirect(request.getContextPath() + "/lista/cidades");
	}
}
