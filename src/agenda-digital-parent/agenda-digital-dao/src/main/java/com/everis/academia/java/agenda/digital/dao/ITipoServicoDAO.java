package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.TipoServico;

public interface ITipoServicoDAO {

	void create(TipoServico tipoServico);

	Collection<TipoServico> read();// tipo de dados collection

	void update(TipoServico tipoServico);// se necessario addicionar um componnente nao seria refacturar o codigo;
											// recebe
	// o objecto cidade

	void delete(Short codigo);// Boolean delete(Cidade cidade);

	TipoServico retorna(Short codigo);

	boolean existeDescricao(String descricao);

}
