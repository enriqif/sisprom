package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Diagnostico;

public interface DiagnosticoDao {

	void save(Diagnostico diagnostico);
	void update(Diagnostico diagnostico);
	void delete (Diagnostico diagnstico);
	
	List<Diagnostico> getAll();
	List<Diagnostico> find(Diagnostico diagnostico);
	
}
