package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.model.dao.ConsultaDao;



//Create by
//Modification by Marto

public class ConsultaDaoImpl extends HibernateDaoSupport implements ConsultaDao {

//	@Override
	public List<Consulta> getAll() {
		Criteria criteria = getSession().createCriteria(Consulta.class);
		   criteria.addOrder(Order.asc("consultaId"));
		   return criteria.list();
	}

//	@Override
	public List<Consulta> find(Consulta consulta) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void save(Consulta consulta) {
		this.getHibernateTemplate().save(consulta);
		
	}

//	@Override
	public void update(Consulta consulta) {
		this.getHibernateTemplate().update(consulta);
		
	}

//	@Override
	public void delete(Consulta consulta) {
		this.getHibernateTemplate().delete(consulta);
		
	}

}
