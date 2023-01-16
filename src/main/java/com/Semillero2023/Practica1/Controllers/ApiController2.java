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
@RequestMapping("/api-2")
public class ApiController2 {
	
	private final ApiService2 apiService2 = new ApiService2();
	
	@GetMapping(path="/league")
	public String getRoot(){
		return "Si llego a League";
	}
	
	@GetMapping(path="/team/{team}")
	public ResponseEntity<List<Api2Response1>> getTeam(
			@PathVariable("team") String team) throws JsonMappingException, JsonProcessingException{
		return new ResponseEntity<List<Api2Response1>>(apiService2.getTeam(team), HttpStatus.OK);
	}
	
	@GetMapping(path="/league/{league}")
	public ResponseEntity<List<Api2Response1>> getLeague(
			@PathVariable("league") String league) throws JsonMappingException, JsonProcessingException{
		return new ResponseEntity<List<Api2Response1>>(apiService2.getLeague(league), HttpStatus.OK);
	}

	@GetMapping(path="/test/{artist}")
	public ResponseEntity<NewsResponse> getLeague2(
			@PathVariable("artist") String artist) throws JsonMappingException, JsonProcessingException{
		return new ResponseEntity<>(apiService2.getLeague2(artist), HttpStatus.OK);
	}
	
	@GetMapping(path="/test2/{artist}")
	public ResponseEntity<FeedResponse> getLeague3(
			@PathVariable("artist") String artist) throws JsonMappingException, JsonProcessingException{
		return new ResponseEntity<>(apiService2.getLeague3(artist), HttpStatus.OK);
	}
}
