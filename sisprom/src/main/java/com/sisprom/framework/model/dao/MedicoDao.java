package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Medico;


public interface MedicoDao {
	List<Medico>getAllMedico();
	List<Medico> find(Medico medico);
	
	void register(Medico medico);
	void edit(Medico medico);
	void consult(Medico medico);
}
