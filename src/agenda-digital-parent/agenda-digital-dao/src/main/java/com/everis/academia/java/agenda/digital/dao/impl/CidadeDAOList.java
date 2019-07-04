package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

public class CidadeDAOList implements ICidadeDAO {
	// implementacao minima automatica para poder compilar

	private static List<Cidade> cidades = new ArrayList<>();

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
		// int indexOf = BaseDados.cidades.indexOf(cidade);
		int indexOf = cidades.indexOf(cidade);

		// obetcao de parametros
		cidades.set(indexOf, cidade);

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
		int indexOf = cidades.indexOf(new Cidade(codigo));
		//
		Cidade cidade = cidades.get(indexOf);

		return cidade;
	}

}
