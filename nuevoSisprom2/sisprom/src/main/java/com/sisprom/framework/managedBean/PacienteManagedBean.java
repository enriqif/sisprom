package com.sisprom.framework.managedBean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Usuario;

@ManagedBean
@SessionScoped
public class PacienteManagedBean extends MasterManagedBean {

	@ManagedProperty("#{loginManagedBean}")
	private LoginManagedBean currentLogedUser;

	final static Logger logger = Logger.getLogger(PacienteManagedBean.class);
	private Paciente paciente = new Paciente();

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

	public void dateSelectedAction(SelectEvent e) {
		Date date = (Date) e.getObject();
		logger.info("Date Selected Is:" + date);
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}
