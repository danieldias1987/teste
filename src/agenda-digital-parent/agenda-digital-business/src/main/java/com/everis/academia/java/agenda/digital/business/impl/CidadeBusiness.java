package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ICidadeBusiness;
import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@Service

public class CidadeBusiness implements ICidadeBusiness {

//	private ICidadeDAO dao = new CidadeDAOList();
	@Autowired
	private ICidadeDAO dao;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void create(Cidade cidade) throws BusinessException {
		// validacao
		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome da Cidade Obrigatório");
		}
		// verificacao

		if (dao.existeCidadeNome(cidade.getNome())) {
			throw new BusinessException("Cidade existente");
		}

		dao.create(cidade);

	}

	@Transactional(readOnly = true)
	@Override
	public Collection<Cidade> read() {

		return dao.read();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void update(Cidade cidade) throws BusinessException {

		// validacao
		if (cidade.getNome() == null || cidade.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome Obrigatório");
		}
		// verificacao

		if (dao.existeCidadeNome(cidade.getNome())) {
			throw new BusinessException("Não houver qualquer alteracao, para alterar alguma coisa altere o nome");
		}
		dao.update(cidade);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void delete(Integer codigo) {
		dao.delete(codigo);
	}

	@Transactional(readOnly = true)
	@Override
	public Cidade retorna(Integer codigo) {

		return dao.retorna(codigo);
	}

}
