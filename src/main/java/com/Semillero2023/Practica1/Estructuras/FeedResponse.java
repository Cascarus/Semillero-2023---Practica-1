package com.Semillero2023.Practica1.Estructuras;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeedResponse {
	private List<Feed> response = new ArrayList<Feed>();

	public List<Feed> getResponse() {
		return response;
	}

	public void setResponse(List<Feed> response) {
		this.response = response;
	}
	
}
