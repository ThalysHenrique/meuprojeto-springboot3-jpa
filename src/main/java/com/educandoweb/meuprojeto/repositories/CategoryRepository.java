package com.educandoweb.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.meuprojeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
