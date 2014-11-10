package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Medico;


public interface MedicoDao {
	List<Medico>getAllMedico();
	List<Medico> find(Medico medico);
	
	void save(Medico medico);
	void update(Medico medico);
	void consult(Medico medico);
	
	// Creacion Para pruebas
	void delete(Medico medico);

}
