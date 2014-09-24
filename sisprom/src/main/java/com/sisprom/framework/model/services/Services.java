package com.sisprom.framework.model.services;

import java.util.List;


import com.sisprom.framework.dominio.Medico;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.model.dao.MedicoDao;
import com.sisprom.framework.model.dao.SecretariaDao;


public class Services {

	private SecretariaDao secretariaDao;
	private MedicoDao medicoDao;

	// servicios de Secretaria
	public void saveSecretaria(Secretaria secretaria) {
		secretariaDao.save(secretaria);
		}
	public void updateSecretaria(Secretaria secretaria){
		secretariaDao.update(secretaria);
	}
	public void deleteSecretaria (Secretaria secretaria){
		secretariaDao.delete(secretaria);
	}
	
	// servico Medico
	
	public void saveMedico(Medico medico){
		medicoDao.save(medico);
	}
	public void updateMedico(Medico medico){
		medicoDao.update(medico);
	}
	public void deleteMedico(Medico medico){
		medicoDao.delete(medico);
	}
	
	
	// getter and setters
	
	public SecretariaDao getSecretariaDao() {
		return secretariaDao;
	}
	public void setSecretariaDao(SecretariaDao secretariaDao) {
		this.secretariaDao = secretariaDao;
	}
	public MedicoDao getMedicoDao() {
		return medicoDao;
	}
	public void setMedicoDao(MedicoDao medicoDao) {
		this.medicoDao = medicoDao;
	}
	
}
