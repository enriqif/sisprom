package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Turno;
import com.sisprom.framework.model.dao.TurnoDao;

public class TurnoDaoImpl extends HibernateDaoSupport implements TurnoDao{

	@Override
	public void save(Turno turno) {

		this.getHibernateTemplate().save(turno);		
	}

	@Override
	public void update(Turno turno) {
		
		this.getHibernateTemplate().update(turno);
	}

	@Override
	public void delete(Turno turno) {
		
		this.getHibernateTemplate().delete(turno);
	}

	@Override
	public List<Turno> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turno> find(Turno turno) {
		// TODO Auto-generated method stub
		return null;
	}

}
