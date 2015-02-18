package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.AntecedentePerPatologico;



public interface AntecedentePerPatologicoDao {

	void save(AntecedentePerPatologico antecedentePerPatologico);
	void update(AntecedentePerPatologico antecedentePerPatologico);
	void delete(AntecedentePerPatologico antecedentePerPatologico);
	
	List<AntecedentePerPatologico> getAll();
	List<AntecedentePerPatologico> find(AntecedentePerPatologico antecedentePerPatologico);
}
