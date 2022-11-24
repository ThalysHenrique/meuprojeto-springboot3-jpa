package com.educandoweb.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.meuprojeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
