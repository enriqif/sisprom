package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.HistoriaClinica;


public interface HistoriaClinicaDao {
	List<HistoriaClinica> getAll();
	List<HistoriaClinica> find(HistoriaClinica historiaClinica);
	
	void update(HistoriaClinica historiaClinica);
	void save(HistoriaClinica historiaClinica);
	// Creacion Para pruebas
	void delete(HistoriaClinica historiaClinica);

}
