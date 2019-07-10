package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.business.impl.TipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "updateTipoServicoJSF")
public class UpdateTipoServicoJSF {

	ITipoServicoBusiness tipoBusiness = new TipoServicoBusiness();
	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String edit(TipoServico tipoServico) {

		this.tipoServico = tipoServico;

		return "updateTipoServico";

	}

	public String update() throws BusinessException {

		try {
			tipoBusiness.update(tipoServico);

			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Tipo de Servi�o submitido com sucesso "));

			return "readTipoServico";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ex.getLocalizedMessage()));

			return null;

		}
	}

}
