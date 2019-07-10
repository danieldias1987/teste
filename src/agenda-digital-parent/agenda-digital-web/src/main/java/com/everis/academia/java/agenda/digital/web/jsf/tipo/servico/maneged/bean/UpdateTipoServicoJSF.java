package com.everis.academia.java.agenda.digital.web.jsf.tipo.servico.maneged.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@ManagedBean(name = "updateTipoServicoJSF")
@Component("updateTipoServicoJSF")
@RequestScope
public class UpdateTipoServicoJSF {

	@Autowired
	ITipoServicoBusiness tipoBusiness;
	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String edit(TipoServico tipoServico) {

		this.tipoServico = tipoServico;

		return "update";

	}

	public String update() throws BusinessException {

		try {
			tipoBusiness.update(tipoServico);

			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "INFO", "Tipo de Serviço submitido com sucesso "));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception
//			FacesContext.getCurrentInstance().addMessage(null,
//					new FacesMessage(FacesMessage.SEVERITY_ERROR, "WARNING!", "Nada alterado!!!"));

			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "WARNING!", ex.getLocalizedMessage()));

			return null;

		}
	}

}
