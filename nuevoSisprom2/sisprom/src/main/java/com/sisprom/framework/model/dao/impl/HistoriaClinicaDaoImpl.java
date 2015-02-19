package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.HistoriaClinica;
import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.model.dao.HistoriaClinicaDao;

public class HistoriaClinicaDaoImpl extends HibernateDaoSupport implements HistoriaClinicaDao{

//	@Override
	public List<HistoriaClinica> getAll() {
		Criteria criteria = getSession().createCriteria(HistoriaClinica.class);
		   criteria.addOrder(Order.asc("historiaClinicaId"));
		   return criteria.list();
	}

//	@Override
	public List<HistoriaClinica> find(HistoriaClinica historiaClinica) {
		Criteria criteria = getSession().createCriteria(HistoriaClinica.class);
		Integer id = historiaClinica.getHistoriaClinicaId();
		int pacienteId = historiaClinica.getPaciente().getPacienteId();
		int usuarioId= historiaClinica.getUsuario().getUsuarioId();
			
		System.out.println("entro");
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("historiaClinicaId",id));
		   
		   if(pacienteId > 0){
				criteria.createAlias("paciente","p").
						add(Restrictions.eq("p.pacienteId", pacienteId));
		   }
		   if(usuarioId > 0){
				criteria.createAlias("usuario","u").
						add(Restrictions.eq("u.usuarioId", usuarioId));
		   }
		   
	
		  
		   return criteria.list();
	}

//	@Override
	public void update(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().update(historiaClinica);		
	}

//	@Override
	public void save(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().save(historiaClinica);		
		
	}

//	@Override
	public void delete(HistoriaClinica historiaClinica) {
		this.getHibernateTemplate().delete(historiaClinica);
		
	}

	

}
