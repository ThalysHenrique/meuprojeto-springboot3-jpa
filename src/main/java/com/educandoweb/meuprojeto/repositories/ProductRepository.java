package com.educandoweb.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.meuprojeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
