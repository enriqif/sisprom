package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Consulta;

public interface ConsultaDao {
	
	List<Consulta> getAllConsulta();
	List<Consulta> find(Consulta consulta);
	
	/**
	 * This method should save all data about an specific consultation for a single user
	 * 
	 * @param consulta
	 */
	void save(Consulta consulta);
	
	/**
	 * This method should update the information for a single user
	 * @param consulta
	 */
	void update(Consulta consulta);
	
	// Creacion Para pruebas
	void delete(Consulta consulta);

	
}
