package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.TipoAntecedente;

public interface TipoAntecedenteDao {
	List<TipoAntecedente>getAllTipoAntecedente();
	List<TipoAntecedente> find(TipoAntecedente tipoAntecedente);
	
	void save(TipoAntecedente tipoAntecedente);
	void update(TipoAntecedente tipoAntecedente);
	// Creacion Para pruebas
	void delete(TipoAntecedente tipoAntecedente);

}
