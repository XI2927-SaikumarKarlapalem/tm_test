package com.example.customer.controller;

import java.io.IOException;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;




//@RestController
//@RequestMapping("/api")
public class rcon {
	@Autowired
	RestTemplate rt;
	private String result;
	
	
	public void getall() throws Throwable
	{
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.post("https://xebia.sandbox.mambu.com/api/v1/subscriptions")
		  .header("Accept", "application/vnd.mambu.v2+json")
		  .header("Content-Type", "application/json")
		  .header("apikey", "Ki45zkNjMcWxeWSPDleWwiwrYL8bvrn9")
		  .header("Cookie", "AWSALB=P2MDFMXXKBREl5fmgHEyXKs7dJ95nSipkKbQxehfziEmo5dJfNe7nUnFh4dObT8+Y5Xbi44MF5EIgDwYE1IhqPnzyqIXZLHFxVHnRJ4T83jRaxkm/w8FEYejqvbs; AWSALBCORS=P2MDFMXXKBREl5fmgHEyXKs7dJ95nSipkKbQxehfziEmo5dJfNe7nUnFh4dObT8+Y5Xbi44MF5EIgDwYE1IhqPnzyqIXZLHFxVHnRJ4T83jRaxkm/w8FEYejqvbs")
		  .body("\r\n    {\r\n    \"owning_application\": \"training-app\",\r\n    \"event_types\": [\"mrn.event.xebia.streamingapi.client_created\"]\r\n}\r\n")
		  .asString();

		System.out.println(response.getBody());



}
	
}
