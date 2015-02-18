package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Medicamento;
import com.sisprom.framework.model.dao.MedicamentoDao;

public class MedicamentoDaoImpl extends HibernateDaoSupport implements MedicamentoDao{

//	@Override
	public void save(Medicamento medicamento) {
		this.getHibernateTemplate().save(medicamento);
		
	}

//	@Override
	public void update(Medicamento medicamento) {
		this.getHibernateTemplate().update(medicamento);
		
	}

//	@Override
	public void delete(Medicamento medicamento) {
		this.getHibernateTemplate().delete(medicamento);
		
	}

//	@Override
	public List<Medicamento> getAll() {
		Criteria criteria = getSession().createCriteria(Medicamento.class);
		   criteria.addOrder(Order.asc("medicamentoId"));
		   return criteria.list();
	}

//	@Override
	public List<Medicamento> find(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
