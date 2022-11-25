package com.educandoweb.meuprojeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.meuprojeto.entities.Product;
import com.educandoweb.meuprojeto.repositories.ProductRepository;


// @Component // registra a classe como componente do spring e vai ser injetado automaticamente com Autowired
@Service // registra como serviço
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
