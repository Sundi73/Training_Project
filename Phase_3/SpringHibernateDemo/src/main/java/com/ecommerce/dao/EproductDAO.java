package com.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EproductEntity;


@Repository
public class EproductDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	@SuppressWarnings("unchecked")
	public List<EproductEntity> getAllProduct(){
		
		return this.sessionfactory.openSession().createQuery("from EproductEntity").list();
	}

}
