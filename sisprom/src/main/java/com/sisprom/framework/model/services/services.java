package com.sisprom.framework.model.services;

import java.util.List;

import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.model.dao.ConsultaDao;
import com.sisprom.framework.model.dao.SecretariaDao;

public class services {

	private ConsultaDao consultaDao;
	
	
	// servicios de Comsulta
	public void saveConsulta (Consulta consulta){
		
		consultaDao.save(consulta);
	}
	
	public void deleteConsulta(Consulta consulta){
		consultaDao.update(consulta);
	}
	public List<Consulta> getAllConsulta(){
		return consultaDao.getAllConsulta();
	}
	public List<Consulta> findConsulta(Consulta consulta){
		return consultaDao.find(consulta);
		
	}
}
