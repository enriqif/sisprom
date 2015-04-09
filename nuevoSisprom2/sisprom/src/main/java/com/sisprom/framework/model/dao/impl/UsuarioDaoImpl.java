package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;
import com.sisprom.framework.model.dao.UsuarioDao;

public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao{

	@Override
	public void save(Usuario usuario) {
		
		this.getHibernateTemplate().save(usuario);
	}

	@Override
	public void update(Usuario usuario) {
		
		this.getHibernateTemplate().update(usuario);
	}

	@Override
	public void delete(Usuario usuario) {
		
		this.getHibernateTemplate().delete(usuario);
	}

	@Override
	public List<Usuario> getAll() {
		Criteria criteria = getSession().createCriteria(Usuario.class);
		   criteria.addOrder(Order.asc("usuarioId"));
		   return criteria.list();
	}

	@Override
	public List<Usuario> find(Usuario usuario) {
		Criteria criteria = getSession().createCriteria(Usuario.class);
		Integer id = usuario.getUsuarioId();
		String nombre = usuario.getUsuarioApellido();
		String dni = usuario.getUsuarioDni();
//		Integer permisoId= usuario.getPermiso().getPermisoId();
		   if (id!=null && !(id.toString().isEmpty()) && id!=0) 
			   criteria.add(Restrictions.eq("usuarioId",id));
		   
		   if (nombre!=null && !nombre.isEmpty())
			   criteria.add(Restrictions.ilike("usuarioApellido", "%"+nombre+"%"));
		   
		   if (dni!=null && !dni.isEmpty())
			   criteria.add(Restrictions.ilike("usuarioDni", "%"+dni+"%"));
		  
//		   if(permisoId > 0){
//				criteria.createAlias("permisoId","p").
//						add(Restrictions.eq("p.permisoId", permisoId));
//		   }
		   
		   return criteria.list();
	}

	@Override
	public Usuario LoginUser(String usuario, String contrasenia) {
		Usuario unUsuario=null;
		Criteria criteria = getSession().createCriteria(Usuario.class);
		   if (usuario!=null && !(usuario.toString().isEmpty())){
			   criteria.add(Restrictions.eq("usuarioUsuario",usuario));
		   }  
		   if(criteria.list().size()!=0){
			 Usuario userAux= (Usuario) criteria.list().get(0);
			 if(userAux.getUsuarioContrasenia().equals(contrasenia)){
				 unUsuario=userAux;
			 }
		   }
		return unUsuario;
	}

}
