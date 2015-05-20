package com.sisprom.framework.model.dao;

import java.util.List;

import com.sisprom.framework.dominio.Usuario;

public interface UsuarioDao {

	void save(Usuario usuario);
	void update(Usuario usuario);
	void delete(Usuario usuario);
	
	List<Usuario> getAll();
	List<Usuario> find(Usuario usuario);
	 Usuario LoginUser(String usuario, String password);
	 List<Usuario> findPersonal(Usuario usuario);
	 List<Usuario> getAllPersonal();
}
