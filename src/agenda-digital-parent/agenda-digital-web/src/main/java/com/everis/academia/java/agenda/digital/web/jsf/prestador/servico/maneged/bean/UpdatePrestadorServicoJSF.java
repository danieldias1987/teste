package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@ManagedBean(name = "updatePrestadorJSF")
@Component("updatePrestadorJSF")
@RequestScope
public class UpdatePrestadorServicoJSF {

	@Autowired
	IPrestadorServicoBusiness prestadorServicoBusiness;
	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public String edit(PrestadorServico prestador) {

		this.prestador = prestador;

		return "update";

	}

	public String update() throws BusinessException {

		try {
			prestadorServicoBusiness.update(prestador);

			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Prestador alterado com sucesso "));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "WARNING!", ex.getLocalizedMessage()));

			return null;

		}

	}
}
