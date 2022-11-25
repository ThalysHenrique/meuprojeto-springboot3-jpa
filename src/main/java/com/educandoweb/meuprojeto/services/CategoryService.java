package com.educandoweb.meuprojeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.meuprojeto.entities.Category;
import com.educandoweb.meuprojeto.repositories.CategoryRepository;


// @Component // registra a classe como componente do spring e vai ser injetado automaticamente com Autowired
@Service // registra como serviço
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
