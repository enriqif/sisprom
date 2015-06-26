package com.sisprom.framework.model.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.AntecedenteGeneral;
import com.sisprom.framework.dominio.AntecedentePerPatologico;
import com.sisprom.framework.dominio.Consulta;
import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Paciente;
import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.model.dao.PacienteDao;

//Create by
//Modification by Martin

public class PacienteDaoImpl extends HibernateDaoSupport  implements PacienteDao{

//	@Override
	public void save(Paciente paciente) {
		
		this.getHibernateTemplate().save(paciente);
	}

//	@Override
	public void update(Paciente paciente) {

		this.getHibernateTemplate().update(paciente);
	}

//	@Override
	public Paciente getData(Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public void buildGraphics() {
		// TODO Auto-generated method stub
		
	}

//	@Override
	public void delete(Paciente paciente) {

		this.getHibernateTemplate().delete(paciente);		
	}

//	@Override
	public List<Paciente> getAll() {
		Criteria criteria = getSession().createCriteria(Paciente.class);
		   criteria.addOrder(Order.asc("pacienteId"));
		   return criteria.list();
	}

	@Override
	public List<Paciente> find(Paciente paciente) {
		Criteria criteria = getSession().createCriteria(Paciente.class);
		Integer id = paciente.getPacienteId();
		String nombre = paciente.getPacienteNombre();
		String apellido = paciente.getPacienteApellido();
		String dni = paciente.getPacienteDni();
		
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("pacienteId",id));
		   
		   if (nombre!=null && !nombre.isEmpty())
			   criteria.add(Restrictions.ilike("pacienteNombre", "%"+nombre+"%"));
		   if (apellido!=null && !apellido.isEmpty())
			   criteria.add(Restrictions.ilike("pacienteApellido", "%"+apellido+"%"));
		   if (dni!=null && !dni.isEmpty())
			   criteria.add(Restrictions.ilike("pacienteDni", "%"+dni+"%"));
		   		  
		   return criteria.list();
	}

	@Override
	public List<Paciente> findById(Integer id) {
		Criteria criteria = getSession().createCriteria(Paciente.class);
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("pacienteId",id));
		 
		   return criteria.list();
	}

	@Override
	public Consulta traerUltimaConsulta(Paciente paciente) {
		
		Boolean primeraFecha = true;
		Consulta extraConsulta = new Consulta();
		HistoriaClinica extraHist = new HistoriaClinica();
		Criteria criteria = getSession().createCriteria(Consulta.class);		
		List<Consulta> lista= criteria.list();
		if(lista.size()!=0){
			for (int i = 0; i < lista.size(); i++) {
				extraHist = lista.get(i).getHistoriaClinica();
				if (extraHist.getPaciente().getPacienteId()==paciente.getPacienteId() ){
					
					if (primeraFecha){
					extraConsulta = lista.get(i);
					primeraFecha= false;
					
					}else if (extraConsulta.getConsultaFecha().before(lista.get(i).getConsultaFecha())){
						extraConsulta = lista.get(i);
					}
				}
			}
		}		
		return extraConsulta;
	}

	@Override
	public List<Consulta> traerListaConsultaPaciente(Paciente paciente) {

		Consulta extraConsulta = new Consulta();
		List <Consulta> listaConsulta = new ArrayList<Consulta>();
		HistoriaClinica extraHist = new HistoriaClinica();
		Criteria criteria = getSession().createCriteria(Consulta.class);		
		List<Consulta> lista= criteria.list();
		
		if(lista.size()!=0){
			for (int i = 0; i < lista.size(); i++) {
				extraConsulta=lista.get(i);
				extraHist = extraConsulta.getHistoriaClinica();
				
				if (extraHist.getPaciente().getPacienteId()==paciente.getPacienteId() ){
					listaConsulta.add(extraConsulta);
					}
				}
			}		
		return listaConsulta;
	}

	@Override
	public AntecedenteGeneral traerAntecedenteGral(Paciente paciente) {
		
		AntecedenteGeneral extraAntGral= new AntecedenteGeneral();
		AntecedenteGeneral extraAntGralSalida= new AntecedenteGeneral();

		HistoriaClinica extraHist = new HistoriaClinica();
		Criteria criteria = getSession().createCriteria(AntecedenteGeneral.class);
		List<AntecedenteGeneral> lista= criteria.list();
		if(lista.size()!=0){
			for (int i = 0; i < lista.size(); i++) {
				extraAntGral=lista.get(i);
				extraHist = extraAntGral.getHistoriaClinica();
				if (extraHist.getPaciente().getPacienteId()==paciente.getPacienteId() ){
					extraAntGralSalida=extraAntGral;
				}
			}
		}		
		return extraAntGralSalida;
	}

	@Override
	public List<AntecedentePerPatologico> traerListaAntecedentesPatologico(Paciente paciente) {
		
		HistoriaClinica extraHist = new HistoriaClinica();
		AntecedentePerPatologico extraAntPat= new AntecedentePerPatologico();
		List<AntecedentePerPatologico> listaAntecPatologicos = new ArrayList<AntecedentePerPatologico>();

		Criteria criteria = getSession().createCriteria(AntecedentePerPatologico.class);
		List<AntecedentePerPatologico>  lista= criteria.list();
		if(lista.size()!=0){
			for (int i = 0; i < lista.size(); i++) {
				extraAntPat= lista.get(i);
				extraHist = extraAntPat.getHistoriaClinica();
				if (extraHist.getPaciente().getPacienteId()==paciente.getPacienteId() ){
					listaAntecPatologicos.add(extraAntPat);
				}
			}
		}
				
		return listaAntecPatologicos;
	}	
	

	

}
