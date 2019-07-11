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

@Component("createTipoServicoJSF")
@ManagedBean(name = "createTipoServicoJSF")
@RequestScope
public class CreateTipoServicoJSF {

	@Autowired
	private ITipoServicoBusiness tipoServicobBusiness;
	private TipoServico tipoServico = new TipoServico();

	public TipoServico getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(TipoServico tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String create() throws BusinessException {
		try {

			tipoServicobBusiness.create(tipoServico);

			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Descrição criada com sucesso"));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception

//			FacesContext.getCurrentInstance().addMessage(null,
//					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Warning", "Descriçao necessária"));

			FacesContext.getCurrentInstance().addMessage("descricao",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ex.getLocalizedMessage()));

			return null;
		}

	}

	public String reset() {

		this.tipoServico = new TipoServico();
		return null;

	}

}
