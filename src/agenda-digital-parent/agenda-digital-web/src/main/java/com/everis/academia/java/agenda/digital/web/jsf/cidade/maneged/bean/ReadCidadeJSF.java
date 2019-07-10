package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "readCidadeJSF")
@Component("readCidadeJSF")
@RequestScope
public class ReadCidadeJSF {

//	private ICidadeBusiness business = new CidadeBusiness();

	@Autowired
	private ICidadeBusiness business;

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
