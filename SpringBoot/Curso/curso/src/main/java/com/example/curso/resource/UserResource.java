package com.example.curso.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// importando a class user Ctrl + Shift + o
import com.example.curso.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> FindALL() {
		User u = new User(1L, "Guilherme", "guilfranca27@gmail.com", "61 99651-8333", "33218181");
		return ResponseEntity.ok().body(u);
	}
	
	
}
