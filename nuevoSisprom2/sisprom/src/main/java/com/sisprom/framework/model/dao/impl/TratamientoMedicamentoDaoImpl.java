package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.TratamientoMedicamento;
import com.sisprom.framework.model.dao.TratamientoMedicamentoDao;

public class TratamientoMedicamentoDaoImpl extends HibernateDaoSupport implements TratamientoMedicamentoDao {

//	@Override
	public void save(TratamientoMedicamento tratamientoMedicamento) {
		this.getHibernateTemplate().save(tratamientoMedicamento);		
		
	}

//	@Override
	public void update(TratamientoMedicamento tratamientoMedicamento) {
		this.getHibernateTemplate().update(tratamientoMedicamento);
		
	}

//	@Override
	public void delete(TratamientoMedicamento tratamientoMedicamento) {
		this.getHibernateTemplate().delete(tratamientoMedicamento);
		
	}

//	@Override
	public List<TratamientoMedicamento> getAll() {
		Criteria criteria = getSession().createCriteria(TratamientoMedicamento.class);
		   criteria.addOrder(Order.asc("tratamientoMedicamentoId"));
		   return criteria.list();
	}

//	@Override
	public List<TratamientoMedicamento> find(
			TratamientoMedicamento tratamientoMedicamento) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
