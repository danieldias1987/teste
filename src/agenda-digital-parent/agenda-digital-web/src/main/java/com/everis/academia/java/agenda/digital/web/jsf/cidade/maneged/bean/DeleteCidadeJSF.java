package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "deleteCidadeJSF")
@Component("deleteCidadeJSF")
@RequestScope
public class DeleteCidadeJSF {

//	private ICidadeBusiness del = new CidadeBusiness();

	@Autowired
	private ICidadeBusiness del;

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
