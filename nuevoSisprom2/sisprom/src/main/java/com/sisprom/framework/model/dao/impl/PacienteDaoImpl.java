package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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
	


}
