package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Turno;

public interface TurnoDao {

	void save(Turno turno);
	void update(Turno turno);
	void delete(Turno turno);
	
	List<Turno> getAll();
	List<Turno> find(Turno turno);
}
