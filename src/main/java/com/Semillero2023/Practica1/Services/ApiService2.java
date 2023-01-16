package com.Semillero2023.Practica1.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Semillero2023.Practica1.Estructuras.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApiService2 {
	private String Api_ScoreBat = "https://www.scorebat.com/video-api/v3/feed/?token=NTAzODdfMTY3Mzc3MDI2MF9jNGFmZTgyNTFlZmNkNmZmNThjNGNiNDZjNmFiMGU2MjgyNGU1ZGU0"; // api
																																									// feed
	private String Api_News = "https://newsapi.org/v2/everything?q=";
	private String NEWS_KEY = "&apiKey=559d7b51dcc14540bc393c93b10774ca";
	private RestTemplate restTemplate = new RestTemplate();
	private ObjectMapper mapper = new ObjectMapper();

	public List<Api2Response1> getTeam(String team) throws JsonMappingException, JsonProcessingException {

		String contenido = restTemplate.getForObject(Api_ScoreBat, String.class);
		FeedResponse result = mapper.readValue(contenido, FeedResponse.class);

		contenido = restTemplate.getForObject(Api_News + team + NEWS_KEY, String.class);
		NewsResponse result2 = mapper.readValue(contenido, NewsResponse.class);

		List<Feed> tempA = result.getResponse();
		List<Article> tempB = result2.getArticles();
		List<Api2Response1> responseList = new ArrayList<Api2Response1>();

		for (int i = 0; i < tempA.size(); i++) {
			Feed temp2 = tempA.get(i);

			if (temp2.getTeam1().equals(team.replace("%20", " ").toLowerCase())
					|| temp2.getTeam2().equals(team.replace("%20", " ").toLowerCase())) {
				Api2Response1 nuevo = new Api2Response1(temp2.getTitle(), team.replace("%20", " "),
						temp2.getMatchviewUrl(), temp2.getType(), temp2.getDescription(), temp2.getDate(),
						temp2.getService(), false);
				responseList.add(nuevo);
			}
		}

		for (int i = 0; i < tempB.size(); i++) {
			Article temp = tempB.get(i);

			Api2Response1 nuevo = new Api2Response1(temp.getTitle(), team.replace("%20", " "), temp.getUrl(),
					temp.getType(), temp.getDescription(), temp.getPublishedAt(), temp.getService(), false);
			responseList.add(nuevo);

		}

		return responseList;
	}
	
	public List<Api2Response1> getLeague(String team) throws JsonMappingException, JsonProcessingException {

		String contenido = restTemplate.getForObject(Api_ScoreBat, String.class);
		FeedResponse result = mapper.readValue(contenido, FeedResponse.class);

		contenido = restTemplate.getForObject(Api_News + team + NEWS_KEY, String.class);
		NewsResponse result2 = mapper.readValue(contenido, NewsResponse.class);

		List<Feed> tempA = result.getResponse();
		List<Article> tempB = result2.getArticles();
		List<Api2Response1> responseList = new ArrayList<Api2Response1>();

		for (int i = 0; i < tempA.size(); i++) {
			Feed temp2 = tempA.get(i);

			if (temp2.getCompetition().toLowerCase().equals(team.replace("%20", " ").toLowerCase())) {
				Api2Response1 nuevo = new Api2Response1(temp2.getTitle(), team.replace("%20", " "),
						temp2.getMatchviewUrl(), temp2.getType(), temp2.getDescription(), temp2.getDate(),
						temp2.getService(), true);
				responseList.add(nuevo);
			}
		}

		for (int i = 0; i < tempB.size(); i++) {
			Article temp = tempB.get(i);

			Api2Response1 nuevo = new Api2Response1(temp.getTitle(), team.replace("%20", " "), temp.getUrl(),
					temp.getType(), temp.getDescription(), temp.getPublishedAt(), temp.getService(), true);
			responseList.add(nuevo);

		}

		return responseList;
	}

	public NewsResponse getLeague2(String team) throws JsonMappingException, JsonProcessingException {

		String contenido = restTemplate.getForObject(Api_News + team + NEWS_KEY, String.class);
		NewsResponse result2 = mapper.readValue(contenido, NewsResponse.class);

		return result2;
	}

	public FeedResponse getLeague3(String team) throws JsonMappingException, JsonProcessingException {

		String contenido = restTemplate.getForObject(Api_ScoreBat, String.class);
		FeedResponse result = mapper.readValue(contenido, FeedResponse.class);

		return result;
	}
}
