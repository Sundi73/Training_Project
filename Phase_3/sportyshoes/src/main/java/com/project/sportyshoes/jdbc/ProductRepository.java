package com.project.sportyshoes.jdbc;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.sportyshoes.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
}