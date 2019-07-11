package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

//@Repository
public class TipoServicoDAOList implements ITipoServicoDAO {

	private static List<TipoServico> tipoServicos = new ArrayList<>();

	private static Short id = 0;

	@Override
	public void create(TipoServico tipoServico) {
		// TODO Auto-generated method stub

		// icremento proximo id
		id++;
		// atualiza codigo da cidade
		tipoServico.setCodigo(id);
		// adiciona cidade a lista
		tipoServicos.add(tipoServico);

	}

	@Override
	public Collection<TipoServico> read() {
		// TODO Auto-generated method stub
		return tipoServicos;
	}

	@Override
	public void update(TipoServico tipoServico) {
		// TODO Auto-generated method stub
		int indexOf = tipoServicos.indexOf(tipoServico);

		// obetcao de parametros
		tipoServicos.set(indexOf, tipoServico);

	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub
		tipoServicos.remove(new TipoServico(codigo));

	}

	@Override
	public TipoServico retorna(Short codigo) {
		// TODO Auto-generated method stub

		int indexOf = tipoServicos.indexOf(new TipoServico(codigo));
		//
		TipoServico tipoServico = tipoServicos.get(indexOf);

		return tipoServico;

	}

	@Override
	public boolean existeDescricao(String descricao) {

		for (TipoServico tipoServico : tipoServicos) {

			if (tipoServico.getDescricao().trim().equalsIgnoreCase(descricao)) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

}
