package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.ecommerce.entity.EproductEntity;
import com.ecommerce.service.EproductService;

@Controller
public class EproductController {
	
	private EproductService eProductService;

	
	public String listProducts(ModelMap map) {
		
		map.addAttribute("eproduct", new EproductEntity());
		map.addAttribute("productList", eProductService.getAllProducts());
		return "productList";
	}
}
