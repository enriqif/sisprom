package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.DetallePatologia;

public interface DetallePatologiaDao {

	void save(DetallePatologia detallePatologia);
	void update(DetallePatologia detallePatologia);
	void delete(DetallePatologia detallePatologia);
	
	List<DetallePatologia> getAll();
	List<DetallePatologia> find(DetallePatologia detallePatologia);
}
