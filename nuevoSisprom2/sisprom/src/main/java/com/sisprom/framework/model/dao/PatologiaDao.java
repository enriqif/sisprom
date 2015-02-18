package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Patologia;

public interface PatologiaDao {

	void save(Patologia patologia);
	void update(Patologia patologia);
	void delete(Patologia patologia);
	
	List<Patologia> getAll();
	List<Patologia> find(Patologia patologia);
	List<Patologia> findById(Integer id);
}
