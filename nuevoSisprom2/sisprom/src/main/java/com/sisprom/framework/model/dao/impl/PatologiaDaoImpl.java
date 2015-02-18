package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Patologia;
import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.model.dao.PatologiaDao;

public class PatologiaDaoImpl extends HibernateDaoSupport implements PatologiaDao{

	@Override
	public void save(Patologia patologia) {
		
		this.getHibernateTemplate().save(patologia);
	}

	@Override
	public void update(Patologia patologia) {
		
		this.getHibernateTemplate().update(patologia);
	}

	@Override
	public void delete(Patologia patologia) {
		
		this.getHibernateTemplate().delete(patologia);
	}

	@Override
	public List<Patologia> getAll() {
		Criteria criteria = getSession().createCriteria(Patologia.class);
		   criteria.addOrder(Order.asc("patologiaId"));
		   return criteria.list();
	}

	@Override
	public List<Patologia> find(Patologia patologia) {
		Criteria criteria = getSession().createCriteria(Patologia.class);
		Integer id = patologia.getPatologiaId();
		String nombre = patologia.getPatologiaNombre();
			
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("patologiaId",id));
		   
		   if (nombre!=null && !nombre.isEmpty())
			   criteria.add(Restrictions.ilike("patologiaNombre", "%"+nombre+"%"));
		   	  
		   return criteria.list();
	}

	@Override
	public List<Patologia> findById(Integer id) {
		Criteria criteria = getSession().createCriteria(Patologia.class);
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("patologiaId",id));
		 
		   return criteria.list();
	}

}
