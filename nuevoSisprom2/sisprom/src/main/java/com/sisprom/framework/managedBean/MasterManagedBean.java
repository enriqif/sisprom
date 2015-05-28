package com.sisprom.framework.managedBean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.hibernate.loader.custom.Return;


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
import com.sisprom.framework.model.services.Services;
import com.sisprom.framework.model.xml.context.Context;

@ManagedBean
@SessionScoped

public class MasterManagedBean {

	private Services services = Context.getBeanFacade();
	public Usuario usu;
	public String llamada(){
		
		return "index2.xhtml";
	}
	public String redireccionar() {
//		
//		
		Paciente pac = new Paciente(1, "pacienteNombre1", "pacienteApellido1", "Dni", "pacienteTelefono", "pacienteDomicilioCalle", "pacienteObraSocial", "20", "usuarioCreacion", null, "usuarioModificacion", null, "EstadoCivil", null, "Sexo", "pacienteLugarNacimiento", "pacienteProfesion", "NumeroAfiliado", "pacienteDomicilioNumero", "pacienteDomicilioBarrio");
//		services.savePaciente(pac);
//
		Turno turn = new Turno(2, pac, null, null, "usuarioCreacion2", null, "usuarioModificacion1", null);
//		services.saveTurno(turn);
			
		Medicamento medito = new Medicamento(1, "medicamentoNombre", "medicamentoDescripcion", "usuarioCreacion", null, "usuarioModificacion", null);
		//services.saveMedicamento(medito);
		
		Permiso per = new Permiso(1, "permisoNombre1", "permisoPermiso1", "permisoDescripcion1", null, null, "usuarioCreacion", "usuarioModificacion");
//		services.savePermiso(per);
		
		Usuario usu = new Usuario(1,per, "usuarioNombre", "usuarioApellido", "usuarioDni", "usuarioTelefono", "usuarioDomicilioBarrio", "usuarioUsuario", "usuarioContrasenia", "usuarioRol", "usuarioObraSocial", "20", "Matricula", "Especialidad", null, null, null, null, "usuarioCreacion", "usuarioModificacion", "usuarioDomicilioCalle", "usuarioDomicilioNumero");
//		services.saveUsuario(usu);
		
		Patologia pato= new Patologia(2, "patologiaNombre2", "patologiaDescripcion2",null, null, "usuarioCreacion", "usuarioModificacion");
//		services.savePatologia(pato);
		
		DetallePatologia detpato= new DetallePatologia(2, pato, "detallePatNombre2", "detallePatDescripcion2", null, null, "usuarioCreacion", "usuarioModificacion");
//		services.saveDetallePatologia(detpato);
		
		HistoriaClinica histC = new HistoriaClinica(2, pac, usu, "usuarioCreacion2", null, "usuarioModificacion1", null);
//		services.saveHistoriaClinica(histC);

		AntecedentePerPatologico antPerPato = new AntecedentePerPatologico(2, detpato, histC, "antecPerNombre2", "antecPerDescripcion1", "usuarioCreacion", null, "usuarioModificacion", null);
//		services.saveAntecedentePerPatologico(antPerPato);
		
		AntecedenteGeneral AntGral = new AntecedenteGeneral(2, histC, "5", "usuarioCreacion1", null, "usuarioModificacion1", null, "antecTalla1", "anteceCcefalic1", "antecPartoNormal1", "antecPartoDistocico", "antecPartoCesaria", "antecComplicaciones", "antecScoredeapgar", "antecSocioEconomico", "antecDiabetes", "antecAsma", "antecTbc", "antecHipertension", "antecPadre", "antecMadre", "antecHijos", "antecHermanos", "anteceTabaco", "antecAlcohol", "antecAdiccion", null, "antecTipooperacion", null, "antecLocalizacion", "antecPeso", "anteceGeneralTalla", "antecTensionarterial", "antecePielyfaneras", "antecVision", "antecAudicion", "antecOdontologia", "antecObesidad", "antecPesonormal", "antecPesobajo", "antecReaccionAdversa");
//		services.saveAntecedenteGeneral(AntGral);
		
		Consulta cons = new Consulta(2, histC, "consultaDescripcion2", "usuarioCreacion1", null, "usuarioModificacion", null, null, "consulExamenFisico", "consultaEvolucion");
//		services.saveConsulta(cons);
		
		Diagnostico diag= new Diagnostico(2, cons, "diagnosticoDescripcion2", "usuarioCreacion", null, "usuarioModificacion", null);
//		services.saveDiagnostico(diag);
		
		Tratamiento trata= new Tratamiento(2, diag, "tratamientoDescripcion2", "usuarioCreacion", null, "usuarioModificacion", null);
//		services.saveTratamiento(trata);
		
		Medicamento medi= new Medicamento(2, "medicamentoNombre2","medicamentoDescripcion2", "usuarioCreacion", null, "usuarioModificacion", null);
//		services.saveMedicamento(medi);
		
		TratamientoMedicamento trataMedi= new TratamientoMedicamento(2, trata, medi, "usuarioCreacion2", null, "usuarioModificacion1", null);
//		services.saveTratamientoMedicamento(trataMedi);	
		
		List<Usuario> listax = services.getAllUsuario();
		  for(Usuario p: listax){
			  System.out.println(p.getUsuarioApellido());
		  }
		
		
//		List<HistoriaClinica> lista = services.consultarHistoriaClinica(histC);
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println("entro2");
//
//			System.out.println(lista.get(i).getUsuarioCreacion());
//		}
		
//		Usuario prueba = services.loginUsuario("mcarrizo", "mcarrizo");
//		System.out.println(prueba.getUsuarioApellido());
		
		
		return "index2.xhtml";
		}


	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}
	public Usuario getUsu() {
		return usu;
	}
	public void setUsu(Usuario usu) {
		this.usu = usu;
	}
	
	
}
