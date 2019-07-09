package com.everis.academia.java.agenda.digital.business.impl;

import java.util.Collection;

import com.everis.academia.java.agenda.digital.business.BusinessException;
import com.everis.academia.java.agenda.digital.business.ITipoServicoBusiness;
import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.dao.impl.TipoServicoDAOList;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

public class TipoServicoBusiness implements ITipoServicoBusiness {

	private ITipoServicoDAO tipoServicoDao = new TipoServicoDAOList();

	@Override
	public void create(TipoServico tipoServico) {
		// TODO Auto-generated method stub

	}

	@Override
	public Collection<TipoServico> read() {
		// TODO Auto-generated method stub
		return tipoServicoDao.read();
	}

	@Override
	public void update(TipoServico tipoServico) throws BusinessException {
		// TODO Auto-generated method stub
		// validacao
		if (tipoServico.getDescricao() == null || tipoServico.getDescricao().trim().isEmpty()) {

			throw new BusinessException("Descrição do tipo de Serviço obrigatória");
		}
		// verificacao

		if (tipoServicoDao.existeDescricao(tipoServico.getDescricao())) {
			throw new BusinessException("Não houver qualquer alteracao");
		}
		tipoServicoDao.update(tipoServico);

	}

	@Override
	public void delete(Integer codigo) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean existeCidadeNome(String descricao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoServico retorna(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
