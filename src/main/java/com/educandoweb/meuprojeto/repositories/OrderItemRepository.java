package com.educandoweb.meuprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.meuprojeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
