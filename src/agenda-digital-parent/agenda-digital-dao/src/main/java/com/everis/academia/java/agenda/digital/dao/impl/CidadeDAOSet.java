package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

public class CidadeDAOSet implements ICidadeDAO {
	// implementacao minima automatica para poder compilar

	private static Set<Cidade> cidades = new HashSet<Cidade>();

	private static Integer id = 0;

	@Override
	public void create(Cidade cidade) {
		// icremento proximo id
		id++;
		// atualiza codigo da cidade
		cidade.setCodigo(id);
		// adiciona cidade a lista
		cidades.add(cidade);

	}

	@Override
	public Collection<Cidade> read() {
		// TODO Auto-generated method stub
		return cidades;
	}

	@Override
	public void update(Cidade cidade) {
//		// int indexOf = BaseDados.cidades.indexOf(cidade);
//		int indexOf = cidade.getCodigo();
//
//		// obetcao de parametros
//		cidades.contains(indexOf);

		cidades.remove(cidade);
		cidades.add(cidade);

	}

	@Override
	public void delete(Integer codigo) {
		cidades.remove(new Cidade(codigo));

	}

	@Override
	public Boolean existeCidadeNome(String nome) {

		for (Cidade cidade : cidades) {

			if (cidade.getNome().trim().equalsIgnoreCase(nome)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	@Override
	public Cidade retorna(Integer codigo) {
		// int e um tipo primitivo, vai a base de dados e retorna o index do primeiro
		// elemmento do
		// tipo cidade e possui um determinado codigo
//		int indexOf = cidades.indexOf(new Cidade(codigo));
		//
		Cidade cidade = (Cidade) cidades;

		cidades.remove(cidade);
		cidades.add(cidade);

		return cidade;
	}

}
