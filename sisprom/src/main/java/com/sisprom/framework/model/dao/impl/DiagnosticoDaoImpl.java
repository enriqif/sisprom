package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Diagnostico;
import com.sisprom.framework.model.dao.DiagnosticoDao;

public class DiagnosticoDaoImpl extends HibernateDaoSupport implements DiagnosticoDao{

	@Override
	public void save(Diagnostico diagnostico) {
		this.getHibernateTemplate().save(diagnostico);
		
	}

	@Override
	public void update(Diagnostico diagnostico) {
		this.getHibernateTemplate().update(diagnostico);		
	}

	@Override
	public void delete(Diagnostico diagnstico) {
		this.getHibernateTemplate().delete(diagnstico);
		
	}

	@Override
	public List<Diagnostico> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Diagnostico> find(Diagnostico diagnostico) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
