package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivos")
public class ObjetivosDeAprendizagens {
	
	@GetMapping
	public String Objetivos() {
		return "Objetivos de aprendizagens dessa semana: <br>"
				+"Melhorar a orientação ao futuro <br>"
				+ "Melhorar a comunicação <br>"
				+ "Melhorar a responsabilidade de Crescimento <br>"; 
		
	}

}
