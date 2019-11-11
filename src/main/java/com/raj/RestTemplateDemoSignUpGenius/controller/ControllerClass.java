package com.raj.RestTemplateDemoSignUpGenius.controller;

import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;
import org.springframework.web.util.UriTemplate;

import com.raj.RestTemplateDemoSignUpGenius.pojo.Groups;

@RestController("/")
public class ControllerClass {
	
	@Value("${signupgenius.resturl}")
	public String signUpGeniusUrl;
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	   // Do any additional configuration here
	   return builder.build();
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@RequestMapping(path="/getGroupsData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getData1(@RequestParam String str) {
		UriTemplate uri = new UriTemplate(signUpGeniusUrl+"&sort={sort}") ;
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("body", header);
		Map<String,Object> uriVariables= new HashMap<>();
		uriVariables.put("sort", str);
		System.out.println(uri.expand(uriVariables).toString());
		//return restTemplate.getForEntity(uri.expand(uriVariables).toString(), String.class);
		return restTemplate.exchange(uri.expand(uriVariables).toString(), HttpMethod.GET, entity, String.class);
	}

}
