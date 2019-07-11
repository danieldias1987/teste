package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.IPrestadorServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@Service
public class PrestadorServicoBusiness implements IPrestadorServicoBusiness {

	@Autowired
	private IPrestadorServicoDAO prestadorDAO;

	@Override
	public void create(PrestadorServico prestador) throws BusinessException {
		// TODO Auto-generated method stub

		if (prestador.getNome() == null || prestador.getNome().trim().isEmpty()) {

			throw new BusinessException("Nome do Prestador de Serviço Obrigatório");
		}

		if (prestadorDAO.existePrestador(prestador.getNome())) {
			throw new BusinessException("Prestador já existente");
		}

		// campo email
		if (prestador.getEmail() == null || prestador.getEmail().trim().isEmpty()) {

			throw new BusinessException("E-mail obrigatorio");
		}

		prestadorDAO.create(prestador);
	}

	@Override
	public Collection<PrestadorServico> read() {
		// TODO Auto-generated method stub
		return prestadorDAO.read();
	}

	@Override
	public void update(PrestadorServico prestador) throws BusinessException {
		// TODO Auto-generated method stub

		if (prestadorDAO.existePrestador(prestador.getNome())) {
			throw new BusinessException("Não houver qualquer alteracao");
		}

		// campo email

		if (prestadorDAO.existePrestador(prestador.getEmail())) {
			throw new BusinessException("Não houver qualquer alteracao");
		}
		prestadorDAO.update(prestador);
	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub
		prestadorDAO.delete(codigo);

	}

	@Override
	public PrestadorServico retorna(Short codigo) {
		// TODO Auto-generated method stub
		return prestadorDAO.retorna(codigo);
	}

}
