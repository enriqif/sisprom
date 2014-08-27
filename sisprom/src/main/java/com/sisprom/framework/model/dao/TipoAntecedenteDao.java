package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.TipoAntecedente;

public interface TipoAntecedenteDao {
	List<TipoAntecedente>getAllTipoAntecedente();
	List<TipoAntecedente> find(TipoAntecedente tipoAntecedente);
	
	void register(TipoAntecedente tipoAntecedente);
	void edit(TipoAntecedente tipoAntecedente);
}
