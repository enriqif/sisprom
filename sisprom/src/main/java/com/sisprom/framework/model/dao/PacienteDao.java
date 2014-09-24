package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Paciente;

public interface PacienteDao {

	List<Paciente>getAll(Paciente paciente);
	List<Paciente>find(Paciente paciente);
	
	void save(Paciente paciente);
	void update(Paciente paciente);
	Paciente getData(Paciente paciente);
	void buildGraphics();
	
	void delete(Paciente paciente);

}
