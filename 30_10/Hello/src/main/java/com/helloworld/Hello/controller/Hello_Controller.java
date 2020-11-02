package com.helloworld.Hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello_Controller {
	
	@GetMapping
	public String hello() {
		return "Hello!! \n -Atenção aos Detalhes \n -Mentalidade de Crescimento";
	}

}


