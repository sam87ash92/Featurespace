package com.featurespace.searchpost.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SearchController {
	
	@RequestMapping ("/")
	public String getPostcode() {
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> result = template.getForEntity("http://api.postcodes.io/postcodes/MK56LS", String.class);
		
		return result.getBody();
	}

}
