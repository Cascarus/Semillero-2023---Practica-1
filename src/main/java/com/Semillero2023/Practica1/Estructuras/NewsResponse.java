package com.Semillero2023.Practica1.Estructuras;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsResponse {
	private String status;
	private int totalResults;
	private List<Article> articles = new ArrayList<Article>();
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	
}
