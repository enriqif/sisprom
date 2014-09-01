package com.sisprom.framework.model.dao;

import java.util.List;

//Create by marto

public interface TeaTratamientoMedicamento {

	void save(TeaTratamientoMedicamento teaTratamientoMedicamento);
	void update(TeaTratamientoMedicamento teaTratamientoMedicamento);
	void delete(TeaTratamientoMedicamento teaTratamientoMedicamento);
	
	List<TeaTratamientoMedicamento> getAll();
	List<TeaTratamientoMedicamento> find(TeaTratamientoMedicamento teaTratamientoMedicamento);
}
