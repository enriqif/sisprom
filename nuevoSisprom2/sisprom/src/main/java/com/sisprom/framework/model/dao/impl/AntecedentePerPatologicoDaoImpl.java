package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.AntecedentePerPatologico;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.model.dao.AntecedentePerPatologicoDao;

public class AntecedentePerPatologicoDaoImpl extends HibernateDaoSupport implements AntecedentePerPatologicoDao{

	@Override
	public void save(AntecedentePerPatologico antecedentePerPatologico) {

		this.getHibernateTemplate().save(antecedentePerPatologico);
	}

	@Override
	public void update(AntecedentePerPatologico antecedentePerPatologico) {
		
		this.getHibernateTemplate().update(antecedentePerPatologico);
	}

	@Override
	public void delete(AntecedentePerPatologico antecedentePerPatologico) {
		
		this.getHibernateTemplate().delete(antecedentePerPatologico);
	}

	@Override
	public List<AntecedentePerPatologico> getAll() {
		Criteria criteria = getSession().createCriteria(AntecedentePerPatologico.class);
		   criteria.addOrder(Order.asc("antecedentePerPatId"));
		   return criteria.list();
	}

	@Override
	public List<AntecedentePerPatologico> find(
			AntecedentePerPatologico antecedentePerPatologico) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AntecedentePerPatologico> findByHistoriaClinica(
			HistoriaClinica historiaClinica) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
