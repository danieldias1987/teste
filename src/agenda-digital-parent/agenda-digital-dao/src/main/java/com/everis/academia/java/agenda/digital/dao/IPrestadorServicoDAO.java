package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

public interface IPrestadorServicoDAO {

	void create(PrestadorServico prestador);

	Collection<PrestadorServico> read();// tipo de dados collection

	void update(PrestadorServico prestador);

	void delete(Short codigo);

	PrestadorServico retorna(Short codigo);

}
