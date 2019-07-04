package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.dao.impl.CidadeDAOList;
import com.everis.academia.java.agenda.digital.entity.Cidade;

public class CidadeBusiness implements ICidadeBusiness {

	private ICidadeDAO dao = new CidadeDAOList();

	@Override
	public void create(Cidade cidade) throws BusinessException {
		// validacao
		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigatório");
		}
		// verificacao

		if (dao.existeCidadeNome(cidade.getNome())) {
			throw new BusinessException("Cidade existente");
		}

		dao.create(cidade);

	}

	@Override
	public Collection<Cidade> read() {

		return dao.read();
	}

	@Override
	public void update(Cidade cidade) throws BusinessException {

		// validacao
		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigatório");
		}
		// verificacao

		if (dao.existeCidadeNome(cidade.getNome())) {
			throw new BusinessException("Cidade existente");
		}
		dao.update(cidade);
	}

	@Override
	public void delete(Integer codigo) {
		dao.delete(codigo);
	}

	@Override
	public Cidade retorna(Integer codigo) {

		return dao.retorna(codigo);
	}

}
