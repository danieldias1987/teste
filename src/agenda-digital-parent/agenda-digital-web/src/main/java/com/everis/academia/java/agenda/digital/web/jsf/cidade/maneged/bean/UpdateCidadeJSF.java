package com.everis.academia.java.agenda.digital.web.jsf.cidade.maneged.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@ManagedBean(name = "updateCidadeJSF")
@Component("updateCidadeJSF")
@RequestScope
public class UpdateCidadeJSF {

//	ICidadeBusiness busi = new CidadeBusiness();
	@Autowired
	ICidadeBusiness busi;
	private Cidade cidade = new Cidade();

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String edit(Cidade cidade) {

		this.cidade = cidade;

		return "update";

	}

	public String update() throws BusinessException {

		try {
			busi.update(cidade);

			FacesContext.getCurrentInstance().addMessage("nome", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Cidade actualizada com sucesso", "Cidade actualizada com sucesso"));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ex.getLocalizedMessage()));

			return null;

		}
	}

}
