package com.sisprom.framework.model.services;

import java.io.Serializable;
import java.util.List;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.dominio.AntecedentePerPatologico;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.DetallePatologia;
import com.sisprom.framework.dominio.Diagnostico;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Medicamento;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Patologia;
import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.TratamientoMedicamento;
import com.sisprom.framework.dominio.Tratamiento;
import com.sisprom.framework.dominio.Turno;
import com.sisprom.framework.dominio.Usuario;
import com.sisprom.framework.model.dao.AntecedenteGeneralDao;
import com.sisprom.framework.model.dao.AntecedentePerPatologicoDao;
import com.sisprom.framework.model.dao.ConsultaDao;
import com.sisprom.framework.model.dao.DetallePatologiaDao;
import com.sisprom.framework.model.dao.DiagnosticoDao;
import com.sisprom.framework.model.dao.HistoriaClinicaDao;
import com.sisprom.framework.model.dao.MedicamentoDao;
import com.sisprom.framework.model.dao.PacienteDao;
import com.sisprom.framework.model.dao.PatologiaDao;
import com.sisprom.framework.model.dao.PermisoDao;
import com.sisprom.framework.model.dao.TratamientoMedicamentoDao;
import com.sisprom.framework.model.dao.TratamientoDao;
import com.sisprom.framework.model.dao.TurnoDao;
import com.sisprom.framework.model.dao.UsuarioDao;


public class Services{

	
	/**
	 * 
	 */
	private PacienteDao pacienteDao;
	private TurnoDao turnoDao;
	private HistoriaClinicaDao historiaClinicaDao;
	private MedicamentoDao medicamentoDao;
	private ConsultaDao consultaDao;
	private DiagnosticoDao diagnosticoDao;
	private TratamientoDao tratamientoDao;
	private TratamientoMedicamentoDao  tratamientoMedicamentoDao;										  
	private PermisoDao permisoDao;
	private UsuarioDao usuarioDao;
	private PatologiaDao patologiaDao;
	private DetallePatologiaDao detallePatologiaDao;
	private AntecedentePerPatologicoDao antecedentePerPatologicoDao;
	private AntecedenteGeneralDao antecedenteGeneralDao;
	
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
	public List<Paciente> getAllPaciente(){
		return pacienteDao.getAll();
	}
	
	public List<Paciente> findByIdPaciente(Integer id){
		return pacienteDao.findById(id);
	}
	public List<Paciente> consultarPaciente(Paciente paciente){
		return pacienteDao.find(paciente);
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
	public List<Turno> getAllTurno(){
		return turnoDao.getAll();
	}
	public List<Turno> consultarTurno(Turno turno){
		return turnoDao.find(turno);
	}
	public List<Turno> findByIdTurno (Integer id){
		return turnoDao.findById(id);
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
	public List<HistoriaClinica> getAllHistoriaClinica(){
		return historiaClinicaDao.getAll();
	}
	public List<HistoriaClinica> consultarHistoriaClinica(HistoriaClinica historiaClinica){
		return historiaClinicaDao.find(historiaClinica);
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
	public List<Medicamento> getAllMedicamento(){
		return medicamentoDao.getAll();
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
	
	public List<Tratamiento> getAllTratamiento(){
		return tratamientoDao.getAll();
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
	
	public List<Consulta> getAllConsulta() {
		return consultaDao.getAll();
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
	
	public List<Diagnostico> getAllDiagnostico(){
		return diagnosticoDao.getAll();
	}
	// servicio TeaTratamientoMedicamento
	
	public void saveTratamientoMedicamento(TratamientoMedicamento tratamientoMedicamento){
		tratamientoMedicamentoDao.save(tratamientoMedicamento);	
	}
	public void updateTratamientoMedicamento(TratamientoMedicamento tratamientoMedicamento){
		tratamientoMedicamentoDao.update(tratamientoMedicamento);		
	}
	public void deleteTratamientoMedicamento(TratamientoMedicamento tratamientoMedicamento){
		tratamientoMedicamentoDao.delete(tratamientoMedicamento);
	}
	
	public List<TratamientoMedicamento> getAllTratamientoMedicamento(){
		return tratamientoMedicamentoDao.getAll();
	}
	
	//servicios patologia
	
	public void savePatologia(Patologia patologia){
		patologiaDao.save(patologia);
	}
	public void updatePatologia(Patologia patologia){
		patologiaDao.update(patologia);
	}
	public void deletePatologia(Patologia patologia){
		patologiaDao.delete(patologia);
	}
	
	public List<Patologia> getAllPatologia() {
		return patologiaDao.getAll();
	}
	public List<Patologia> findByIdPatologia(Integer id){
		return patologiaDao.findById(id);		
	}
	public List<Patologia> consultarPatologias(Patologia patologia){
		return patologiaDao.find(patologia);
	}
	
	// servicios Permiso
	
	public void savePermiso(Permiso permiso){
		permisoDao.save(permiso);
	}
	public void updatePermiso(Permiso permiso){
		permisoDao.update(permiso);
	}
	public void deletePermiso(Permiso permiso){
		permisoDao.delete(permiso);
	}
	
	public List<Permiso> getAllPermiso(){
		return permisoDao.getAll();
	}
	
	public List<Permiso> findByIdPermiso(Integer id){
		return permisoDao.findById(id);
	}
	public List<Permiso> consultarPermiso(Permiso permiso){
		return permisoDao.find(permiso);
	}
	
	//servicios Usario
	public void saveUsuario(Usuario usuario){
		usuarioDao.save(usuario);
	}
	
	public void updateUsuario(Usuario usuario){
		usuarioDao.update(usuario);
	}
	public void deleteUsuario(Usuario usuario){
		usuarioDao.delete(usuario);
	}
	
	public List<Usuario> getAllUsuario(){
		return usuarioDao.getAll();
	}
	public List<Usuario> consultarUsuario(Usuario usuario){
		return usuarioDao.find(usuario);
	}
	public Usuario loginUsuario(String usuario, String contrasenia){
		return usuarioDao.LoginUser(usuario, contrasenia);
	}
	
	//servicios DetallePatologia
	public void saveDetallePatologia(DetallePatologia detallePatologia){
		detallePatologiaDao.save(detallePatologia);
	}
	public void updateDetallePatologia(DetallePatologia detallePatologia){
		detallePatologiaDao.update(detallePatologia);
	}
	public void deleteDetallePatologia(DetallePatologia detallePatologia){
		detallePatologiaDao.delete(detallePatologia);
	}
	public List<DetallePatologia> getAllDetallePatologia (){
		return detallePatologiaDao.getAll();
	}
	
	//servicios antecedentes por patologia
	public void saveAntecedentePerPatologico(AntecedentePerPatologico antecedentePerPatologico){
		antecedentePerPatologicoDao.save(antecedentePerPatologico);
	}
	public void updateAntecedentePerPatologico(AntecedentePerPatologico antecedentePerPatologico){
		antecedentePerPatologicoDao.update(antecedentePerPatologico);
	}
	public void deleteAntecedentePerPatologico(AntecedentePerPatologico antecedentePerPatologico){
		antecedentePerPatologicoDao.delete(antecedentePerPatologico);
	}
	
	public List<AntecedentePerPatologico> getAllAntecedentePerPatologico(){
		return antecedentePerPatologicoDao.getAll();
	}
	
	//servicios antecedentes generales
	
	public void  saveAntecedenteGeneral (AntecedenteGeneral antecedenteGeneral){
		antecedenteGeneralDao.save(antecedenteGeneral);
	}
	public void  updateAntecedenteGeneral (AntecedenteGeneral antecedenteGeneral){
		antecedenteGeneralDao.update(antecedenteGeneral);
	}
	public void  deleteAntecedenteGeneral (AntecedenteGeneral antecedenteGeneral){
		antecedenteGeneralDao.delete(antecedenteGeneral);
	}
	
	public List<AntecedenteGeneral> getAllAntecedenteGeneral(){
		return antecedenteGeneralDao.getAll();
	}
	
	// getter and setters
	public TurnoDao getTurnoDao() {
		return turnoDao;
	}
	public void setTurnoDao(TurnoDao turnoDao) {
		this.turnoDao = turnoDao;
	}
	
	public PacienteDao getPacienteDao() {
		return pacienteDao;
	}
	public void setPacienteDao(PacienteDao pacienteDao) {
		this.pacienteDao = pacienteDao;
	}
	
	public HistoriaClinicaDao getHistoriaClinicaDao() {
		return historiaClinicaDao;
	}
	public void setHistoriaClinicaDao(HistoriaClinicaDao historiaClinicaDao) {
		this.historiaClinicaDao = historiaClinicaDao;
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
	public TratamientoMedicamentoDao getTratamientoMedicamentoDao() {
		return tratamientoMedicamentoDao;
	}
	public void setTratamientoMedicamentoDao(
			TratamientoMedicamentoDao tratamientoMedicamentoDao) {
		this.tratamientoMedicamentoDao = tratamientoMedicamentoDao;
	}
	public PermisoDao getPermisoDao() {
		return permisoDao;
	}
	public void setPermisoDao(PermisoDao permisoDao) {
		this.permisoDao = permisoDao;
	}
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	public PatologiaDao getPatologiaDao() {
		return patologiaDao;
	}
	public void setPatologiaDao(PatologiaDao patologiaDao) {
		this.patologiaDao = patologiaDao;
	}
	public DetallePatologiaDao getDetallePatologiaDao() {
		return detallePatologiaDao;
	}
	public void setDetallePatologiaDao(DetallePatologiaDao detallePatologiaDao) {
		this.detallePatologiaDao = detallePatologiaDao;
	}
	public AntecedentePerPatologicoDao getAntecedentePerPatologicoDao() {
		return antecedentePerPatologicoDao;
	}
	public void setAntecedentePerPatologicoDao(
			AntecedentePerPatologicoDao antecedentePerPatologicoDao) {
		this.antecedentePerPatologicoDao = antecedentePerPatologicoDao;
	}
	public AntecedenteGeneralDao getAntecedenteGeneralDao() {
		return antecedenteGeneralDao;
	}
	public void setAntecedenteGeneralDao(AntecedenteGeneralDao antecedenteGeneralDao) {
		this.antecedenteGeneralDao = antecedenteGeneralDao;
	}
	
	
}
