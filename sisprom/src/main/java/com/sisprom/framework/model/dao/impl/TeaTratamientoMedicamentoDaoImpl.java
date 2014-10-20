package com.sisprom.framework.model.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.sisprom.framework.dominio.TeaTratamientoMedicamento;
import com.sisprom.framework.model.dao.TeaTratamientoMedicamentoDao;

public class TeaTratamientoMedicamentoDaoImpl extends HibernateDaoSupport implements TeaTratamientoMedicamentoDao {

	@Override
	public void save(TeaTratamientoMedicamento teaTratamientoMedicamento) {
		this.getHibernateTemplate().save(teaTratamientoMedicamento);		
		
	}

	@Override
	public void update(TeaTratamientoMedicamento teaTratamientoMedicamento) {
		this.getHibernateTemplate().update(teaTratamientoMedicamento);
		
	}

	@Override
	public void delete(TeaTratamientoMedicamento teaTratamientoMedicamento) {
		this.getHibernateTemplate().delete(teaTratamientoMedicamento);
		
	}

	@Override
	public List<TeaTratamientoMedicamentoDao> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeaTratamientoMedicamentoDao> find(
			TeaTratamientoMedicamento teaTratamientoMedicamento) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
