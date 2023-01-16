package com.Semillero2023.Practica1.Estructuras;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feed {
	private String title;
	private String competition;
	private String type;
	private String description;
	private String date;
	private String service;
	private String matchviewUrl;
	
	public Feed() {
		this.service = "API SCOREBAT";
		this.type = "Video";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompetition() {
		return competition;
	}
	public void setCompetition(String competition) {
		String[] temp = competition.split(": ");
		this.competition = temp[1];
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		String[] temp = date.split("T");
		this.date = temp[0];
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getMatchviewUrl() {
		return matchviewUrl;
	}
	public void setMatchviewUrl(String matchviewUrl) {
		this.matchviewUrl = matchviewUrl;
	}
	
	public String getTeam1() {
		String[] temp = title.split(" - ");
		return temp[0].toLowerCase();
	}
	
	public String getTeam2() {
		String[] temp = title.split(" - ");
		return temp[1].toLowerCase();
	}
	
	
}
