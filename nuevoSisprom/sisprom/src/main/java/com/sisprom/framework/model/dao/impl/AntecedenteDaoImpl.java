package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Antecedente;
import com.sisprom.framework.model.dao.AntecedenteDao;

public class AntecedenteDaoImpl extends HibernateDaoSupport implements AntecedenteDao{

	//@Override
	public List<Antecedente> getAllAntecedente() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public List<Antecedente> find(Antecedente antecedente) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public void save(Antecedente antecedente) {
		this.getHibernateTemplate().save(antecedente);		
	}

//	@Override
	public void update(Antecedente antecedente) {
		this.getHibernateTemplate().update(antecedente);
		
	}

//	@Override
	public void delete(Antecedente antecedente) {
		this.getHibernateTemplate().delete(antecedente);
		
	}

	

}
