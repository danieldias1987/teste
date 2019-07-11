package com.everis.academia.java.agenda.digital.web.jsf.prestador.servico.maneged.bean;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;

@ManagedBean(name = "updatePrestadorJSF")
@Component("updatePrestadorJSF")
@RequestScope
public class UpdatePrestadorServicoJSF {
	
	@Autowired
	IPrestadorServicoBusiness prestadorServicoBusiness;
	private PrestadorServico

}
