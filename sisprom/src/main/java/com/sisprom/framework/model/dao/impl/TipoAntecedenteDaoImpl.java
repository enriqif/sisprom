package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.TipoAntecedente;
import com.sisprom.framework.model.dao.TipoAntecedenteDao;

public class TipoAntecedenteDaoImpl extends HibernateDaoSupport implements TipoAntecedenteDao{

	@Override
	public List<TipoAntecedente> getAllTipoAntecedente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoAntecedente> find(TipoAntecedente tipoAntecedente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(TipoAntecedente tipoAntecedente) {
		this.getHibernateTemplate().save(tipoAntecedente);		
		
	}

	@Override
	public void update(TipoAntecedente tipoAntecedente) {
		this.getHibernateTemplate().update(tipoAntecedente);		
		
	}

	@Override
	public void delete(TipoAntecedente tipoAntecedente) {
		this.getHibernateTemplate().delete(tipoAntecedente);		
		
	}

	

}
