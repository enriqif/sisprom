package com.sisprom.framework.managedBean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.dominio.AntecedentePerPatologico;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Usuario;

@ManagedBean
@SessionScoped
@ViewScoped
public class PacienteManagedBean extends MasterManagedBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5572377553645651412L;
	final static Logger logger = Logger.getLogger(PacienteManagedBean.class);
	
	private Paciente paciente;
	private List<Paciente> listaPacientes = new ArrayList<Paciente>();
	
	private AntecedenteGeneral antecedenteGeneral;
	
	private Consulta consulta;
	private HistoriaClinica historiaClinica;
	
	private List<Consulta> listaConsulta = new ArrayList<Consulta>();
	private List<Consulta> listaConsultax = new ArrayList<Consulta>();
	private List<AntecedentePerPatologico > listaAntecedentePatologico = new ArrayList<AntecedentePerPatologico>();
	
	public PacienteManagedBean(){
		paciente = new Paciente();
		setListaPacientes(super.getServices().getAllPaciente());
		consulta =new Consulta();
		antecedenteGeneral= new AntecedenteGeneral();
		
		setListaConsulta(super.getServices().getAllConsulta());
		setListaConsultax(super.getServices().getAllConsulta());
		setListaAntPatologico(super.getServices().getAllAntecedentePerPatologico());
	}

	public void cargar(Paciente paciente){
		
		
		listaPacientes = super.getServices().consultarPaciente(paciente);
		listaConsulta = super.getServices().listaConsultaPaciente(paciente);
		listaAntecedentePatologico = super.getServices().listaAntecPatologicos(paciente);
		
		paciente = listaPacientes.get(0);
		antecedenteGeneral = super.getServices().traerAntecedenteGral(paciente);
		System.out.println("hola "+ listaAntecedentePatologico.get(0).getAntecedentePerNombre());
		consulta = super.getServices().ultimaConsultaPaciente(paciente);
		
	}
	public String nuevo() {
		try {

			logger.debug("usuario: "+ LoginManagedBean.usuario.getUsuarioUsuario());
			String userTemp = LoginManagedBean.usuario.getUsuarioUsuario();

			Date ahora = new Date();
			SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
			paciente.setFechaCreacion(formateador.parse(formateador
					.format(ahora)));

			paciente.setUsuarioCreacion(userTemp);

			paciente.setUsuarioModificacion(null);
			paciente.setFechaModificacion(null);
			paciente.setHistoriaClinicas(null);
			paciente.setPacienteVisible(true);

			logger.info("Continuar con la siguiente ventana");
			super.getServices().savePaciente(paciente);
			return "hecho";
		} catch (Exception e) {
			// TODO
			// Se debe definir la vista cuando se produce un error

			logger.error(e.getMessage());
			logger.error("se produjo un error al guardar");
			return "error";
		}
	}
	
	public String limpiarlista() {
		setListaPacientes(super.getServices().getAllPaciente());
		return "confirmar";
	}

	public String limpiar() {
		setPaciente(new Paciente());
		return "confirmar";
	}
	
	public String buscar(){
		listaPacientes.clear();
		setListaPacientes(super.getServices().consultarPaciente(paciente));
		logger.debug("tamaño de la lista" + getListaPacientes().size());
		return limpiar();
	}
	
	public String historial() {
		paciente= getPaciente();
		cargar(paciente);
		
		return "historialPaciente";
	}
	public String nuevoPaciente(){
		return "nuevoPaciente";
	}
	
	public void dateSelectedAction(SelectEvent e) {
		Date date = (Date) e.getObject();
		logger.info("Date Selected Is:" + date);
	}
	
	public void actualizarPaciente(){
		logger.debug("se actualizará los datos del paciente seleccionado");
	}

	/**
	 * Methods getters and setters
	 * define functions above this comment ^^
	 */
	
	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getListaPacientes() {
		return listaPacientes;
	}

	public void setListaPacientes(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Consulta> getListaConsulta() {
		return listaConsulta;
	}

	public void setListaConsulta(List<Consulta> listaConsulta) {
		this.listaConsulta = listaConsulta;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public List<Consulta> getListaConsultax() {
		return listaConsultax;
	}

	public void setListaConsultax(List<Consulta> listaConsultax) {
		this.listaConsultax = listaConsultax;
	}

	public AntecedenteGeneral getAntecedenteGeneral() {
		return antecedenteGeneral;
	}

	public void setAntecedenteGeneral(AntecedenteGeneral antecedenteGeneral) {
		this.antecedenteGeneral = antecedenteGeneral;
	}

	public List<AntecedentePerPatologico> getListaAntPatologico() {
		return listaAntecedentePatologico;
	}

	public void setListaAntPatologico(
			List<AntecedentePerPatologico> listaAntPatologico) {
		this.listaAntecedentePatologico = listaAntPatologico;
	}


	
	
}
