package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@ManagedBean(name = "deletePrestadorJSF")
@Component("deletePrestadorJSF")
@RequestScope
public class DeletePrestadordServicoJSF {
	@Autowired
	private IPrestadorServicoBusiness delPrestador;
	private PrestadorServico prestador = new PrestadorServico();

	public PrestadorServico getPrestador() {
		return prestador;
	}

	public void setPrestador(PrestadorServico prestador) {
		this.prestador = prestador;
	}

	public String delete(PrestadorServico prestador) {

		delPrestador.delete(prestador.getCodigo());

		return "read";

	}
}
