package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.dao.impl.TipoServicoDAOList;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

public class TipoServicoBusiness implements ITipoServicoBusiness {

	private ITipoServicoDAO tipoServicoDAO = new TipoServicoDAOList();

	@Override
	public void create(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Descição obrigatória");
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

			throw new BusinessException("Descrição do Tipo de Serviço Obrigatório");
		}
		// verificacao

		if (tipoServicoDAO.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("Não houver qualquer alteracao");
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
