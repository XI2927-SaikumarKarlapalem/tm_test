package com.example.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@SpringBootApplication


public class CallingExternalApiApplication {
	@Bean
	public RestTemplate getResttemplate()
	{
		return new RestTemplate();
	}
	

	

	public static void main(String[] args) {
		SpringApplication.run(CallingExternalApiApplication.class, args);
	}
	
	

}


