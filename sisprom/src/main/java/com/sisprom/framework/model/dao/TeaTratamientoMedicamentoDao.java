package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.TeaTratamientoMedicamento;

//Create by marto

public interface TeaTratamientoMedicamentoDao {

	void save(TeaTratamientoMedicamento teaTratamientoMedicamento);
	void update(TeaTratamientoMedicamento teaTratamientoMedicamento);
	void delete(TeaTratamientoMedicamento teaTratamientoMedicamento);
	
	List<TeaTratamientoMedicamentoDao> getAll();
	List<TeaTratamientoMedicamentoDao> find(TeaTratamientoMedicamento teaTratamientoMedicamento);
}
