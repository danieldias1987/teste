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

@Component("createCidadeJSF")
@ManagedBean(name = "createCidadeJSF")
@RequestScope
public class CreateCidadeJSF {

//	private ICidadeBusiness business = new CidadeBusiness();// tem uma instancia unica

	@Autowired
	private ICidadeBusiness business;
	private Cidade cidade = new Cidade();// private Cidade cidade = new Cidade(); isto para objecto e nao nome

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String create() throws BusinessException {// business.create(cidade)

		try {

			business.create(cidade);

			FacesContext.getCurrentInstance().addMessage("nome", new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Cidade criada com sucesso", "Cidade criada com sucesso"));

			return "read";// retorna para a pagina de read

		} catch (Exception ex) {

			// TODO: handle exception

			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "", ex.getLocalizedMessage()));

			return null;
		}

	}

	public String reset() {

		this.cidade = new Cidade();// no caso de objecto ficava this.cidade=new Cidade();

		return null;// se nao quiser direcionar para uma nova pagina tem que returnar null

	}
}
