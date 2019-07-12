package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.java.agenda.digital.dao.IPrestadorServicoDAO;
import com.everis.academia.java.agenda.digital.entity.PrestadorServico;

@Repository
public class PrestadorHibernateDAO implements IPrestadorServicoDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(PrestadorServico prestador) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		session.save(prestador);
		session.flush();

	}

	@Override
	public Collection<PrestadorServico> read() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(PrestadorServico.class);

		return criteria.list();
	}

	@Override
	public void update(PrestadorServico prestador) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		session.update(prestador);
		session.flush();

	}

	@Override
	public void delete(Short codigo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		PrestadorServico prestador = session.get(PrestadorServico.class, codigo);

		sessionFactory.getCurrentSession().delete(prestador);

	}

	@Override
	public PrestadorServico retorna(Short codigo) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(PrestadorServico.class);

		criteria.add(Restrictions.eq("codigo", codigo));

		return (PrestadorServico) criteria.uniqueResult();
	}
}
