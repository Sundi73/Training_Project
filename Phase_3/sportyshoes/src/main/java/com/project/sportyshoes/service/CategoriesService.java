package com.project.sportyshoes.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.sportyshoes.entity.Categories;
import com.project.sportyshoes.jdbc.CategoriesRepository;
@Service
@Transactional
public class CategoriesService {
	@Autowired
	private CategoriesRepository catrepo;
	
	public List<Categories> listAll()
	{
		return catrepo.findAll();
	}
	public void save(Categories categories)
	{
	 catrepo.save(categories);
	}
	public Categories get(long id)
	{
		return catrepo.findById(id).get();
	}
	public void delete(long id)
	{
		catrepo.deleteById(id);
	}
}