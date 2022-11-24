package com.educandoweb.meuprojeto.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.meuprojeto.entities.Order;
import com.educandoweb.meuprojeto.entities.User;
import com.educandoweb.meuprojeto.entities.enums.OrderStatus;
import com.educandoweb.meuprojeto.repositories.OrderRepository;
import com.educandoweb.meuprojeto.repositories.UserRepository;

@Configuration
@Profile("test") // nome tem que ser igual ao nome do arquivo --> application.properties
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "John Wick", "john@gmail.com", "987876565", "987"); 
		User u2 = new User(null, "Samantha Winchester", "samantha@gmail.com", "11988774455", "123"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1); 

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
}
