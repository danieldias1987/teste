package com.everis.academia.java.agenda.digital.business;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.entity.Cidade;

public interface ICidadeBusiness {

	void create(Cidade cidade) throws BusinessException;// acrecenta-se o throw exception para que na class
														// cidadeBusiness deixe de dar erro de throw

	Collection<Cidade> read();// tipo de dados collection

	void update(Cidade cidade) throws BusinessException;// se necessario addicionar um componnente nao seria
														// refacturar o codigo; recebe
	// o objecto cidade

	void delete(Integer codigo);// Boolean delete(Cidade cidade);

	Cidade retorna(Integer codigo);//

}
