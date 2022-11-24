package com.educandoweb.meuprojeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.meuprojeto.entities.Order;
import com.educandoweb.meuprojeto.repositories.OrderRepository;


// @Component // registra a classe como componente do spring e vai ser injetado automaticamente com Autowired
@Service // registra como serviço
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
