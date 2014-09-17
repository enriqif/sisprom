package com.sisprom.framework.model.services;

import java.util.List;

import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.model.dao.ConsultaDao;
import com.sisprom.framework.model.dao.SecretariaDao;

public class Services {

	private SecretariaDao secretariaDao;

	// servicios de Comsulta
	public void save(Secretaria secretaria) {
		secretariaDao.save(secretaria);
		}
	
	public SecretariaDao getSecretariaDao() {
		return secretariaDao;
	}

	public void setSecretariaDao(SecretariaDao secretariaDao) {
		this.secretariaDao = secretariaDao;
	}
	

	
}
