package com.Semillero2023.Practica1.Estructuras;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
	@JsonProperty("title")
	private String title;
	@JsonProperty("type")
	private String type;
	@JsonProperty("description")
	private String description;
	private String publishedAt;
	@JsonProperty("service")
	private String service;
	@JsonProperty("url")
	private String url;
	
	public Article() {
		this.service = "API NEWSAPI";
		this.type = "Noticias";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishedAt() {
		return publishedAt;
	}
	public void setPublishedAt(String publishedAt) {
		String[] temp = publishedAt.split("T");
		this.publishedAt = temp[0];
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
