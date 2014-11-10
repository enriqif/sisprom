package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.model.dao.PacienteDao;

//Create by
//Modification by Martin

public class PacienteDaoImpl extends HibernateDaoSupport  implements PacienteDao{

//	@Override
	public List<Paciente> getAll(Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public List<Paciente> find(Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void save(Paciente paciente) {
		
		this.getHibernateTemplate().save(paciente);
	}

//	@Override
	public void update(Paciente paciente) {

		this.getHibernateTemplate().update(paciente);
	}

//	@Override
	public Paciente getData(Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void buildGraphics() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void delete(Paciente paciente) {

		this.getHibernateTemplate().delete(paciente);		
	}

	


}
