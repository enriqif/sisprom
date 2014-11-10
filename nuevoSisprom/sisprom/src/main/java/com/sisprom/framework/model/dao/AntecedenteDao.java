package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Antecedente;


public interface AntecedenteDao {
	List<Antecedente>getAllAntecedente();
	List<Antecedente> find(Antecedente antecedente);
	
	void save(Antecedente antecedente);
	void update(Antecedente antecedente);
	// Creacion Para pruebas
	void delete(Antecedente antecedente);

}
