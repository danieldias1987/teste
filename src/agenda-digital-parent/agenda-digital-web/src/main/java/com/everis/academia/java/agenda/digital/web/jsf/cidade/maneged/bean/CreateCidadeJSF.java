package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import javax.faces.bean.ManagedBean;
import javax.servlet.ServletException;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "createCidadeJSF")
public class CreateCidadeJSF {

	private String nome;

	ICidadeBusiness business = new CidadeBusiness();// tem uma instancia unica

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String create() throws ServletException {

		try {
			Cidade cidade = new Cidade();
			cidade.setNome(nome);

			business.create(cidade);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new ServletException(e);
		}

		return null;

	}

	public String reset() {
		return null;

	}
}
