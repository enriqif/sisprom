package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



 
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.model.dao.SecretariaDao;

public class SecretariaDaoImpl extends HibernateDaoSupport implements SecretariaDao{

	@Override
	public List<Secretaria> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Secretaria> find(Secretaria secretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Secretaria secretaria) {
		this.getHibernateTemplate().save(secretaria);
		
	}

	@Override
	public void delete(Secretaria secretaria) {
		this.getHibernateTemplate().delete(secretaria);
		
	}

	@Override
	public void update(Secretaria secretaria) {
		this.getHibernateTemplate().update(secretaria);
		
	}

}
