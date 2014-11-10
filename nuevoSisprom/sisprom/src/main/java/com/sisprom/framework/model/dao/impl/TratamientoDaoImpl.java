package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Tratamiento;
import com.sisprom.framework.model.dao.TratamientoDao;

//Create by
//Modification by Martin

public class TratamientoDaoImpl extends HibernateDaoSupport implements TratamientoDao{

//	@Override
	public List<Tratamiento> getAllArticulo() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public List<Tratamiento> find(Tratamiento tratamiento) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void save(Tratamiento tratamiento) {
		this.getHibernateTemplate().save(tratamiento);		
		
	}

//	@Override
	public void update(Tratamiento tratamiento) {
		this.getHibernateTemplate().update(tratamiento);
		
	}

//	@Override
	public void buildGraphic() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void delete(Tratamiento tratamiento) {
		this.getHibernateTemplate().delete(tratamiento);		
	}

	

}
