package com.everis.academia.java.agenda.digital.web.soap;

import java.util.Collection;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.business.impl.CidadeBusiness;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@WebService()
public class CidadeSOAP {

	private ICidadeBusiness business = new CidadeBusiness();

	@WebMethod(operationName = "create")
	@WebResult(name = "cidade")
	public Cidade create(@WebParam(name = "cidade") Cidade cidade) throws BusinessException {

		business.create(cidade);
		return cidade;
	}

	@WebMethod(operationName = "read")
	@WebResult(name = "cidade")
	public Collection<Cidade> read() throws BusinessException {

		return business.read();

	}

	@WebMethod(operationName = "delete")
	@WebResult(name = "cidade")
	public void delete(@WebParam(name = "cidade") Cidade cidade) {

		business.delete(cidade.getCodigo());

	}

	@WebMethod(operationName = "update")
	@WebResult(name = "cdidade")
	public Cidade updadte(@WebParam(name = "cidade") Cidade cidade) throws BusinessException {

		business.update(cidade);

		return cidade;

	}

}
