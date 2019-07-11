package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@Repository
public class PrestadorServicoDAO implements IPrestadorServicoDAO {

	private static List<PrestadorServico> prestadores = new ArrayList<>();

	private static Short id = 0;

	@Override
	public void create(PrestadorServico prestador) {
		// TODO Auto-generated method stub

		// icremento proximo id
		id++;
		// atualiza codigo da cidade
		prestador.setCodigo(id);
		// adiciona cidade a lista
		prestadores.add(prestador);
	}

	@Override
	public Collection<PrestadorServico> read() {
		// TODO Auto-generated method stub
		return prestadores;
	}

	@Override
	public void update(PrestadorServico prestador) {
		// TODO Auto-generated method stub
		int indexOf = prestadores.indexOf(prestador);

		// obetcao de parametros
		prestadores.set(indexOf, prestador);

	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub

		prestadores.remove(new PrestadorServico(codigo));
	}

	@Override
	public PrestadorServico retorna(Short codigo) {
		// TODO Auto-generated method stub

		int indexOf = prestadores.indexOf(new PrestadorServico(codigo));
		//
		PrestadorServico prestador = prestadores.get(indexOf);

		return prestador;
	}

	@Override
	public boolean existePrestador(String nome) {
		// TODO Auto-generated method stub
		for (PrestadorServico prestador : prestadores) {

			if (prestador.getNome().trim().equalsIgnoreCase(nome)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
