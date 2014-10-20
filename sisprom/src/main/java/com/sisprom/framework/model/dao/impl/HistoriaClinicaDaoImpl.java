package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.model.dao.HistoriaClinicaDao;

public class HistoriaClinicaDaoImpl extends HibernateDaoSupport implements HistoriaClinicaDao{

	@Override
	public List<HistoriaClinica> getAllHistoriaClinica() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HistoriaClinica> find(HistoriaClinica historiaClinica) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().update(historiaClinica);		
	}

	@Override
	public void save(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().save(historiaClinica);		
		
	}

	@Override
	public void delete(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().delete(historiaClinica);
		
	}

	

}
