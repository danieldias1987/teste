package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@Service
public class TipoServicoBusiness implements ITipoServicoBusiness {

	@Autowired
	private ITipoServicoDAO tipoServicoDAO;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void create(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Descição obrigatória");
		}

		if (tipoServicoDAO.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("Descrição já existente");
		}

		tipoServicoDAO.create(tipoServico);

	}

	@Transactional(readOnly = true)
	@Override
	public Collection<TipoServico> read() {
		// TODO Auto-generated method stub
		return tipoServicoDAO.read();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void update(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		// validacao
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Descrição do Tipo de Serviço Obrigatório");
		}
		// verificacao

		if (tipoServicoDAO.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("Não houver qualquer alteracao");
		}
		tipoServicoDAO.update(tipoServico);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub

		tipoServicoDAO.delete(codigo);

	}

	@Transactional(readOnly = true)
	@Override
	public TipoServico retorna(Short codigo) {
		// TODO Auto-generated method stub
		return tipoServicoDAO.retorna(codigo);
	}

}
