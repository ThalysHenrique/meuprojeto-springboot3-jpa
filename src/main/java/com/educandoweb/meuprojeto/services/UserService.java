package com.educandoweb.meuprojeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.meuprojeto.entities.User;
import com.educandoweb.meuprojeto.repositories.UserRepository;


// @Component // registra a classe como componente do spring e vai ser injetado automaticamente com Autowired
@Service // registra como serviço
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}