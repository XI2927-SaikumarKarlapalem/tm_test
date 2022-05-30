package com.example.customer;

import java.util.Map;
import java.util.UUID;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.account.account_created;
import com.example.customer.balance.balance;
import com.example.customer.repository.accounts;
import com.example.customer.repository.balances_cre;
import com.example.customer.repository.customer_created;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@RestController


public class demo_controller {
	@Autowired
	customer_created a;
	@Autowired
	accounts b;
	@Autowired
	balances_cre c;
	
	

	@PostMapping("/")
	public void display(@RequestBody customer input)
	{
		
		
		System.out.println(new Gson().toJson(input));   
		boolean isExists = a.existsByUuidIgnoreCase(input.getUuid());
        if (!isExists) {
        	if(input.getEvent_name().equals("client_creation"))
        	{
           
            a.save(input);
            
        }
		}
	}
		
		
	@PostMapping("/account")
	public void display_account(@RequestBody account_created input)
	{
		
		System.out.println(new Gson().toJson(input));   
		
		boolean isExists = b.existsByUuidIgnoreCase(input.getUuid());
        if (!isExists) {
        	if(input.getEvent_name().equals("account_creation"))
        	{
           
            b.save(input);
            
        }
		}
	}
		
	@PostMapping("/balance")
	public void display_balance(@RequestBody balance input)
	{
				System.out.println(new Gson().toJson(input)); 
				boolean isExists = c.existsByUuidIgnoreCase(input.getUuid());
		        if (!isExists) {
		        	if(input.getEvent_name().equals("Balance_Event"))
		        	{
		           
		            c.save(input);
		            
		        }
		        }
		}
		@GetMapping("/clients_list")
		public List<customer> clients_list(customer s)
		{
			return a.findAll();
			
		}
		@GetMapping("/accounts_list")
		public List<account_created> accounts_list(account_created s)
		{
			return b.findAll();
			
		}
		@GetMapping("/balance_event")
		public List<balance> client_list(balance s)
		{
			return c.findAll();
			
		}
	}
	

	
	

	
	
	


