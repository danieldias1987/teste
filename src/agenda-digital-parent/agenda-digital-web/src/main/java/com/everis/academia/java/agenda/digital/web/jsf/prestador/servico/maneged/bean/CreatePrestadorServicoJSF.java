package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@ManagedBean(name = "createPrestadorJSF")
@Component("createPrestadorJSF")
@RequestScope
public class CreatePrestadorServicoJSF {

	@Autowired
	private IPrestadorServicoBusiness prestadorBusiness;

	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public String create() {
		try {

			prestadorBusiness.create(prestador);

			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "INFO", "Prestador Criado com Sucesso"));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception

			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ex.getLocalizedMessage()));

			return null;
		}
	}

	public String reset() {
		this.prestador = new PrestadorServico();
		return null;
	}

}
