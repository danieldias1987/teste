package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "createTipoServicoJSF")
public class CreateTipoServicoJSF {

	private ITipoServicoBusiness tipoServicobBsiness = new TipoServicoBusiness();
	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String create() {
		return null;

	}

	public String reset() {

		this.tipoServico = new TipoServico();
		return null;

	}

}
