package com.everis.academia.java.agenda.digital.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		// validacao
		if (nome == null || nome.trim().isEmpty()) {

			throw new ServletException("Nome Obrigatório");
		}
		// verificacao
		for (Cidade cidade : BaseDados.cidades) {

			if (cidade.getNome().trim().equalsIgnoreCase(nome) && !cidade.getCodigo().equals(codigo)) {
				throw new ServletException("Cidade existente");
			}
		}
		// novo objecto com os parametros codigo e nome
		Cidade cidade = new Cidade(codigo, nome);

		int indexOf = BaseDados.cidades.indexOf(cidade);

		// obetcao de parametros
		BaseDados.cidades.set(indexOf, cidade);

		// volta a lista
		resp.sendRedirect(req.getContextPath() + "/lista/cidades");

	}

}
