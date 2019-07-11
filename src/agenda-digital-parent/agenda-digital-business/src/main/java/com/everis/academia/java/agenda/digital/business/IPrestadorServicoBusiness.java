package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

public interface IPrestadorServicoBusiness {

	void create(PrestadorServico prestador) throws BusinessException;

	Collection<PrestadorServico> read();// tipo de dados collection

	void update(PrestadorServico prestador) throws BusinessException;

	void delete(Short codigo);

	PrestadorServico retorna(Short codigo);
}
