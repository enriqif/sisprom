package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.dominio.HistoriaClinica;



public interface AntecedenteGeneralDao {

	void save(AntecedenteGeneral antecedenteGeneral);
	void update(AntecedenteGeneral antecedenteGeneral);
	void delete(AntecedenteGeneral antecedenteGeneral);
	
	List<AntecedenteGeneral> getAll();
	List<AntecedenteGeneral> find(AntecedenteGeneral antecedenteGeneral);
	List<AntecedenteGeneral> findByHistoriaClinica(HistoriaClinica historiaClinica);
	
}
