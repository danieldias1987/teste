package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.bean.ManagedBean;

import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "deleteTipoServicoJSF")
public class DeleteTipoServicoJSF {

	private ITipoServicoBusiness delTipoServico = new TipoServicoBusiness();

	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String delete(TipoServico tipoServico) {

		delTipoServico.delete(tipoServico.getCodigo());

		return "readTipoServico";

	}
}
