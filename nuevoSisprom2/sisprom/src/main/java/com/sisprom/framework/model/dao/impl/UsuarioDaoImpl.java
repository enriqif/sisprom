package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sisprom.framework.dominio.Permiso;
import com.sisprom.framework.dominio.Usuario;
import com.sisprom.framework.managedBean.LoginManagedBean;
import com.sisprom.framework.model.dao.UsuarioDao;

public class UsuarioDaoImpl extends HibernateDaoSupport implements UsuarioDao{
    final static Logger logger = Logger.getLogger(UsuarioDaoImpl.class);
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
		
			criteria.add(Restrictions.eq("usuarioVisible",true));
			criteria.addOrder(Order.asc("usuarioId"));
			return criteria.list();
	}

	@Override
	public List<Usuario> find(Usuario usuario) {
			
		Criteria criteria = getSession().createCriteria(Usuario.class);
		String palabra = usuario.getUsuarioApellido();
					
		   if (palabra!=null && !palabra.isEmpty() ){
			   if (!palabra.matches("[0-9]*")) {
				   criteria.add(Restrictions.eq("usuarioVisible",true));
				   Criterion apellido = Restrictions.ilike("usuarioApellido", "%"+palabra+"%");
			        Criterion nombre = Restrictions.ilike("usuarioNombre", "%"+palabra+"%");
			        LogicalExpression orExp = Restrictions.or(apellido,nombre);
			        criteria.add(orExp);
			        
				} else{
				   criteria.add(Restrictions.like("usuarioDni", "%"+palabra+"%"));
				   criteria.add(Restrictions.eq("usuarioVisible",true));
			   }
		   }else {
			   criteria.add(Restrictions.eq("usuarioVisible",true));
		}
		   
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
