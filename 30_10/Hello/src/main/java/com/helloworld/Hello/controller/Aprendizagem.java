package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizagem")

public class Aprendizagem {
	
	@GetMapping
	public String aprendizagem() {
		return "Objetos de aprendizagem: \n -MySQL \n -Spring-boot \n ";
	}
}
