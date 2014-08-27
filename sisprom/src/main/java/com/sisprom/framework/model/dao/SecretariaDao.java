package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Secretaria;

public interface SecretariaDao {

	List<Secretaria> getAll();
	List<Secretaria> find(Secretaria secretaria);
	
	void save (Secretaria secretaria);
	void delete(Secretaria secretaria);
	void update(Secretaria secretaria);
}
