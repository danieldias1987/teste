package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.TipoServico;

public interface ITipoServicoBusiness {

	void create(TipoServico tipoServico) throws BusinessException;

	Collection<TipoServico> read();// tipo de dados collection

	void update(TipoServico tipoServico) throws BusinessException;

	void delete(Short codigo);

	TipoServico retorna(Short codigo);

}
