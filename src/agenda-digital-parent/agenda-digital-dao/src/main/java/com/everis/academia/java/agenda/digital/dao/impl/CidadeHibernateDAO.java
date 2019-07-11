package com.everis.academia.java.agenda.digital.dao.impl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.everis.academia.java.agenda.digital.dao.ICidadeDAO;
import com.everis.academia.java.agenda.digital.entity.Cidade;

@Repository
public class CidadeHibernateDAO implements ICidadeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void create(Cidade cidade) {

		Session session = sessionFactory.getCurrentSession();

		session.save(cidade);
		session.flush();
	}

	@Override
	public Collection<Cidade> read() {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Cidade.class);

		return criteria.list();
	}

	@Override
	public void update(Cidade cidade) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		session.update(cidade);
		session.flush();

	}

	@Override
	public void delete(Integer codigo) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();

		Cidade cidade = session.get(Cidade.class, codigo);

		sessionFactory.getCurrentSession().delete(cidade);
	}

	@Override
	public Boolean existeCidadeNome(String nome) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Cidade.class);

		criteria.add(Restrictions.eq("nome", nome).ignoreCase());
		criteria.setProjection(Projections.count("nome"));

		return (Long) criteria.uniqueResult() > 0;
	}

	@Override
	public Cidade retorna(Integer codigo) {

		Session session = sessionFactory.getCurrentSession();

		Criteria criteria = session.createCriteria(Cidade.class);

		criteria.add(Restrictions.eq("codigo", codigo));

		return (Cidade) criteria.uniqueResult();
	}

}
