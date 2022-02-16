package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class HelloController {
	
	@GetMapping
	public String getHello () {
		return "Orientação aos detalhes e Persistência.";
				
				
	}
	
	@GetMapping("/objetivos")	
	public String getHello2() {
		return "Aprender o maximo de Spring e fazer as tasks do Projeto Integrador.";
}
	}
