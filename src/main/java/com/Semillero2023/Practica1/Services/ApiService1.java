package com.Semillero2023.Practica1.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Semillero2023.Practica1.Estructuras.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApiService1 {
	
	private String Api_IOS = "https://itunes.apple.com/search?term=";
	private String Api_TV = "https://api.tvmaze.com/search/people?q=";
	private RestTemplate restTemplate = new RestTemplate();
	private ObjectMapper mapper = new ObjectMapper();
	
	public List<ApiResponse1> getFind(String artist) throws JsonMappingException, JsonProcessingException{
		
		String contenido = restTemplate.getForObject(Api_IOS + artist.replace("%20", "+"), String.class);
		
		SongIOSResult result = mapper.readValue(contenido, SongIOSResult.class);
		
		contenido = restTemplate.getForObject(Api_TV + artist, String.class);
		TvmazeResult[] result2 = mapper.readValue(contenido, TvmazeResult[].class);
		
		List<ApiResponse1> resultPra1 = new ArrayList<ApiResponse1>();
		List<SongIOS> tempA = result.getResults();
		List<TvmazeResult> tempB = Arrays.asList(result2);
		
		for(int i=0; i<tempB.size();i++) {
			PersonTvmaze temp = tempB.get(i).getPerson();
			
			if(temp.getName().toLowerCase().equals(artist.toLowerCase())) {
				ApiResponse1 nuevo = new ApiResponse1(temp.getName(), temp.getTrackName(), temp.getType(), temp.getService(), temp.getServiceUrl());
		    	  resultPra1.add(nuevo);
			}
		}
		
		for (int i=0;i<tempA.size();i++) {
		      SongIOS temp2 = tempA.get(i);
		      
		      if(temp2.getName().toLowerCase().equals(artist.replace("%20", " ").toLowerCase())) {
		    	  ApiResponse1 nuevo = new ApiResponse1(temp2.getName(), temp2.getTrackName(), temp2.getType(), temp2.getService(), temp2.getServiceUrl());
		    	  resultPra1.add(nuevo);
		      }
		  }
		
		return resultPra1;
	}
}
