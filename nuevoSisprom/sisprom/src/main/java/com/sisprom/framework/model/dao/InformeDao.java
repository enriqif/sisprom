package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Informe;

public interface InformeDao {

	List<Informe> getAllInforme();
	List<Informe> find(Informe informe);
	/**
	 * This method should be separated into pieces to implement diferents method 
	 * to generate statistical graphics. 
	 */
	void createInforme();
	
}
