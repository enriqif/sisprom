package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.model.dao.PermisoDao;

public class PermisoDaoImpl extends HibernateDaoSupport implements PermisoDao{

	@Override
	public void save(Permiso permiso) {
		
		this.getHibernateTemplate().save(permiso);
	}

	@Override
	public void update(Permiso permiso) {
		
		this.getHibernateTemplate().update(permiso);
	}

	@Override
	public void delete(Permiso permiso) {
		
		this.getHibernateTemplate().delete(permiso);
	}

	@Override
	public List<Permiso> getAll() {
		Criteria criteria = getSession().createCriteria(Permiso.class);
		   criteria.addOrder(Order.asc("permisoId"));
		   return criteria.list();
	}


	@Override
	public List<Permiso> findById(Integer id) {

		Criteria criteria = getSession().createCriteria(Permiso.class);
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("permisoId",id));
		 
		   return criteria.list();
	}

	@Override
	public List<Permiso> find(Permiso permiso) {
		
		Criteria criteria = getSession().createCriteria(Permiso.class);
		Integer id = permiso.getPermisoId();
		String nombre = permiso.getPermisoNombre();
		String permi = permiso.getPermisoPermiso();
		
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("permisoId",id));
		   
		   if (nombre!=null && !nombre.isEmpty())
			   criteria.add(Restrictions.ilike("permisoNombre", "%"+nombre+"%"));
		   
		   if (permi!=null && !permi.isEmpty())
			   criteria.add(Restrictions.ilike("permisoPermiso", "%"+permi+"%"));
		  
		   return criteria.list();
	}

}
