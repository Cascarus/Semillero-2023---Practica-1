package com.Semillero2023.Practica1.Estructuras;

public class Api2Response1 {
	private String title;
	private String team_league;
	private String url;
	private String type;
	private String description;
	private String date;
	private String service;
	private boolean league;

	public Api2Response1(String title, String team_league, String url, String type, String description, String date,
			String service, boolean league) {
		this.title = title;
		this.team_league = team_league;
		this.url = url;
		this.type = type;
		this.description = description;
		this.date = date;
		this.service = service;
		this.league = league;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTeam_league() {
		return team_league;
	}

	public void setTeam_league(String team_league) {
		this.team_league = team_league;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
		this.date = date;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public boolean getLeague() {
		return league;
	}

	public void setLeague(boolean league) {
		this.league = league;
	}

}
