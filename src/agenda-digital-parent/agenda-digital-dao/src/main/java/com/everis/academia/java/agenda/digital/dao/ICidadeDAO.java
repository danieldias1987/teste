package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.Cidade;

//ICidadeDAO o I e de interface

public interface ICidadeDAO {

	void create(Cidade cidade);

	Collection<Cidade> read();// tipo de dados collection

	void update(Cidade cidade);// se necessario addicionar um componnente nao seria refacturar o codigo; recebe
								// o objecto cidade

	void delete(Integer codigo);// Boolean delete(Cidade cidade);

	Boolean existeCidadeNome(String nome);
//	Boolean existeCidadeNome(Cidade cidade);

	Cidade retorna(Integer codigo);

}
