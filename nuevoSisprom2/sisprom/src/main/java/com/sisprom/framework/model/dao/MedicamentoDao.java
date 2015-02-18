package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Medicamento;

//Create by marto
public interface MedicamentoDao {

	void save(Medicamento medicamento);
	void update(Medicamento medicamento);
	void delete(Medicamento medicamento);
	
	List<Medicamento> getAll();
	List<Medicamento> find(Medicamento medicamento);
}
