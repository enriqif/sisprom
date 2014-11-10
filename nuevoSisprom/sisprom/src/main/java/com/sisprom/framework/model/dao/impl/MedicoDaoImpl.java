package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Medico;
import com.sisprom.framework.model.dao.MedicoDao;

public class MedicoDaoImpl extends HibernateDaoSupport implements MedicoDao{

//	@Override
	public List<Medico> getAllMedico() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public List<Medico> find(Medico medico) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void save(Medico medico) {
		this.getHibernateTemplate().save(medico);
		
	}

//	@Override
	public void update(Medico medico) {
		this.getHibernateTemplate().update(medico);		
	}

//	@Override
	public void consult(Medico medico) {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void delete(Medico medico) {
		this.getHibernateTemplate().delete(medico);

		
	}

	

	

}
