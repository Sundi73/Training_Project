package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.EproductDAO;
import com.ecommerce.entity.EproductEntity;

@Service
public class EproductService {

	@Autowired
	EproductDAO eproductDAO;
	
	public List<EproductEntity> getAllProducts(){
	return eproductDAO.getAllProduct();
}
	
}
