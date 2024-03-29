package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;
import com.everis.academia.java.agenda.digital.entity.TipoServico;
import com.everis.academia.java.agenda.digital.enums.TipoLogradouro;

@ManagedBean(name = "updatePrestadorJSF")
@Component("updatePrestadorJSF")
@RequestScope
public class UpdatePrestadorServicoJSF {

	@Autowired
	IPrestadorServicoBusiness prestadorServicoBusiness;
	
	@Autowired
	private ITipoServicoBusiness tipoServicoBusiness;
	
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

			ex.printStackTrace();

			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage("nome",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "WARNING!", ex.getLocalizedMessage()));

			return null;

		}

	}

	// update cidade prestador

	@Autowired
	ICidadeBusiness cidadeBusiness;

	private Collection<Cidade> cidades = null;
	private Collection<TipoServico> tipoServico = null;

	@PostConstruct
	public void init() {

		this.setCidades(cidadeBusiness.read());
		this.setTipoServico(tipoServicoBusiness.read());
	}

	public Collection<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(Collection<Cidade> cidades) {
		this.cidades = cidades;
	}
	
	// update Tipo Logradouro
	
		public TipoLogradouro[] getArea() {
			
			return TipoLogradouro.values();
		}

		public Collection<TipoServico> getTipoServico() {
			return tipoServico;
		}

		public void setTipoServico(Collection<TipoServico> tipoServico) {
			this.tipoServico = tipoServico;
		}

}
