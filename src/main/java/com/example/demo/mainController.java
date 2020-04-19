package com.example.demo;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class mainController{
	
	String[] strDays = new String[] {"Domingo, lunes, Martes, Miercoles, Jueves, Viernes, Sabado"};
	
	@GetMapping("/datos")
	@ResponseBody
	public String datos() {
		return "Nombre: Gerardo Andres Castro Lemus, Carrera: Ingenieria informatica, carne: 00032515, annio: 4";
	}
	
	
	@PostMapping("/diasemana")
	@ResponseBody
	public String diaSemana(fecha f) {
		
		String dia = "";
		
		Calendar fechat = Calendar.getInstance();
		fechat.set(f.getAnnio(), f.getMes(), f.getDia());
		
		dia = strDays[fechat.get(Calendar.DAY_OF_WEEK)-1];
		
		return dia;
	}
	
}