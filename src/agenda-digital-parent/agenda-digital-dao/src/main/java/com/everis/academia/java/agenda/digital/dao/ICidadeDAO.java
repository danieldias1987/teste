package com.everis.academia.java.agenda.digital.dao;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.Cidade;

//ICidadeDAO o I e de interface

public interface ICidadeDAO {

	Boolean create(Cidade cidade);

	Collection<Cidade> read();// tipo de dados collection

	Boolean update(Cidade cidade);// se necessario addicionar um componnente nao seria refacturar o codigo; recebe
									// o objecto cidade

	Boolean delete(Integer codigo);// Boolean delete(Cidade cidade);

}
