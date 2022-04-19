package com.project.sportyshoes.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.sportyshoes.entity.Categories;
import com.project.sportyshoes.entity.Product;
import com.project.sportyshoes.jdbc.ProductRepository;
@Service
public class ProductService {
	@Autowired
	public ProductRepository prodrepo;
	public List<Product> listAll()
	{
return prodrepo.findAll();
	}
	public void save(Product product)
	{
		prodrepo.save(product);
	}
}