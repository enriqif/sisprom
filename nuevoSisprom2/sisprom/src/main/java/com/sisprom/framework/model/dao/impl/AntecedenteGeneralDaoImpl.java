package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.model.dao.AntecedenteGeneralDao;

public class AntecedenteGeneralDaoImpl extends HibernateDaoSupport implements AntecedenteGeneralDao{

	@Override
	public void save(AntecedenteGeneral antecedenteGeneral) {

		this.getHibernateTemplate().save(antecedenteGeneral);
	}

	@Override
	public void update(AntecedenteGeneral antecedenteGeneral) {
		
		this.getHibernateTemplate().update(antecedenteGeneral);
	}

	@Override
	public void delete(AntecedenteGeneral antecedenteGeneral) {
		
		this.getHibernateTemplate().delete(antecedenteGeneral);
	}

	@Override
	public List<AntecedenteGeneral> getAll() {
		Criteria criteria = getSession().createCriteria(AntecedenteGeneral.class);
		   criteria.addOrder(Order.asc("antecedenteGralId"));
		   return criteria.list();
	}

	@Override
	public List<AntecedenteGeneral> find(
			AntecedenteGeneral antecedenteGeneral) {
		// TODO Auto-generated method stub
		return null;
	}

}
