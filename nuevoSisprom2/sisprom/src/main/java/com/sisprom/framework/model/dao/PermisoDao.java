package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Permiso;

public interface PermisoDao {

	void save(Permiso permiso);
	void update(Permiso permiso);
	void delete(Permiso permiso);
	
	List<Permiso> getAll();
	List<Permiso> findById(Integer id);
	List<Permiso> find(Permiso permiso);
}
