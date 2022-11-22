package com.educandoweb.meuprojeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.meuprojeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
//	Retorna todos os usuários (findAll)
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(7L, "Thalys", "thalys@hotmail.com", "88889999", "77777777");
		return ResponseEntity.ok().body(u);
	}
}
