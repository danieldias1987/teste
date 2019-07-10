package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "readTipoServicoJSF")
@Component("readTipoServicoJSF")
@RequestScope
public class ReadTipoServicoJSF {

	@Autowired
	private ITipoServicoBusiness tipoServicoBusiness;

	private Collection<TipoServico> tiposervico = null;// business.read();

	@PostConstruct
	public void init() {// boa pratica
		this.tiposervico = tipoServicoBusiness.read();
	}

	public Collection<TipoServico> getTiposervico() {
		return tiposervico;
	}

	public void setTiposervico(Collection<TipoServico> tiposervico) {
		this.tiposervico = tiposervico;
	}

}
