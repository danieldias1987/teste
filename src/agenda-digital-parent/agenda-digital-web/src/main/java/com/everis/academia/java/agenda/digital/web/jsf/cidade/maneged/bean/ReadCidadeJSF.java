package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "readCidadeJSF")
public class ReadCidadeJSF {

	private ICidadeBusiness business = new CidadeBusiness();

	private Collection<Cidade> cidades = null;// business.read();

	@PostConstruct
	public void init() {// boa pratica
		this.cidades = business.read();
	}

	public Collection<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(Collection<Cidade> cidades) {
		this.cidades = cidades;
	}
}
