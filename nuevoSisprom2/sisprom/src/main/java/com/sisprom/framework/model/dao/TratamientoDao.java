package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Tratamiento;

public interface TratamientoDao {

	 List<Tratamiento> getAll();
	 List<Tratamiento> find(Tratamiento tratamiento);
	 
	 void save(Tratamiento tratamiento);
	 void update(Tratamiento tratamiento);
	 
	 /**
	  * This method should be defined to understand what should do
	  * The require is not clearly defined
	  */
	 void buildGraphic();
	// Creacion Para pruebas
	void delete(Tratamiento tratamiento);

}
