package com.Semillero2023.Practica1.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Semillero2023.Practica1.Estructuras.*;
import com.Semillero2023.Practica1.Services.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController1 {
	
	private final ApiService1 apiService1 = new ApiService1();
	
	@GetMapping(path="/find")
	public String getRoot(){
		return "Si llego";
	}
	
	@GetMapping(path="/find/{artist}")
	public ResponseEntity<List<ApiResponse1>> getFind(
			@PathVariable("artist") String artist) throws JsonMappingException, JsonProcessingException{
		return new ResponseEntity<>(apiService1.getFind(artist), HttpStatus.OK);
	}
}
