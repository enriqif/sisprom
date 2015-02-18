package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.DetallePatologia;
import com.sisprom.framework.model.dao.DetallePatologiaDao;

public class DetallePatologiaDaoImpl extends HibernateDaoSupport implements DetallePatologiaDao{

	@Override
	public void save(DetallePatologia detallePatologia) {
		
		this.getHibernateTemplate().save(detallePatologia);
	}

	@Override
	public void update(DetallePatologia detallePatologia) {
		
		this.getHibernateTemplate().update(detallePatologia);
	}

	@Override
	public void delete(DetallePatologia detallePatologia) {
		
		this.getHibernateTemplate().delete(detallePatologia);
	}

	@Override
	public List<DetallePatologia> getAll() {
		Criteria criteria = getSession().createCriteria(DetallePatologia.class);
		   criteria.addOrder(Order.asc("detallePatId"));
		   return criteria.list();
	}

	@Override
	public List<DetallePatologia> find(DetallePatologia detallePatologia) {
		// TODO Auto-generated method stub
		return null;
	}

}
