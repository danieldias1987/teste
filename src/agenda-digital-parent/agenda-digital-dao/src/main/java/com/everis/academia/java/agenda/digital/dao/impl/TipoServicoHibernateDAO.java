package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.java.agenda.digital.dao.ITipoServicoDAO;
import com.everis.academia.java.agenda.digital.entity.TipoServico;

@Repository
public class TipoServicoHibernateDAO implements ITipoServicoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(TipoServico tipoServico) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		session.save(tipoServico);
		session.flush();

	}

	@Override
	public Collection<TipoServico> read() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(TipoServico.class);

		return criteria.list();
	}

	@Override
	public void update(TipoServico tipoServico) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();

		session.update(tipoServico);
		session.flush();

	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		TipoServico tipoServico = session.get(TipoServico.class, codigo);

		sessionFactory.getCurrentSession().delete(tipoServico);

	}

	@Override
	public TipoServico retorna(Short codigo) {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(TipoServico.class);

		criteria.add(Restrictions.eq("codigo", codigo));

		return (TipoServico) criteria.uniqueResult();
	}

	@Override
	public boolean existeDescricao(String descricao) {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(TipoServico.class);

		criteria.add(Restrictions.eq("descricao", descricao).ignoreCase());
		criteria.setProjection(Projections.count("descricao"));

		return (Long) criteria.uniqueResult() > 0;

	}

}
