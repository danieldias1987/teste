package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "deleteCidadeJSF")
public class DeleteCidadeJSF {

	private ICidadeBusiness del = new CidadeBusiness();

	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String delete(Cidade cidade) {

		del.delete(cidade.getCodigo());

		return "read";

	}
}
