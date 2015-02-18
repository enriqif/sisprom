package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.TratamientoMedicamento;

//Create by marto

public interface TratamientoMedicamentoDao {

	void save(TratamientoMedicamento tratamientoMedicamento);
	void update(TratamientoMedicamento tratamientoMedicamento);
	void delete(TratamientoMedicamento tratamientoMedicamento);
	
	List<TratamientoMedicamento> getAll();
	List<TratamientoMedicamento> find(TratamientoMedicamento tratamientoMedicamento);
}
