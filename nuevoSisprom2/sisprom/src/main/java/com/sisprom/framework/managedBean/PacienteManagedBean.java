package com.sisprom.framework.managedBean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

import com.sisprom.framework.dominio.Paciente;


@ManagedBean
@SessionScoped
public class PacienteManagedBean extends MasterManagedBean {

    final static Logger logger = Logger.getLogger(PacienteManagedBean.class);
    
	private Paciente paciente = new Paciente();

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public String nuevo(){
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
	        String today = new Date().toString();
	        Date hoy = formatter.parse(today);
			paciente.setFechaCreacion(hoy);
			logger.info(hoy);
			logger.info("este mensaje se muestra con el log4j");
	        paciente.setUsuarioCreacion("eflores");
			paciente.setUsuarioModificacion(null);
			paciente.setFechaModificacion(null);
			paciente.setHistoriaClinicas(null);

			logger.info("Continuar con la siguiente ventana");
			super.getServices().savePaciente(paciente);
			return "hecho";			
		} catch (Exception e) {
			//TODO
			//Se debe definir la vista cuando se produce un error
			return "errorGuardado";
		}
	}
	
	 public void dateSelectedAction(SelectEvent e){
	        Date date = (Date)e.getObject();
	        System.out.println("Date Selected Is ::"+date);
	    }
	
}
