package com.selimhorri.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.models.Person;

@RestController
@RequestMapping(value = {"/api"})
public class PersonRestController {
	
	@GetMapping(value = {"/person"})
	public ResponseEntity<Person> find() {
		return new ResponseEntity<>(new Person(1, "Selim", "Horri"), HttpStatus.OK);
	}
	
	
	
}










