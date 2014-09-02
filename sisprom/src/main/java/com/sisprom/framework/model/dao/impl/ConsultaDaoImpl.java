package com.sisprom.framework.model.dao.impl;

import java.util.List;

import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.model.dao.ConsultaDao;

import com.sisprom.framework.model.xml.hibernate.util.HibernateUtil;

//Create by
//Modification by Marto

public class ConsultaDaoImpl  implements ConsultaDao {

	@Override
	public List<Consulta> getAllConsulta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consulta> find(Consulta consulta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Consulta consulta) {
		// TODO Auto-generated method stub
		
		//this.getHibernateTemplate().save(consulta);
	}

	@Override
	public void update(Consulta consulta) {
		// TODO Auto-generated method stub
		
	}



}
