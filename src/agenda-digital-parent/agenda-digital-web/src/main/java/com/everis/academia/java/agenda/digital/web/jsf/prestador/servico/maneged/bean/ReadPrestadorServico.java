package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@ManagedBean(name = "readPrestadorJSF")
@Component("readPrestadorJSF")
@RequestScope
public class ReadPrestadorServico {

	@Autowired
	private IPrestadorServicoBusiness prestadorServicoBusiness;

	private Collection<PrestadorServico> prestador = null;// business.read();

	public Collection<PrestadorServico> getPrestador() {
		return prestadorServicoBusiness.read();
	}

	public void setPrestador(Collection<PrestadorServico> prestador) {
		this.prestador = prestador;
	}

}
