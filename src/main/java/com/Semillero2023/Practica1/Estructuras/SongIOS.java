package com.Semillero2023.Practica1.Estructuras;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SongIOS {
	@JsonProperty("artistName")
	private String name;
	@JsonProperty("trackName")
	private String trackName;
	@JsonProperty("wrapperType")
	private String type;
	@JsonProperty("service")
	private String service;
	@JsonProperty("artistViewUrl")
	private String serviceUrl;
	
	public SongIOS() {
		this.service = "API iTunes";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getServiceUrl() {
		return serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}
	
}