package com.example.customer;

import static java.lang.System.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Event;
import com.example.customer.model.Metadata;
import com.google.gson.Gson;

@RestController
@RequestMapping("/request")
public class demorequest {
	
	
	
	@PostMapping("/")
	public String getrequest()
	{
		return "succuss";
		 
	}

}
