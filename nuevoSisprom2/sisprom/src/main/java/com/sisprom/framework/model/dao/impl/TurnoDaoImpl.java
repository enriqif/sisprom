package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Turno;
import com.sisprom.framework.model.dao.TurnoDao;

public class TurnoDaoImpl extends HibernateDaoSupport implements TurnoDao{

//	@Override
	public void save(Turno turno) {

		this.getHibernateTemplate().save(turno);		
	}

//	@Override
	public void update(Turno turno) {
		
		this.getHibernateTemplate().update(turno);
	}

//	@Override
	public void delete(Turno turno) {
		
		this.getHibernateTemplate().delete(turno);
	}

//	@Override
	public List<Turno> getAll() {
		Criteria criteria = getSession().createCriteria(Turno.class);
		   criteria.addOrder(Order.asc("turnoId"));
		   return criteria.list();
	}

//	@Override
	public List<Turno> find(Turno turno) {
		Criteria criteria = getSession().createCriteria(Permiso.class);
		Integer id = turno.getTurnoId();
		int pacienteId = turno.getPaciente().getPacienteId();
		if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("turnoId",id));
		 if(pacienteId > 0)
				criteria.createAlias("paciente","p").
						add(Restrictions.eq("p.id", pacienteId));		   
		  
		   return criteria.list();
	}

	@Override
	public List<Turno> findById(Integer id) {
		Criteria criteria = getSession().createCriteria(Permiso.class);
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("turnoId",id));
		 
		   return criteria.list();
	}

}
