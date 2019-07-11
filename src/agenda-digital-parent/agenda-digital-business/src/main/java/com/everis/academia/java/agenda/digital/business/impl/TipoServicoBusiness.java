package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@Service
public class TipoServicoBusiness implements ITipoServicoBusiness {

	@Autowired
	private ITipoServicoDAO tipoServicoDAO;

	@Override
	public void create(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Desci��o obrigat�ria");
		}

		if (tipoServicoDAO.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("Descri��o j� existente");
		}

		tipoServicoDAO.create(tipoServico);

	}

	@Override
	public Collection<TipoServico> read() {
		// TODO Auto-generated method stub
		return tipoServicoDAO.read();
	}

	@Override
	public void update(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		// validacao
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Descri��o do Tipo de Servi�o Obrigat�rio");
		}
		// verificacao

		if (tipoServicoDAO.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("N�o houver qualquer alteracao");
		}
		tipoServicoDAO.update(tipoServico);
	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub

		tipoServicoDAO.delete(codigo);

	}

	@Override
	public TipoServico retorna(Short codigo) {
		// TODO Auto-generated method stub
		return tipoServicoDAO.retorna(codigo);
	}

}
