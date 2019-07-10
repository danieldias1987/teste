package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "deleteTipoServicoJSF")
@Component("deleteTipoServicoJSF")
@RequestScope
public class DeleteTipoServicoJSF {

	@Autowired
	private ITipoServicoBusiness delTipoServico;
	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String delete(TipoServico tipoServico) {

		delTipoServico.delete(tipoServico.getCodigo());

		return "read";

	}
}
