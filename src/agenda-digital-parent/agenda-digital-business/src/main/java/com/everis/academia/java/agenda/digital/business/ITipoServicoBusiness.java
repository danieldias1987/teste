package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.TipoServico;

public interface ITipoServicoBusiness {

	void create(TipoServico tipoServico);

	Collection<TipoServico> read();// tipo de dados collection

	void update(TipoServico tipoServico) throws BusinessException;// se necessario addicionar um componnente nao seria
																	// refacturar o codigo;
	// recebe
	// o objecto cidade

	void delete(Integer codigo);// Boolean delete(Cidade cidade);

	Boolean existeCidadeNome(String descricao);

	TipoServico retorna(Integer codigo);

}
