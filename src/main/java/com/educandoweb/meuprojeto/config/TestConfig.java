package com.educandoweb.meuprojeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.meuprojeto.entities.User;
import com.educandoweb.meuprojeto.repositories.UserRepository;

@Configuration
@Profile("test") // nome tem que ser igual ao nome do arquivo --> application.properties
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "John Wick", "john@gmail.com", "987876565", "987"); 
		User u2 = new User(null, "Samantha Winchester", "samantha@gmail.com", "11988774455", "123"); 

		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
