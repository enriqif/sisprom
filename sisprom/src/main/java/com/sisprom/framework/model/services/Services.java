package com.sisprom.framework.model.services;

import java.util.List;


import com.sisprom.framework.dominio.Antecedente;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.Diagnostico;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Medicamento;
import com.sisprom.framework.dominio.Medico;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Secretaria;
import com.sisprom.framework.dominio.TipoAntecedente;
import com.sisprom.framework.dominio.Tratamiento;
import com.sisprom.framework.dominio.Turno;
import com.sisprom.framework.model.dao.AntecedenteDao;
import com.sisprom.framework.model.dao.ConsultaDao;
import com.sisprom.framework.model.dao.DiagnosticoDao;
import com.sisprom.framework.model.dao.HistoriaClinicaDao;
import com.sisprom.framework.model.dao.MedicamentoDao;
import com.sisprom.framework.model.dao.MedicoDao;
import com.sisprom.framework.model.dao.PacienteDao;
import com.sisprom.framework.model.dao.SecretariaDao;
import com.sisprom.framework.model.dao.TipoAntecedenteDao;
import com.sisprom.framework.model.dao.TratamientoDao;
import com.sisprom.framework.model.dao.TurnoDao;


public class Services {

	private SecretariaDao secretariaDao;
	private MedicoDao medicoDao;
	private PacienteDao pacienteDao;
	private TurnoDao turnoDao;
	private TipoAntecedenteDao tipoAntecedenteDao;
	private HistoriaClinicaDao historiaClinicaDao;
	private AntecedenteDao antecedenteDao;
	private MedicamentoDao medicamentoDao;
	private ConsultaDao consultaDao;
	private DiagnosticoDao diagnosticoDao;
	private TratamientoDao tratamientoDao;
	
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
	
	// Servicio Pacientes
	
	public void savePaciente(Paciente paciente){
		pacienteDao.save(paciente);
	}	
	public void updatePaciente(Paciente paciente){
		pacienteDao.update(paciente);
	}	
	public void deletePaciente(Paciente paciente){
		pacienteDao.delete(paciente);
	}
	
	// Servicio Turno
	public void saveTurno(Turno turno){
		turnoDao.save(turno);
	}
	public void updateTurno(Turno turno){
		turnoDao.update(turno);
	}
	public void deleteTurno(Turno turno){
		turnoDao.delete(turno);
	}
	// servicio TipoAntecedente
	
	public void saveTipoAntecedente(TipoAntecedente tipoAntecedente){
		tipoAntecedenteDao.save(tipoAntecedente);
	}
	public void updateTipoAntecedente(TipoAntecedente tipoAntecedente){
		tipoAntecedenteDao.update(tipoAntecedente);
	}
	public void deleteTipoAntecedente(TipoAntecedente tipoAntecedente){
		tipoAntecedenteDao.delete(tipoAntecedente);
	}
	
	// servicio TipoAntecedente
	public void saveHistoriaClinica(HistoriaClinica historiaClinica){
		historiaClinicaDao.save(historiaClinica);
	}
	public void updateHistoriaClinica(HistoriaClinica historiaClinica){
		historiaClinicaDao.update(historiaClinica);
	}
	public void deleteHistoriaClinica(HistoriaClinica historiaClinica){
		historiaClinicaDao.delete(historiaClinica);
	}
	
	// servicio TipoAntecedente
	public void saveAntecedente(Antecedente antecedente){
		antecedenteDao.save(antecedente);
	}
	public void updateAntecedente(Antecedente antecedente){
		antecedenteDao.update(antecedente);
	}
	public void deleteAntecedente(Antecedente antecedente){
		antecedenteDao.delete(antecedente);
	}
	
	// servicios Medicamento
	
	public void saveMedicamento(Medicamento medicamento){
		medicamentoDao.save(medicamento);
	}
	public void updateMedicamento(Medicamento medicamento){
		medicamentoDao.update(medicamento);
	}
	public void deleteMedicamento(Medicamento medicamento){
		medicamentoDao.delete(medicamento);
	}
	// servicios Tratamiento
	public void saveTratamiento(Tratamiento tratamiento){
		tratamientoDao.save(tratamiento);
	}
	public void updateTratamiento(Tratamiento tratamiento){
		tratamientoDao.update(tratamiento);
	}
	public void deleteTratamiento(Tratamiento tratamiento){
		tratamientoDao.delete(tratamiento);
	}
	
	// servicios Consulta

	public void saveConsulta(Consulta consulta){
		consultaDao.save(consulta);
	}
	public void updateConsulta(Consulta consulta){
		consultaDao.update(consulta);
	}
	public void deleteConsulta(Consulta consulta){
		consultaDao.delete(consulta);
	}
	
	// servicios Diagnostico
	
	public void saveDiagnostico(Diagnostico diagnostico){
		diagnosticoDao.save(diagnostico);
	}
	public void updateDiagnostico(Diagnostico diagnostico){
		diagnosticoDao.update(diagnostico);
	}
	public void deleteDiagnostico(Diagnostico diagnostico){
		diagnosticoDao.delete(diagnostico);
	}
	
	// getter and setters
	public TurnoDao getTurnoDao() {
		return turnoDao;
	}
	public void setTurnoDao(TurnoDao turnoDao) {
		this.turnoDao = turnoDao;
	}
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
	public PacienteDao getPacienteDao() {
		return pacienteDao;
	}
	public void setPacienteDao(PacienteDao pacienteDao) {
		this.pacienteDao = pacienteDao;
	}
	public TipoAntecedenteDao getTipoAntecedenteDao() {
		return tipoAntecedenteDao;
	}
	public void setTipoAntecedenteDao(TipoAntecedenteDao tipoAntecedenteDao) {
		this.tipoAntecedenteDao = tipoAntecedenteDao;
	}
	public HistoriaClinicaDao getHistoriaClinicaDao() {
		return historiaClinicaDao;
	}
	public void setHistoriaClinicaDao(HistoriaClinicaDao historiaClinicaDao) {
		this.historiaClinicaDao = historiaClinicaDao;
	}
	public AntecedenteDao getAntecedenteDao() {
		return antecedenteDao;
	}
	public void setAntecedenteDao(AntecedenteDao antecedenteDao) {
		this.antecedenteDao = antecedenteDao;
	}
	public MedicamentoDao getMedicamentoDao() {
		return medicamentoDao;
	}
	public void setMedicamentoDao(MedicamentoDao medicamentoDao) {
		this.medicamentoDao = medicamentoDao;
	}
	public TratamientoDao getTratamientoDao() {
		return tratamientoDao;
	}
	public void setTratamientoDao(TratamientoDao tratamientoDao) {
		this.tratamientoDao = tratamientoDao;
	}
	public ConsultaDao getConsultaDao() {
		return consultaDao;
	}
	public void setConsultaDao(ConsultaDao consultaDao) {
		this.consultaDao = consultaDao;
	}
	public DiagnosticoDao getDiagnosticoDao() {
		return diagnosticoDao;
	}
	public void setDiagnosticoDao(DiagnosticoDao diagnosticoDao) {
		this.diagnosticoDao = diagnosticoDao;
	}
	
	
	
}
