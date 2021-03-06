package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.dominio.AntecedentePerPatologico;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.Paciente;

public interface PacienteDao {


	
	void save(Paciente paciente);
	void update(Paciente paciente);
	Paciente getData(Paciente paciente);
	void buildGraphics();
	void delete(Paciente paciente);
	
	List<Paciente>getAll();
	List<Paciente>find(Paciente paciente);
	List<Paciente> findById(Integer id);
	
	Consulta traerUltimaConsulta (Paciente paciente);
	List<Consulta> traerListaConsultaPaciente(Paciente paciente);
	AntecedenteGeneral traerAntecedenteGral(Paciente paciente);
	List<AntecedentePerPatologico> traerListaAntecedentesPatologico(Paciente paciente);
}
