package com.Semillero2023.Practica1.Estructuras;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SongIOSResult {
	private int resultCount;
	private List<SongIOS> results = new ArrayList<SongIOS>();
	
	
	public int getResultCount() {
		return resultCount;
	}
	public void setResultCount(int resultCount) {
		this.resultCount = resultCount;
	}
	public List<SongIOS> getResults() {
		return results;
	}
	public void setResults(List<SongIOS> results) {
		this.results = results;
	}
	
}
